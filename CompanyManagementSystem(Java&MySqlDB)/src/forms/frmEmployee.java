/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Entity.Department;
import Entity.Employee;
import Entity.Employee_phones;
import company_sql.tools;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class frmEmployee extends javax.swing.JFrame {

    /**
     * Creates new form frmEmployee
     */
    public frmEmployee() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmpNo = new controls.Custom_JTextBox(15);
        txtEmpName = new controls.Custom_JTextBox(15);
        txtAddress = new controls.Custom_JTextBox(15);
        txtSalary = new controls.Custom_JTextBox(15);
        txtHiringDate = new com.toedter.calendar.JDateChooser();
        txtBirthDate = new com.toedter.calendar.JDateChooser();
        cbxDept = new controls.JMyCombo();
        btnAdd = new controls.JMyButton();
        btnUpdate = new controls.JMyButton();
        btnDelete = new controls.JMyButton();
        btnFind = new controls.JMyButton();
        btnAll = new controls.JMyButton();
        btnClear = new controls.JMyButton();
        btnBack = new controls.JMyButton();
        jLabel9 = new javax.swing.JLabel();
        rdoNumber = new javax.swing.JRadioButton();
        rdoName = new javax.swing.JRadioButton();
        rdoAddress = new javax.swing.JRadioButton();
        rdoSalary = new javax.swing.JRadioButton();
        rdoHiring = new javax.swing.JRadioButton();
        rdoBirth = new javax.swing.JRadioButton();
        rdoDept = new javax.swing.JRadioButton();
        txtSearch = new controls.Custom_JTextBox(15);
        btnSearch = new controls.JMyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        btnAddDept = new controls.JMyButton();
        jLabel10 = new javax.swing.JLabel();
        txtPhone = new controls.Custom_JTextBox(15);
        btnAddPhone = new controls.JMyButton();
        btnRemovePhones = new controls.JMyButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhones = new javax.swing.JTable();
        rdoPhone = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Employee Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Salary:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Hiring Date:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Birth Date:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Department:");

        txtEmpNo.setEditable(false);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnAll.setText("All");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Search By:");

        rdoNumber.setBackground(new java.awt.Color(255, 255, 255));
        rdoNumber.setSelected(true);
        rdoNumber.setText("Number");

        rdoName.setBackground(new java.awt.Color(255, 255, 255));
        rdoName.setText("Name");

        rdoAddress.setBackground(new java.awt.Color(255, 255, 255));
        rdoAddress.setText("Address");

        rdoSalary.setBackground(new java.awt.Color(255, 255, 255));
        rdoSalary.setText("Salary");

        rdoHiring.setBackground(new java.awt.Color(255, 255, 255));
        rdoHiring.setText("Hiring");

        rdoBirth.setBackground(new java.awt.Color(255, 255, 255));
        rdoBirth.setText("Birth");

        rdoDept.setBackground(new java.awt.Color(255, 255, 255));
        rdoDept.setText("Department");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Name", "Adress", "Salary", "Hiring Date", "Date Of Birth", "NO", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmp);

        btnAddDept.setText("+");
        btnAddDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeptActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Phones:");

        btnAddPhone.setText("Add");
        btnAddPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhoneActionPerformed(evt);
            }
        });

        btnRemovePhones.setText("Remove");
        btnRemovePhones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePhonesActionPerformed(evt);
            }
        });

        tblPhones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPhones);

        rdoPhone.setBackground(new java.awt.Color(255, 255, 255));
        rdoPhone.setText("Phone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHiringDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpNo)
                            .addComponent(txtSalary, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddress)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxDept, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(btnAddDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAddPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(btnRemovePhones, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPhone))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoSalary)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoHiring)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoBirth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoDept)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtHiringDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(btnAddDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemovePhones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(rdoNumber)
                            .addComponent(rdoName)
                            .addComponent(rdoAddress)
                            .addComponent(rdoSalary)
                            .addComponent(rdoHiring)
                            .addComponent(rdoBirth)
                            .addComponent(rdoDept)
                            .addComponent(rdoPhone))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnGroup.add(rdoNumber);
        btnGroup.add(rdoName);
        btnGroup.add(rdoAddress);
        btnGroup.add(rdoSalary);
        btnGroup.add(rdoHiring);
        btnGroup.add(rdoBirth);
        btnGroup.add(rdoDept);
        btnGroup.add(rdoPhone);
        
        db.go.fillCombo("Department", "DeptName", cbxDept);
        
        emp.getAllRows(tblEmp);
        
        clearData();
        
        tblEmp.getTableHeader().setReorderingAllowed(false); // to not move column
        tblPhones.getTableHeader().setReorderingAllowed(false);
    }//GEN-LAST:event_formWindowOpened
    
    Department dept = new Department();
    Employee emp = new Employee();
    
    private void btnAddDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeptActionPerformed
        int DeptNo = Integer.parseInt(dept.getAutoNumber());
        String DeptName = (String)tools.input("Enter Department Name");
        String Location = (String)tools.input("Enter Location");
        
        dept.setDeptNO(DeptNo);
        dept.setDeptName(DeptName);
        dept.setLocation(Location);
        dept.add();
        
        db.go.fillCombo("department", "DeptName", cbxDept);
    }//GEN-LAST:event_btnAddDeptActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        tools.open_form(new frmMain());
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void clearData(){
        tools.clear_text(this);
        txtEmpNo.setText(emp.getAutoNumber());
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        removePhone(); // to clear phones table that do in button remove
        txtEmpName.requestFocus();
    }
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearData();
    }//GEN-LAST:event_btnClearActionPerformed
    
    private void setValues(){
        emp.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        emp.setEmpName(txtEmpName.getText());
        emp.setAddress(txtAddress.getText());
        emp.setSalary(Double.parseDouble(txtSalary.getText()));
        
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String HDate = String.valueOf( f.format( txtHiringDate.getDate() ) );
        String BDate = String.valueOf( f.format( txtBirthDate.getDate() ) );
        
        emp.setHiringDate(HDate);
        emp.setBirthDate(BDate);
        
        String dName = cbxDept.getSelectedItem().toString();
        String dNO = dept.getValueByName(dName);
        
        emp.setDeptNo(Integer.parseInt(dNO));
    }
    
    Employee_phones phones = new Employee_phones();
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setValues();
        emp.add();
        
        // add phones
        phones.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        for(int x=0; x<tblPhones.getRowCount() ;x++){
            phones.setPhone(tblPhones.getValueAt(x, 0).toString());
            phones.add();
        }
        //
        
        clearData();
        emp.getAllRows(tblEmp);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        setValues();
        emp.update();
        
        //
        phones.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        // delete phones
        phones.deleteByEmp();
        //add phones
        for(int x=0; x<tblPhones.getRowCount() ;x++){
            phones.setPhone(tblPhones.getValueAt(x, 0).toString());
            phones.add();
        }
        //
        
        clearData();
        emp.getAllRows(tblEmp);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(tools.confirmMsg("Do you want to delete??")){
        
        
        //
        phones.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        // delete phones
        phones.deleteByEmp();
        
        setValues();
        emp.delete();
        //
        
        clearData();
        emp.getAllRows(tblEmp);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String EmpNo = (String)tools.input("Enter employee number");
        int ENO = Integer.parseInt(EmpNo);
        emp.setEmpNo(ENO);
        emp.getOneRow(tblEmp);
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        emp.getAllRows(tblEmp);
    }//GEN-LAST:event_btnAllActionPerformed

    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        // in event 
        try{
            int row = tblEmp.getSelectedRow();
            txtEmpNo.setText(tblEmp.getValueAt(row, 0).toString());
            txtEmpName.setText(tblEmp.getValueAt(row, 1).toString());
            txtAddress.setText(tblEmp.getValueAt(row, 2).toString());
            txtSalary.setText(tblEmp.getValueAt(row, 3).toString());
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date dateH = sdf.parse(tblEmp.getValueAt(row, 4).toString());
            Date dateB = sdf.parse(tblEmp.getValueAt(row, 5).toString());
            
            txtHiringDate.setDate(dateH);
            txtBirthDate.setDate(dateB);
            
            cbxDept.setSelectedItem(tblEmp.getValueAt(row, 7));
            
            phones.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
            phones.getAllRows(tblPhones);
            
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        }
        catch(Exception ex){
            tools.msg(ex.getMessage());
        }
    }//GEN-LAST:event_tblEmpMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String strSearch = "select * from employee_data where ";
        if(rdoNumber.isSelected()){
            strSearch += "Number like '%"+ txtSearch.getText()+"%'";
        }
        else if(rdoName.isSelected()){
            strSearch += "Name like '%"+ txtSearch.getText()+"%'";
        }
        else if(rdoAddress.isSelected()){
            strSearch += "address like '%"+ txtSearch.getText()+"%'";
        }
        else if(rdoSalary.isSelected()){
            strSearch += "salary like '%"+ txtSearch.getText()+"%'";
        }
        else if(rdoHiring.isSelected()){
            strSearch += "Hiring_Date like '%"+ txtSearch.getText()+"%'";
        }
        else if(rdoBirth.isSelected()){
            strSearch += "Date_of_Birth like '%"+ txtSearch.getText()+"%'";
        }
        else if (rdoDept.isSelected()){
            strSearch += "Department_NO like '%"+ txtSearch.getText()+"%'"
                    + " or Department like '%"+ txtSearch.getText()+"%'";
        }
        else{
            String strEmpNum = phones.getEmpNoByPhone(txtSearch.getText());
            strSearch += "Number like '%"+ strEmpNum +"%'";
        }
        
        emp.getCustomRows(strSearch, tblEmp);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhoneActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblPhones.getModel();
        model.addRow(new Object[]{txtPhone.getText()});
        txtPhone.setText("");
        txtPhone.requestFocus();
    }//GEN-LAST:event_btnAddPhoneActionPerformed

    private void removePhone(){
        DefaultTableModel model = (DefaultTableModel)tblPhones.getModel();
        model.setNumRows(0);
    }
    
    private void btnRemovePhonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePhonesActionPerformed
        removePhone();
    }//GEN-LAST:event_btnRemovePhonesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controls.JMyButton btnAdd;
    private controls.JMyButton btnAddDept;
    private controls.JMyButton btnAddPhone;
    private controls.JMyButton btnAll;
    private controls.JMyButton btnBack;
    private controls.JMyButton btnClear;
    private controls.JMyButton btnDelete;
    private controls.JMyButton btnFind;
    private javax.swing.ButtonGroup btnGroup;
    private controls.JMyButton btnRemovePhones;
    private controls.JMyButton btnSearch;
    private controls.JMyButton btnUpdate;
    private controls.JMyCombo cbxDept;
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
    private javax.swing.JRadioButton rdoAddress;
    private javax.swing.JRadioButton rdoBirth;
    private javax.swing.JRadioButton rdoDept;
    private javax.swing.JRadioButton rdoHiring;
    private javax.swing.JRadioButton rdoName;
    private javax.swing.JRadioButton rdoNumber;
    private javax.swing.JRadioButton rdoPhone;
    private javax.swing.JRadioButton rdoSalary;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTable tblPhones;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtBirthDate;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpNo;
    private com.toedter.calendar.JDateChooser txtHiringDate;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
