/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import CrudManager.DocumenttypeManager;
import CrudManager.GenreManager;
import Domain.Documenttype;
import Domain.Genre;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.dom4j.DocumentType;

/**
 *
 * @author Adrian
 */
public class JIFManageDocType extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFAddGenre
     */
    
    table Doc__Type = new table();
    
    public JIFManageDocType() {
        initComponents();
        
        Doc__Type.fillDocTypeJTable(doctype_table,"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctype_table = new javax.swing.JTable();
        nameJtf1 = new javax.swing.JTextField();
        update_bt = new javax.swing.JButton();
        del_bt = new javax.swing.JButton();
        createjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        findVal_box = new javax.swing.JTextField();
        idj = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);

        jLabel2.setText(" Name");

        doctype_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name"
            }
        ));
        doctype_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctype_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(doctype_table);

        nameJtf1.setText(" ");

        update_bt.setText("Update");
        update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btActionPerformed(evt);
            }
        });

        del_bt.setText("Delete");
        del_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btActionPerformed(evt);
            }
        });

        createjButton1.setText("ADD");
        createjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Search");

        findVal_box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                findVal_boxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                findVal_boxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                findVal_boxKeyTyped(evt);
            }
        });

        idj.setText(" ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Manage Document Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(createjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(update_bt)
                            .addGap(18, 18, 18)
                            .addComponent(del_bt))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(nameJtf1))
                                .addComponent(idj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(findVal_box, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(findVal_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6)
                        .addGap(69, 69, 69)
                        .addComponent(idj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameJtf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createjButton1)
                            .addComponent(update_bt)
                            .addComponent(del_bt))))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctype_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctype_tableMouseClicked
        int rowIndex= doctype_table.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)doctype_table.getModel();
        idj.setText(model.getValueAt(rowIndex, 0).toString());
        nameJtf1.setText(model.getValueAt(rowIndex, 1).toString());

    }//GEN-LAST:event_doctype_tableMouseClicked

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed

        try{
            Documenttype theDocumentType= new Documenttype();
            theDocumentType.setId(Integer.parseInt(idj.getText()));
            theDocumentType.setName(nameJtf1.getText());

            DocumenttypeManager DocumentTypeMgr=new DocumenttypeManager();
            DocumentTypeMgr.updateDocumenttype(theDocumentType,"HIBER11");

            doctype_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
            Doc__Type.fillDocTypeJTable(doctype_table,"");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_update_btActionPerformed

    private void del_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btActionPerformed
        if(idj.getText()=="")
        {
            JOptionPane.showMessageDialog(rootPane, "No doctype Id selected", "", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(idj.getText()!="")
        {
            try{
                int doctypeId=Integer.parseInt(idj.getText());
                DocumenttypeManager DocumenttypeMgr=new DocumenttypeManager();
                DocumenttypeMgr.deleteDocumenttype(Documenttype.class, doctypeId,"HIBER11");
                JOptionPane.showMessageDialog(rootPane, "Documenttype Deleted", "", JOptionPane.INFORMATION_MESSAGE);

                doctype_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
               Doc__Type.fillDocTypeJTable(doctype_table, "");
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
                //  logger.error(ex.getMessage());
            }
        }
    }//GEN-LAST:event_del_btActionPerformed

    private void createjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButton1ActionPerformed

       // int id=Integer.parseInt(idj.getText().trim());
        String name=nameJtf1.getText().trim();
        Documenttype anDocumenttype=new Documenttype(name);

        DocumenttypeManager DocumenttypeMgr = new DocumenttypeManager();
        DocumenttypeMgr.addDocumenttype(anDocumenttype,"HIBER11");
        JOptionPane.showMessageDialog(rootPane, "Successful Save", "", JOptionPane.INFORMATION_MESSAGE);

        doctype_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
        Doc__Type.fillDocTypeJTable(doctype_table, "");
    }//GEN-LAST:event_createjButton1ActionPerformed

    private void findVal_boxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyPressed
             doctype_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
         Doc__Type.fillDocTypeJTable(doctype_table, "");
    }//GEN-LAST:event_findVal_boxKeyPressed

    private void findVal_boxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyReleased
        doctype_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
       Doc__Type.fillDocTypeJTable(doctype_table, "");
    }//GEN-LAST:event_findVal_boxKeyReleased

    private void findVal_boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyTyped

        doctype_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
         Doc__Type.fillDocTypeJTable(doctype_table, "");
    }//GEN-LAST:event_findVal_boxKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createjButton1;
    private javax.swing.JButton del_bt;
    public static javax.swing.JTable doctype_table;
    private javax.swing.JTextField findVal_box;
    private javax.swing.JTextField idj;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJtf1;
    private javax.swing.JButton update_bt;
    // End of variables declaration//GEN-END:variables
}
