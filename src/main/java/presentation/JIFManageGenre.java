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

/**
 *
 * @author Adrian
 */
public class JIFManageGenre extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFManageGenre
     */
    
    
    table Genre=new table();
    public JIFManageGenre() {
        initComponents();
        
         Genre.fillGenreJTable(Genre_table, "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Genre_table = new javax.swing.JTable();
        nameJtf1 = new javax.swing.JTextField();
        update_bt = new javax.swing.JButton();
        del_bt = new javax.swing.JButton();
        createjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        findVal_box = new javax.swing.JTextField();
        idj = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        Genre_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name"
            }
        ));
        Genre_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Genre_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Genre_table);

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
        jLabel6.setText("Manage Genre");

        jLabel2.setText(" Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
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
                                    .addComponent(idj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
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
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6)
                        .addGap(62, 62, 62)
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
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Genre_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Genre_tableMouseClicked
        int rowIndex= Genre_table.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)Genre_table.getModel();
        idj.setText(model.getValueAt(rowIndex, 0).toString());
        nameJtf1.setText(model.getValueAt(rowIndex, 1).toString());
       
    }//GEN-LAST:event_Genre_tableMouseClicked

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed

        try{
            Genre theGenre=new Genre();
            theGenre.setId(Integer.parseInt(idj.getText()));
            theGenre.setName(nameJtf1.getText());

            GenreManager GenreMgr=new GenreManager();
            GenreMgr.updateGenre(theGenre);

            Genre_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
            Genre.fillGenreJTable(Genre_table,"");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_update_btActionPerformed

    private void del_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btActionPerformed
        if(idj.getText()=="")
        {
            JOptionPane.showMessageDialog(rootPane, "No Genre Id selected", "", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(idj.getText()!="")
        {
            try{
                int GenreId=Integer.parseInt(idj.getText());
                GenreManager GenreMgr=new GenreManager();
                GenreMgr.deleteGenre(Genre.class, GenreId);
                JOptionPane.showMessageDialog(rootPane, "Genre Deleted", "", JOptionPane.INFORMATION_MESSAGE);

                Genre_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
                Genre.fillGenreJTable(Genre_table,"");

            }
            catch(Exception ex)
            {
                ex.printStackTrace();
                //  logger.error(ex.getMessage());
            }
        }
    }//GEN-LAST:event_del_btActionPerformed

    private void createjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButton1ActionPerformed

     //   int id=Integer.parseInt(idj.getText().trim());
        String name=nameJtf1.getText().trim();
        Genre anGenre=new Genre(name);

        GenreManager pubMgr = new GenreManager();
        pubMgr.addGenre(anGenre);
        JOptionPane.showMessageDialog(rootPane, "Successful Save", "", JOptionPane.INFORMATION_MESSAGE);

        Genre_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
        Genre.fillGenreJTable(Genre_table,"");
    }//GEN-LAST:event_createjButton1ActionPerformed

    private void findVal_boxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyPressed
          Genre_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
        Genre.fillGenreJTable(Genre_table, findVal_box.getText());
    }//GEN-LAST:event_findVal_boxKeyPressed

    private void findVal_boxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyReleased
         Genre_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
        Genre.fillGenreJTable(Genre_table, findVal_box.getText().trim());
    }//GEN-LAST:event_findVal_boxKeyReleased

    private void findVal_boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyTyped

          Genre_table.setModel(new DefaultTableModel(null, new Object[]{"id","Name"}));
       Genre.fillGenreJTable(Genre_table, findVal_box.getText());
    }//GEN-LAST:event_findVal_boxKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Genre_table;
    private javax.swing.JButton createjButton1;
    private javax.swing.JButton del_bt;
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
