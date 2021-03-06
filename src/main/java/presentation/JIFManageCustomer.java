/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import CrudManager.CustomerManager;
import Domain.Customer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adrian
 */
public class JIFManageCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFAddCustomer
     */
    
  table  customer=new table();
    public JIFManageCustomer() {
        initComponents();
        customer.fillCustomerJTable(customer_table, "");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname_tb = new javax.swing.JTextField();
        lname_tb = new javax.swing.JTextField();
        cellnumber_tb = new javax.swing.JTextField();
        address_tb = new javax.swing.JTextField();
        code_tb = new javax.swing.JTextField();
        create_tb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        idj = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        findVal_box = new javax.swing.JTextField();
        update_bt = new javax.swing.JButton();
        del_bt = new javax.swing.JButton();

        setClosable(true);

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Phone Number");

        jLabel5.setText("Address");

        jLabel6.setText("Customer ID/TRN");

        fname_tb.setText(" ");

        lname_tb.setText(" ");

        cellnumber_tb.setText(" ");

        address_tb.setText(" ");

        code_tb.setText(" ");

        create_tb.setText("Create");
        create_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_tbActionPerformed(evt);
            }
        });

        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "First Name", "Last Name", "Phone Number", "Address", "Customer Code"
            }
        ));
        customer_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customer_table);

        idj.setText(" ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Customer");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Search");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(findVal_box, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(idj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fname_tb)
                                    .addComponent(lname_tb)
                                    .addComponent(cellnumber_tb)
                                    .addComponent(address_tb)
                                    .addComponent(code_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(create_tb)
                        .addGap(29, 29, 29)
                        .addComponent(update_bt)
                        .addGap(18, 18, 18)
                        .addComponent(del_bt)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(idj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(findVal_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fname_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lname_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cellnumber_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(address_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(code_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update_bt)
                        .addComponent(del_bt))
                    .addComponent(create_tb))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void create_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_tbActionPerformed
       
        String fname=fname_tb.getText().trim();
        String lname=lname_tb.getText().trim();
       String phonenumber=cellnumber_tb.getText().trim();
        String address=address_tb.getText().trim();
         String customercode=code_tb.getText().trim();
       //  int id=Integer.parseInt(idj.getText().trim());
         Customer anCustomer=new Customer(fname,lname,phonenumber,address,customercode);
      
        CustomerManager CustomerMgr = new CustomerManager();
        CustomerMgr.addCustomer(anCustomer);
        
        
         customer_table.setModel(new DefaultTableModel(null, new Object[]{"id", "First Name", "Last Name", "Phone Number", "Address", "Customer Code"}));
            customer.fillCustomerJTable(customer_table,"");
        
         JOptionPane.showMessageDialog(rootPane, "Successful Save", "", JOptionPane.INFORMATION_MESSAGE);
                                
        
        
        
    }//GEN-LAST:event_create_tbActionPerformed

    private void customer_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_tableMouseClicked
        int rowIndex= customer_table.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)customer_table.getModel();
        idj.setText(model.getValueAt(rowIndex, 0).toString());
        fname_tb.setText(model.getValueAt(rowIndex, 1).toString());
        lname_tb.setText(model.getValueAt(rowIndex, 2).toString());
        cellnumber_tb.setText(model.getValueAt(rowIndex, 3).toString());
         address_tb.setText(model.getValueAt(rowIndex, 4).toString());  
        code_tb.setText(model.getValueAt(rowIndex, 5).toString());
    }//GEN-LAST:event_customer_tableMouseClicked

    private void findVal_boxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyPressed
        customer_table.setModel(new DefaultTableModel(null, new Object[]{"id", "First Name", "Last Name", "Phone Number", "Address", "Customer Code"}));
       customer.fillCustomerJTable(customer_table, findVal_box.getText());
    }//GEN-LAST:event_findVal_boxKeyPressed

    private void findVal_boxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyReleased
        customer_table.setModel(new DefaultTableModel(null, new Object[]{"id", "First Name", "Last Name", "Phone Number", "Address", "Customer Code"}));
         customer.fillCustomerJTable(customer_table, findVal_box.getText().trim());
    }//GEN-LAST:event_findVal_boxKeyReleased

    private void findVal_boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findVal_boxKeyTyped

        customer_table.setModel(new DefaultTableModel(null, new Object[]{"id", "First Name", "Last Name", "Phone Number", "Address", "Customer Code"}));
         customer.fillCustomerJTable(customer_table, findVal_box.getText());
    }//GEN-LAST:event_findVal_boxKeyTyped

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed

        try{
            Customer anCustomer=new Customer();
            anCustomer.setId(Integer.parseInt(idj.getText()));
            anCustomer.setFname(fname_tb.getText());
            anCustomer.setLname(lname_tb.getText());
           anCustomer.setPhonenumber(cellnumber_tb.getText());
            anCustomer.setAddress(address_tb.getText());
           anCustomer.setCustomercode(code_tb.getText());

            CustomerManager CustomerMgr=new CustomerManager();
            CustomerMgr.updateCustomer(anCustomer);

            customer_table.setModel(new DefaultTableModel(null, new Object[]{"id", "First Name", "Last Name", "Phone Number", "Address", "Customer Code"}));
            customer.fillCustomerJTable(customer_table,"");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_update_btActionPerformed

    private void del_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btActionPerformed
        if(idj.getText()=="")
        {
            JOptionPane.showMessageDialog(rootPane, "No Customer Id selected", "", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(idj.getText()!="")
        {
            try{
                int CustomerId=Integer.parseInt(idj.getText());
                CustomerManager CustomerMgr=new CustomerManager();
                CustomerMgr.deleteCustomer(Customer.class, CustomerId);
                JOptionPane.showMessageDialog(rootPane, "Customer Deleted", "", JOptionPane.INFORMATION_MESSAGE);

                customer_table.setModel(new DefaultTableModel(null, new Object[]{"id", "First Name", "Last Name", "Phone Number", "Address", "Customer Code"}));
                customer.fillCustomerJTable(customer_table,"");

            }
            catch(Exception ex)
            {
                ex.printStackTrace();
               // logger.error(ex.getMessage());
            }
        }
    }//GEN-LAST:event_del_btActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_tb;
    private javax.swing.JTextField cellnumber_tb;
    private javax.swing.JTextField code_tb;
    private javax.swing.JButton create_tb;
    public static javax.swing.JTable customer_table;
    private javax.swing.JButton del_bt;
    private javax.swing.JTextField findVal_box;
    private javax.swing.JTextField fname_tb;
    private javax.swing.JTextField idj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname_tb;
    private javax.swing.JButton update_bt;
    // End of variables declaration//GEN-END:variables
}
