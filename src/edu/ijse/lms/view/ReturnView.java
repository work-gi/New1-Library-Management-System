/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.lms.view;

import edu.ijse.lms.controller.ReturnController;
import edu.ijse.lms.dto.BorrowingDto;
import edu.ijse.lms.dto.ReturnDto;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ReturnView extends javax.swing.JFrame {
    private final ReturnController RETURN_CONTROLLER; 
    private ArrayList <ReturnDto> returnDtos=new ArrayList<>();

    /**
     * Creates new form ReturnView
     */
    public ReturnView() {
        initComponents();
        this.RETURN_CONTROLLER = new ReturnController();
        loadTable();
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
        memberid = new javax.swing.JLabel();
        membidtxt = new javax.swing.JTextField();
        bookcode = new javax.swing.JLabel();
        bookcodetxt = new javax.swing.JTextField();
        returndate = new javax.swing.JLabel();
        returndatetxt = new javax.swing.JTextField();
        searchfinebtn = new javax.swing.JButton();
        searchfinetxt = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        borrowingtbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        finetxt = new javax.swing.JTextField();
        borrowingsearchbtn = new javax.swing.JButton();
        borrowingdata = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Return Books");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 23, 271, -1));

        memberid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        memberid.setText("Member ID");
        getContentPane().add(memberid, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 90, -1, -1));

        membidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membidtxtActionPerformed(evt);
            }
        });
        getContentPane().add(membidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 89, 125, 32));

        bookcode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookcode.setText("Book Code");
        getContentPane().add(bookcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 142, -1, -1));

        bookcodetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookcodetxtActionPerformed(evt);
            }
        });
        getContentPane().add(bookcodetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 141, 125, 32));

        returndate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        returndate.setText("Return Date");
        getContentPane().add(returndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 200, 108, -1));

        returndatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returndatetxtActionPerformed(evt);
            }
        });
        getContentPane().add(returndatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 199, 125, 32));

        searchfinebtn.setBackground(new java.awt.Color(51, 255, 255));
        searchfinebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchfinebtn.setText("Search Fine");
        searchfinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfinebtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchfinebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 197, -1, -1));
        getContentPane().add(searchfinetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 197, 226, 34));

        addbtn.setBackground(new java.awt.Color(0, 255, 255));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 249, -1, -1));

        borrowingtbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        borrowingtbl.setModel(new javax.swing.table.DefaultTableModel(
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
        borrowingtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowingtblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(borrowingtbl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 301, 665, 141));

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Place Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 454, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Fine");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 252, 45, -1));

        finetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finetxtActionPerformed(evt);
            }
        });
        getContentPane().add(finetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 251, 125, 32));

        borrowingsearchbtn.setBackground(new java.awt.Color(0, 255, 255));
        borrowingsearchbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        borrowingsearchbtn.setText("Search");
        borrowingsearchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowingsearchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(borrowingsearchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 139, -1, -1));
        getContentPane().add(borrowingdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 139, 263, 34));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/lms/images/bookdrop.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void membidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_membidtxtActionPerformed

    private void bookcodetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookcodetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookcodetxtActionPerformed

    private void returndatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returndatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returndatetxtActionPerformed

    private void borrowingtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowingtblMouseClicked
        // TODO add your handling code here:
        //        int i=itemtable.getSelectedRow();
        //        TableModel model=itemtable.getModel();
        //        itemtextfield.setText(model.getValueAt(i, 0).toString());
        //        desctextfield.setText(model.getValueAt(i, 1).toString());
        //        packtextfield.setText(model.getValueAt(i, 2).toString());
        //        unitpricefield.setText(model.getValueAt(i, 3).toString());
        //        qtyfield.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_borrowingtblMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        placeReturn();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchfinebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfinebtnActionPerformed

            searchFine();
            // TODO add your handling code here:
        
    }//GEN-LAST:event_searchfinebtnActionPerformed

    private void finetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finetxtActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        addToTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtnActionPerformed

    private void borrowingsearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowingsearchbtnActionPerformed
        searchBorrowing();
        // TODO add your handling code here:
    }//GEN-LAST:event_borrowingsearchbtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ReturnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ReturnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ReturnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ReturnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReturnView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel bookcode;
    private javax.swing.JTextField bookcodetxt;
    private javax.swing.JLabel borrowingdata;
    private javax.swing.JButton borrowingsearchbtn;
    private javax.swing.JTable borrowingtbl;
    private javax.swing.JTextField finetxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel memberid;
    private javax.swing.JTextField membidtxt;
    private javax.swing.JLabel returndate;
    private javax.swing.JTextField returndatetxt;
    private javax.swing.JButton searchfinebtn;
    private javax.swing.JLabel searchfinetxt;
    // End of variables declaration//GEN-END:variables

    private void searchFine(){
        try {
            ReturnDto dto = new ReturnDto();
            dto.setMemberID(membidtxt.getText());
            dto.setBookCode(bookcodetxt.getText());
            dto.setReturnDate (returndatetxt.getText());
            double fine = RETURN_CONTROLLER.searchFine(dto);
            finetxt.setText(Double.toString(fine));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
     private void loadTable(){
               String columns[]={"MemberID","BookCode","ReturnDate","Fine"};
               DefaultTableModel dtm= new DefaultTableModel(columns,0){
                  @Override
                   public boolean isCellEditable(int row,int column){
                        return false;
                }
              };
              borrowingtbl.setModel(dtm);
     }
     
      private void addToTable(){
          try {
                ReturnDto returndto = new ReturnDto();
                returndto.setMemberID(membidtxt.getText());
                returndto.setBookCode(bookcodetxt.getText());
                returndto.setReturnDate(returndatetxt.getText());
                returndto.setFine(Double.parseDouble(finetxt.getText()));
                returnDtos.add(returndto);
                
                Object [] rowData = {returndto.getMemberID(),returndto.getBookCode(),returndto.getReturnDate(),returndto.getFine()};
                DefaultTableModel dtm = (DefaultTableModel) borrowingtbl.getModel();
                dtm.addRow(rowData);
                clearForm();
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e.getMessage());
          }
      }
      
      private void placeReturn() {
        try {
             String resp=RETURN_CONTROLLER.placeReturn(returnDtos);
             JOptionPane.showMessageDialog(this, resp);
             loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void searchBorrowing() {
        try {
            String membID = membidtxt.getText();
            String bookCode = bookcodetxt.getText();
            BorrowingDto dto = RETURN_CONTROLLER.searchBorrowing(membID,bookCode);
            borrowingdata.setText("Borrowed - " + dto.getBorrowingDate() + " | " + "Due - " + dto.getDueDate() );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        
     private void clearForm(){
         membidtxt.setText("");
         bookcodetxt.setText("");
         returndatetxt.setText("");
         finetxt.setText("");
     
    }
            

}
