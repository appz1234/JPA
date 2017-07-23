/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.StudentJpaController;
import java.io.SequenceInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Student;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.SequenceGenerator;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import org.eclipse.persistence.sequencing.Sequence;
/**
 *
 * @author MANHKHUC
 */

public class FormDisplay extends javax.swing.JFrame {
    
    private static EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("persistence");
        } catch (Exception e) {
            emf = null;
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
    
    private DefaultTableModel model;
    /**
     * Creates new form FormDisplay
     */
    public FormDisplay() {
        initComponents();
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Class");
        model.addColumn("Gender");
        model.addColumn("DOB");
        jTable2.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblName = new javax.swing.JLabel();
        lblClass = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtClass = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Name");

        lblClass.setText("Class");

        lblDOB.setText("Date of Birth");

        lblGender.setText("Gender");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnShow.setText("Show All");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdMale);
        rdMale.setText("Male");

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblClass)
                            .addComponent(lblDOB)
                            .addComponent(lblGender))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(rdFemale))
                            .addComponent(txtName)
                            .addComponent(txtClass)
                            .addComponent(txtDOB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnShow, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnFind, btnRemove, btnShow});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClass)
                            .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDOB)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdFemale)
                                .addComponent(rdMale))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShow)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date date = format.parse(txtDOB.getText());
            StudentJpaController ctl = new StudentJpaController(emf);
            Student student = new Student(txtName.getText(), txtClass.getText(), rdMale.isSelected() ? BigInteger.valueOf(1) : BigInteger.valueOf(0), date);
            ctl.create(student); 
            showMessageDialog("success");
            btnShowActionPerformed(evt);
        } 
        catch (Exception ex) {
            showMessageDialog("fail");
        }    
    }//GEN-LAST:event_btnAddActionPerformed

    
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Enter id of student to delete:");
        if (input == null || input.length() == 0) {
            return;
        }
        int inp = 0;
        try {
            inp = Integer.parseInt(input);
        } catch (Exception ex) {
            // parse int error
            showMessageDialog("input incorrect");
            ex.printStackTrace();
        }
        try{
        StudentJpaController ctl = new StudentJpaController(emf);
        inp = Integer.parseInt(input);
        BigDecimal in = BigDecimal.valueOf(inp);
        ctl.destroy(in);
        showMessageDialog("success");
        }
        catch (Exception ex) {
            ex.printStackTrace();
            showMessageDialog("not exists");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Enter id of student to find:");
        if (input == null || input.length() == 0) {
            return;
        }
        int inp = 0;
        try {
            inp = Integer.parseInt(input);
        } catch (Exception ex) {
            // parse int error
            showMessageDialog("input incorrect");
            ex.printStackTrace();
        }
        StudentJpaController ctl = new StudentJpaController(emf);
        //ctl.findStudent(input.);
        
        inp = Integer.parseInt(input);
        BigDecimal in = BigDecimal.valueOf(inp);
        Student stu = ctl.findStudent(in);
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String gender = "Male";
        if (stu.getGender() == BigInteger.valueOf(0)) {
            gender = "Female";
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = format.format(stu.getDob());
        model.addRow(new String[]{stu.getId() + "", stu.getName(), stu.getClass1(), gender, dateStr + ""});
        try {
            displayStudent(stu);
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        StudentJpaController ctl = new StudentJpaController(emf);
        List<Student> list = ctl.findStudentEntities();
            for (Student s : list) {
            String gender = "Male";
            if (s.getGender() == BigInteger.valueOf(0)) {
                gender = "Female";
            }
            String dateStr = format.format(s.getDob());
            model.addRow(new String[]{s.getId() + "", s.getName(), s.getClass1(), gender, dateStr + ""});
        }
    }//GEN-LAST:event_btnShowActionPerformed
                                    

    private void clearText() {
        txtClass.setText("");
        txtName.setText("");
        txtDOB.setText("");
        rdFemale.setSelected(false);
        rdMale.setSelected(false);
    }

    private void displayStudent(Student stu) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = format.format(stu.getDob());
        txtClass.setText(stu.getClass1());
        txtName.setText(stu.getName());
        txtDOB.setText(dateStr + "");
        if (stu.getGender().toString().equals("1")) {
            rdMale.setSelected(true);
            rdFemale.setSelected(false);
        } else {
            rdFemale.setSelected(true);
            rdMale.setSelected(false);
        }
    }
    
    private void showMessageDialog(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormDisplay().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnShow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
