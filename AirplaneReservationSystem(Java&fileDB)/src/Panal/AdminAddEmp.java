/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panal;

import Classes.Admin;
import Classes.Manager_Tools;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ATHER
 */
public class AdminAddEmp extends javax.swing.JPanel {

    /**
     * Creates new form AdminAddEmp
     */
    public AdminAddEmp() {
        initComponents();
        btnGroup.add(rdoMale);
        btnGroup.add(rdoFemale);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassWord = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxQualification = new javax.swing.JComboBox<>();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        dcDateofbirth = new com.toedter.calendar.JDateChooser();
        dcDateofjoin = new com.toedter.calendar.JDateChooser();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(32, 47, 90));
        setMaximumSize(new java.awt.Dimension(870, 376));
        setMinimumSize(new java.awt.Dimension(870, 376));
        setPreferredSize(new java.awt.Dimension(870, 376));

        txtId.setBackground(new java.awt.Color(32, 47, 90));
        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(204, 204, 204));
        txtId.setBorder(null);

        txtName.setBackground(new java.awt.Color(32, 47, 90));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(204, 204, 204));
        txtName.setBorder(null);

        txtAdress.setBackground(new java.awt.Color(32, 47, 90));
        txtAdress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAdress.setForeground(new java.awt.Color(204, 204, 204));
        txtAdress.setBorder(null);

        txtPhone.setBackground(new java.awt.Color(32, 47, 90));
        txtPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(204, 204, 204));
        txtPhone.setBorder(null);

        txtUserName.setBackground(new java.awt.Color(32, 47, 90));
        txtUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(204, 204, 204));
        txtUserName.setBorder(null);

        txtPassWord.setBackground(new java.awt.Color(32, 47, 90));
        txtPassWord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassWord.setForeground(new java.awt.Color(204, 204, 204));
        txtPassWord.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Phone");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("UserName");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("PassWord");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Qualification");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Date of birth");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Date of join");

        cbxQualification.setBackground(new java.awt.Color(32, 47, 90));
        cbxQualification.setForeground(new java.awt.Color(204, 204, 204));
        cbxQualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fresh graduate", "Experience", "Student" }));

        rdoMale.setBackground(new java.awt.Color(32, 47, 90));
        rdoMale.setForeground(new java.awt.Color(204, 204, 204));
        rdoMale.setText("Male");

        rdoFemale.setBackground(new java.awt.Color(32, 47, 90));
        rdoFemale.setForeground(new java.awt.Color(204, 204, 204));
        rdoFemale.setText("Female");

        dcDateofbirth.setBackground(new java.awt.Color(32, 47, 90));
        dcDateofbirth.setForeground(new java.awt.Color(204, 204, 204));

        dcDateofjoin.setBackground(new java.awt.Color(32, 47, 90));
        dcDateofjoin.setForeground(new java.awt.Color(204, 204, 204));

        btnAdd.setBackground(new java.awt.Color(32, 47, 90));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(32, 47, 90));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdoMale, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(rdoFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcDateofjoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcDateofbirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxQualification, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(cbxQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(rdoMale)
                            .addComponent(rdoFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)))
                    .addComponent(dcDateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)))
                    .addComponent(dcDateofjoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnAdd))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    protected void reset(){
        new Manager_Tools().clear_text(this);
        btnGroup.clearSelection();        
        txtId.requestFocus();
        
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        if(rdoMale.isSelected()){
            
            new Admin().Add_Employee(txtName.getText() , "Male" , txtAdress.getText(),
                String.valueOf( f.format( dcDateofbirth.getDate() ) ),
                cbxQualification.getSelectedItem().toString(),
                txtPhone.getText(),String.valueOf( f.format( dcDateofjoin.getDate() ) ),
                txtUserName.getText() ,txtPassWord.getText() , txtId.getText());
                    JOptionPane.showMessageDialog(null, "Process Success");
                    reset();            
        }
        else{
            
            new Admin().Add_Employee(txtName.getText() , "FMale" , txtAdress.getText(),
                String.valueOf( f.format( dcDateofbirth.getDate() ) ),
                cbxQualification.getSelectedItem().toString(),
                txtPhone.getText(),String.valueOf( f.format( dcDateofjoin.getDate() ) ),
                txtUserName.getText() ,txtPassWord.getText() , txtId.getText());
                    JOptionPane.showMessageDialog(null, "Process Success");
                    reset();
                    
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbxQualification;
    private com.toedter.calendar.JDateChooser dcDateofbirth;
    private com.toedter.calendar.JDateChooser dcDateofjoin;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}