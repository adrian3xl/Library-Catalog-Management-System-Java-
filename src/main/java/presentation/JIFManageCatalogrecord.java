/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import CrudManager.CatalogrecordManager;
import Domain.Author;
import Domain.Catalogrecord;
import Domain.Documenttype;
import Domain.Genre;
import Domain.Publisher;
import Service.JDBCImplement.JDBCMainConfiguration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adrian
 */

public class JIFManageCatalogrecord extends javax.swing.JInternalFrame {
 JDBCMainConfiguration jdbc = new JDBCMainConfiguration();
  
 /**
     * Creates new form JIFAddCatalogrecord
     */
 
 
combobox genre1=new combobox();
combobox doctypee=new combobox();
combobox publi=new combobox();
combobox aut=new combobox();

 HashMap<String,Integer> genresMap=genre1.getGenreMap();
  HashMap<String,Integer> pubMap=publi.getpubMap();
 HashMap<String,Integer>authMap=aut.getAuthMap();
  HashMap<String,Integer>docMap=doctypee.getDocMap();
  
    table catalogrec = new table();
    public JIFManageCatalogrecord() {
        initComponents();
        
     
         fillauthcombobox();   fillpubcombobox(); //genrecombobox();
         filldoctypecombobox(); 
     
        fillgenrecombobox();
        
        catalogrec.fillCatalogRecordJTable(record_table,"");
        
         try {
            jdbc.getConnection();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JIFManageCatalogloan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        title_tb = new javax.swing.JTextField();
        code_tb = new javax.swing.JTextField();
        authcombo1 = new javax.swing.JComboBox<>();
        pubcombo = new javax.swing.JComboBox<>();
        genrecombo = new javax.swing.JComboBox<>();
        doccombo = new javax.swing.JComboBox<>();
        idj = new javax.swing.JTextField();
        create_tb = new javax.swing.JButton();
        update_bt = new javax.swing.JButton();
        del_bt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        record_table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        findVal_box = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        condi_tb = new javax.swing.JTextArea();
        dateChooserCombo1 = new com.toedter.calendar.JDateChooser();
        auth_lb = new javax.swing.JLabel();
        pub_lb = new javax.swing.JLabel();
        gen_lb = new javax.swing.JLabel();
        doc_lb = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Catalog Record");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Title");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Author");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Publisher");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Genre");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Document Type");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Release Date");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Catalog Code");

        title_tb.setText(" ");

        code_tb.setText(" ");

        authcombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authcombo1ActionPerformed(evt);
            }
        });

        pubcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubcomboActionPerformed(evt);
            }
        });

        genrecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genrecomboActionPerformed(evt);
            }
        });

        doccombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doccomboActionPerformed(evt);
            }
        });

        idj.setText(" ");

        create_tb.setText("Create");
        create_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_tbActionPerformed(evt);
            }
        });

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

        record_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Title", "Genre", "Document Type", "Author", "Publisher", "Date Released", "Condition", "Catalog Code"
            }
        ));
        record_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                record_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(record_table);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Search");

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Condition ");

        condi_tb.setColumns(20);
        condi_tb.setRows(5);
        jScrollPane2.setViewportView(condi_tb);

        auth_lb.setText("ID");

        pub_lb.setText("ID");

        gen_lb.setText("ID");

        doc_lb.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(code_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(create_tb)
                                        .addGap(29, 29, 29)
                                        .addComponent(update_bt)
                                        .addGap(18, 18, 18)
                                        .addComponent(del_bt)))
                                .addGap(676, 676, 676))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pub_lb))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(gen_lb))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(idj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(auth_lb))
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(doc_lb)))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(authcombo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pubcombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(genrecombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(doccombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(title_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(findVal_box, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(idj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(auth_lb))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(pub_lb)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(authcombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pubcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genrecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(gen_lb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doccombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(doc_lb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(findVal_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(code_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update_bt)
                        .addComponent(del_bt))
                    .addComponent(create_tb))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void create_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_tbActionPerformed
  
    //    int id=Integer.parseInt(idj.getText().trim());
        String title=title_tb.getText().trim();
        //Integer genre_id=Integer.parseInt(gen_lb.getText());
       // Integer doc_id=Integer.parseInt(doc_lb.getText());
       // Integer author_id=Integer.parseInt(auth_lb.getText());
       // Integer pub_id=Integer.parseInt(pub_lb.getText());
        
        String conditionstatement=condi_tb.getText();
        String code=code_tb.getText().trim();
      
       
        Date releasedate=dateChooserCombo1.getDate();
     
 
        
     //  Catalogrecord anCatalogrecord=new Catalogrecord(title,releasedate,conditionstatement,code,genre_id,doc_id,author_id,pub_id);
  Catalogrecord anCatalogrecord=new Catalogrecord(title,releasedate,conditionstatement,code);

     
        CatalogrecordManager CatalogrecordMgr = new CatalogrecordManager();
       CatalogrecordMgr.addCatalogrecord(anCatalogrecord);

       
       
       
       
       
        record_table.setModel(new DefaultTableModel(null, new Object[]{"id", "Title", "Genre", "Document Type", "Author", "Publisher", "Date Released", "Condition","Catalog Code"}));
        catalogrec.fillCatalogRecordJTable(record_table,"");

        JOptionPane.showMessageDialog(rootPane, "Successful Save", "", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_create_tbActionPerformed

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed

        try{
            Catalogrecord anCatalogrecord=new Catalogrecord();
            String title=title_tb.getText().trim();
        Integer genre_id=Integer.parseInt(gen_lb.getText());
        Integer doc_id=Integer.parseInt(doc_lb.getText());
        Integer author_id=Integer.parseInt(auth_lb.getText());
        Integer pub_id=Integer.parseInt(pub_lb.getText());
        
        String conditionstatement=condi_tb.getText();
        String code=code_tb.getText().trim();
      
       
        Date releasedate=dateChooserCombo1.getDate();
           
           
           
           
            CatalogrecordManager CatalogrecordMgr=new CatalogrecordManager();
            CatalogrecordMgr.updateCatalogrecord(anCatalogrecord);

            record_table.setModel(new DefaultTableModel(null, new Object[]{"id", "Title", "Genre", "Document Type", "Author", "Publisher", "Date Released","Condition","Catalog Code"}));
          catalogrec.fillCatalogRecordJTable(record_table,"");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_update_btActionPerformed

    private void del_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btActionPerformed
        if(idj.getText()=="")
        {
            JOptionPane.showMessageDialog(rootPane, "No Catalogrecord Id selected", "", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(idj.getText()!="")
        {
            try{
                int CatalogrecordId=Integer.parseInt(idj.getText());
                CatalogrecordManager CatalogrecordMgr=new CatalogrecordManager();
                CatalogrecordMgr.deleteCatalogrecord(Catalogrecord.class, CatalogrecordId);
                JOptionPane.showMessageDialog(rootPane, "Catalogrecord Deleted", "", JOptionPane.INFORMATION_MESSAGE);

                record_table.setModel(new DefaultTableModel(null, new Object[]{"id", "Title", "Genre", "Document Type", "Author", "Publisher", "Date Released", "Condition","Catalog Code"}));
             catalogrec.fillCatalogRecordJTable(record_table,"");

            }
            catch(Exception ex)
            {
                ex.printStackTrace();
                // logger.error(ex.getMessage());
            }
        }
    }//GEN-LAST:event_del_btActionPerformed

    private void record_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_record_tableMouseClicked
        int rowIndex= record_table.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)record_table.getModel();
        idj.setText(model.getValueAt(rowIndex, 0).toString());
        title_tb.setText(model.getValueAt(rowIndex, 1).toString());
         gen_lb.setText(model.getValueAt(rowIndex, 2).toString());
        doc_lb.setText(model.getValueAt(rowIndex, 3).toString());
        auth_lb.setText(model.getValueAt(rowIndex, 4).toString());
        pub_lb.setText(model.getValueAt(rowIndex, 5).toString());
        
        Date releaseddate=null;
        try {
            releaseddate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 6).toString());
        } catch (ParseException ex) {
            Logger.getLogger(JIFManageCatalogrecord.class.getName()).log(Level.SEVERE, null, ex);
        }
         dateChooserCombo1.setDate(releaseddate);
        condi_tb.setText(model.getValueAt(rowIndex, 7).toString());
        code_tb.setText(model.getValueAt(rowIndex, 8).toString());
    }//GEN-LAST:event_record_tableMouseClicked

    private void findVal_boxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyPressed
       record_table.setModel(new DefaultTableModel(null, new Object[]{"id", "Title", "Genre", "Document Type", "Author", "Publisher", "Date Released", "Condition","Catalog Code"}));
        catalogrec.fillCatalogRecordJTable(record_table,"");
    }//GEN-LAST:event_findVal_boxKeyPressed

    private void findVal_boxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyReleased
       record_table.setModel(new DefaultTableModel(null, new Object[]{"id", "Title", "Genre", "Document Type", "Author", "Publisher", "Date Released", "Condition","Catalog Code"}));
        catalogrec.fillCatalogRecordJTable(record_table,"");
    }//GEN-LAST:event_findVal_boxKeyReleased

    private void findVal_boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyTyped
     record_table.setModel(new DefaultTableModel(null, new Object[]{"id", "Title", "Genre", "Document Type", "Author", "Publisher", "Date Released", "Condition","Catalog Code"}));
        catalogrec.fillCatalogRecordJTable(record_table,"");
    }//GEN-LAST:event_findVal_boxKeyTyped

    private void genrecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genrecomboActionPerformed
       
        
        try{
        
         int genre_id = genresMap.get(genrecombo.getSelectedItem().toString());
        gen_lb.setText(String.valueOf(genre_id));
        
        }catch(Exception ex){
        
        Logger.getLogger(JIFManageCatalogrecord.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }//GEN-LAST:event_genrecomboActionPerformed

    private void authcombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authcombo1ActionPerformed
        try{
        
         int aut_id = authMap.get(authcombo1.getSelectedItem().toString());
        auth_lb.setText(String.valueOf(aut_id));
        
        }catch(Exception ex){
        
        Logger.getLogger(JIFManageCatalogrecord.class.getName()).log(Level.SEVERE, null, ex);
    }           
    }//GEN-LAST:event_authcombo1ActionPerformed

    private void pubcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubcomboActionPerformed
        try{
        
         int pub_id = pubMap.get(pubcombo.getSelectedItem().toString());
        pub_lb.setText(String.valueOf(pub_id));
        
        }catch(Exception ex){
        
        Logger.getLogger(JIFManageCatalogrecord.class.getName()).log(Level.SEVERE, null, ex);
    }           
    }//GEN-LAST:event_pubcomboActionPerformed

    private void doccomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doccomboActionPerformed
       try{
        
         int doc_id = docMap.get(doccombo.getSelectedItem().toString());
        doc_lb.setText(String.valueOf(doc_id));
        
        }catch(Exception ex){
        
        Logger.getLogger(JIFManageCatalogrecord.class.getName()).log(Level.SEVERE, null, ex);
    }//GEN-LAST:event_doccomboActionPerformed

    }
    
    public void  fillauthcombobox(){
    
         for(String acode : authMap.keySet())
       {
   
   authcombo1.addItem(acode);
       }
    
    
    
    }           
     public void  fillpubcombobox(){
     
        for(String pcode : pubMap.keySet())
       {
   
   pubcombo.addItem(pcode);
       }
     
     
     }   
      public void filldoctypecombobox(){
      
           for(String doctypeName : docMap.keySet())
       {
   
   doccombo.addItem(doctypeName);
       }
      
      }   
   public void fillgenrecombobox(){
   
       for(String genreName : genresMap.keySet())
       {
   
   genrecombo.addItem(genreName);
       }
   }  
            

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel auth_lb;
    private javax.swing.JComboBox<String> authcombo1;
    private javax.swing.JTextField code_tb;
    private javax.swing.JTextArea condi_tb;
    private javax.swing.JButton create_tb;
    private com.toedter.calendar.JDateChooser dateChooserCombo1;
    private javax.swing.JButton del_bt;
    private javax.swing.JLabel doc_lb;
    private javax.swing.JComboBox<String> doccombo;
    private javax.swing.JTextField findVal_box;
    private javax.swing.JLabel gen_lb;
    private javax.swing.JComboBox<String> genrecombo;
    private javax.swing.JTextField idj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pub_lb;
    private javax.swing.JComboBox<String> pubcombo;
    public static javax.swing.JTable record_table;
    private javax.swing.JTextField title_tb;
    private javax.swing.JButton update_bt;
    // End of variables declaration//GEN-END:variables
}
