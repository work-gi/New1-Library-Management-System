/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.lms.view;

import edu.ijse.lms.controller.BookCategoryController;
import edu.ijse.lms.dto.BookCategoryDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class BookCategoryView extends javax.swing.JFrame {
    private final BookCategoryController BOOK_CATEGORY_CONTROLLER;

    /**
     * Creates new form BookCategary
     */
    public BookCategoryView() {
        initComponents();
        this.BOOK_CATEGORY_CONTROLLER=new BookCategoryController();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bookcode = new javax.swing.JLabel();
        categary = new javax.swing.JLabel();
        codetxt = new javax.swing.JTextField();
        language = new javax.swing.JLabel();
        desctxt = new javax.swing.JTextField();
        categarytxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        categorytbl = new javax.swing.JTable();
        savebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Book Category Form");

        bookcode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookcode.setText("Category Code");

        categary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categary.setText("Category");

        codetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codetxtActionPerformed(evt);
            }
        });

        language.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        language.setText("Description");

        desctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desctxtActionPerformed(evt);
            }
        });

        categorytbl.setModel(new javax.swing.table.DefaultTableModel(
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
        categorytbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorytblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(categorytbl);

        savebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(desctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(273, 273, 273)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bookcode)
                                        .addComponent(categary)
                                        .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(categarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updatebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deletebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(savebtn)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(language)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bookcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(codetxt))
                                .addGap(18, 18, 18)
                                .addComponent(categarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(categary))
                        .addGap(18, 18, 18)
                        .addComponent(desctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn)
                    .addComponent(deletebtn)
                    .addComponent(updatebtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codetxtActionPerformed

    private void desctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desctxtActionPerformed

    private void categorytblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorytblMouseClicked

        searchMouseClick();
        // TODO add your handling code here:
    }//GEN-LAST:event_categorytblMouseClicked

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        saveCategory();
    }//GEN-LAST:event_savebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        deleteCategory();
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        updateCategory();
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtnActionPerformed

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
//            java.util.logging.Logger.getLogger(BookCategaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BookCategaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BookCategaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BookCategaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BookCategaryView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookcode;
    private javax.swing.JLabel categary;
    private javax.swing.JTextField categarytxt;
    private javax.swing.JTable categorytbl;
    private javax.swing.JTextField codetxt;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField desctxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel language;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

    private void saveCategory() {
        try {
            BookCategoryDto categoryDto = new BookCategoryDto(codetxt.getText(),categarytxt.getText(),desctxt.getText());
            String resp=BOOK_CATEGORY_CONTROLLER.saveCategory(categoryDto);
            JOptionPane.showMessageDialog(this, resp); 
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    
    private void deleteCategory() {
        try {
            String categoryCode=codetxt.getText();
            String resp = BOOK_CATEGORY_CONTROLLER.deleteCategory(categoryCode);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void updateCategory() {
        try {
            BookCategoryDto categoryDto=new BookCategoryDto(codetxt.getText(),categarytxt.getText(),desctxt.getText());
            String resp=BOOK_CATEGORY_CONTROLLER.updateCategory(categoryDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
   
    }
    
    private void loadTable() {
        try {
             String columns[]={"CategoryCode","Category","Description"};
              DefaultTableModel dtm= new DefaultTableModel(columns,0){
                  @Override
                   public boolean isCellEditable(int row,int column){
                        return false;
                }
              };
              categorytbl.setModel(dtm);
              ArrayList<BookCategoryDto> categoryDto=BOOK_CATEGORY_CONTROLLER.getAll();
              for(BookCategoryDto dto:categoryDto){
                  Object[] rowData={dto.getCategoryCode(),dto.getCategory(),dto.getDescription()};
                  dtm.addRow(rowData);
              }
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        
    private void clearForm(){
        codetxt.setText("");
        categarytxt.setText("");
        desctxt.setText("");
    }
    
    private void searchMouseClick() {
        try {
            String categoryCode= categorytbl.getValueAt(categorytbl.getSelectedRow(),0).toString();
            BookCategoryDto dto = BOOK_CATEGORY_CONTROLLER.get(categoryCode);
            if(dto!=null){
                codetxt.setText(dto.getCategoryCode());
                categarytxt.setText(dto.getCategory());
                desctxt.setText(dto.getDescription());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
     }
            
}
