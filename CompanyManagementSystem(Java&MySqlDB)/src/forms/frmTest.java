/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Entity.Department;
import Entity.Employee;
import Entity.Employee_phones;
import Entity.Project;
import Entity.WorkOn;
import company_sql.tools;

/**
 *
 * @author pc
 */
public class frmTest extends javax.swing.JFrame {

    /**
     * Creates new form frmTest
     */
    public frmTest() {
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

        testdept = new controls.JMyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTest = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTest1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnTestEmp = new controls.JMyButton();
        btnTestPhones = new controls.JMyButton();
        btnTestProject = new controls.JMyButton();
        btnTestWorkOn = new controls.JMyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        testdept.setText("TestDepartment");
        testdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testdeptActionPerformed(evt);
            }
        });

        tblTest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTest);

        tblTest1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTest1);

        jButton1.setText("confirmMsg");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTestEmp.setText("TestEmployee");
        btnTestEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestEmpActionPerformed(evt);
            }
        });

        btnTestPhones.setText("Test phones");
        btnTestPhones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestPhonesActionPerformed(evt);
            }
        });

        btnTestProject.setText("Test Project");
        btnTestProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestProjectActionPerformed(evt);
            }
        });

        btnTestWorkOn.setText("Test WorkOn");
        btnTestWorkOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestWorkOnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnTestEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(testdept, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnTestWorkOn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTestProject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTestPhones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(testdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTestEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTestPhones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTestProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTestWorkOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void testdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testdeptActionPerformed
        //Department dept = new Department();
        //dept.setDeptNO(4);
        //dept.setDeptName("iiS");
        //dept.setLocation("Giza");
        //dept.add();
        //dept.getAllRows(tblTest);
        //tools.msg(dept.getAutoNumber());
        //dept.getCustomRows("select * from department", tblTest);
        //dept.getOneRow(tblTest);
        //tools.msg(dept.getValueByName("iis"));
        //tools.msg(dept.getNameByValue("2"));
    }//GEN-LAST:event_testdeptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean confirm = tools.confirmMsg("aaaaa?");
        if (confirm) tools.msg("yes");
        else tools.msg("other");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTestEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestEmpActionPerformed
        //Employee emp = new Employee();
        
        //emp.setEmpNo(1);
        //emp.setEmpName("Zakarya");
        //emp.setAddress("Tagamo3 City");
        //emp.setSalary(2100.00);
        //emp.setHiringDate("2000-5-5");
        //emp.setBirthDate("1950-3-3");
        //emp.setDeptNo(1);
        
        //emp.add();
        //emp.getAllRows(tblTest);
        //tools.msg(emp.getAutoNumber());
        //emp.getCustomRows("select * from employee_data", tblTest);
        //tools.msg(emp.getValueByName("amer"));
        //emp.getOneRow(tblTest);
        
    }//GEN-LAST:event_btnTestEmpActionPerformed

    private void btnTestPhonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestPhonesActionPerformed
        //Employee_phones phones = new Employee_phones();
        
        //phones.setEmpNo(1);
        //phones.setPhone("011");
        
        //phones.add();
        //phones.delete();
        //phones.deleteByEmp();
        //phones.getAllRows(tblTest);
    }//GEN-LAST:event_btnTestPhonesActionPerformed

    private void btnTestProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestProjectActionPerformed
        //Project proj = new Project();
        
        //proj.setProjectNo(3);
        //proj.setProjectName("Main Project");
        //proj.setLocation("Alex");
        //proj.setDeptNo(1);
        
        //proj.update();
        //proj.delete();
        //proj.getAllRows(tblTest);
        //tools.msg(proj.getAutoNumber());
        //proj.getOneRow(tblTest);
        //proj.getCustomRows("select * from project where projectno=1", tblTest);
        //tools.msg( proj.getValueByName("Project-3") );
        //tools.msg( proj.getNameByValue("4") );
    }//GEN-LAST:event_btnTestProjectActionPerformed

    private void btnTestWorkOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestWorkOnActionPerformed
        //WorkOn work = new WorkOn();
        
        //work.setEmpNo(1);
        //work.setProjectNo(1);
        
        //work.delete();
        //work.getAllRows(tblTest);
        //work.getOneRow(tblTest);
        //work.getCustomRows("select * from workon_data", tblTest);
        
    }//GEN-LAST:event_btnTestWorkOnActionPerformed

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
            java.util.logging.Logger.getLogger(frmTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controls.JMyButton btnTestEmp;
    private controls.JMyButton btnTestPhones;
    private controls.JMyButton btnTestProject;
    private controls.JMyButton btnTestWorkOn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTest;
    private javax.swing.JTable tblTest1;
    private controls.JMyButton testdept;
    // End of variables declaration//GEN-END:variables
}
