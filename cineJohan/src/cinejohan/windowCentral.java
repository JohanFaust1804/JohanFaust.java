/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cinejohan;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class windowCentral extends javax.swing.JFrame {
    connection conection = new connection();
    roomCine roomPrimary = new roomCine();
    roomCine roomSecundary = new roomCine();
    public windowCentral() {
        initComponents();
        this.conection.conectar();
        
        
        roomPrimary.setCapacity(500);
        roomPrimary.setEntryPrice(8.0);
        
        roomSecundary.setCapacity(300);
        roomSecundary.setEntryPrice(6.0);
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
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labTitlePrimary = new javax.swing.JLabel();
        labMovie = new javax.swing.JLabel();
        TextFieldMovie = new javax.swing.JTextField();
        buttonChangesPrincipal = new javax.swing.JButton();
        buttonNewSell = new javax.swing.JButton();
        buttonOcupation = new javax.swing.JButton();
        buttonEmpty = new javax.swing.JButton();
        buttonIncome = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labTtileSecundary = new javax.swing.JLabel();
        labMovie1 = new javax.swing.JLabel();
        TextFieldMovieSecond = new javax.swing.JTextField();
        buttonChangesSecond = new javax.swing.JButton();
        buttonNewentry2 = new javax.swing.JButton();
        buttonOcupation2 = new javax.swing.JButton();
        buttonEmpty2 = new javax.swing.JButton();
        buttonIncome2 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labTitlePrimary.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        labTitlePrimary.setText("Room Principal");

        labMovie.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        labMovie.setText("Movie");

        TextFieldMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMovieActionPerformed(evt);
            }
        });

        buttonChangesPrincipal.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        buttonChangesPrincipal.setText("CHANGES");
        buttonChangesPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangesPrincipalActionPerformed(evt);
            }
        });

        buttonNewSell.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        buttonNewSell.setText("NEW SELL");
        buttonNewSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewSellActionPerformed(evt);
            }
        });

        buttonOcupation.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        buttonOcupation.setText("% OCUPATION");
        buttonOcupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOcupationActionPerformed(evt);
            }
        });

        buttonEmpty.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        buttonEmpty.setText("EMPTY");

        buttonIncome.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        buttonIncome.setText("INCOME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labTitlePrimary)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonNewSell)
                                .addGap(32, 32, 32)
                                .addComponent(buttonOcupation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(buttonEmpty)
                                .addGap(38, 38, 38)
                                .addComponent(buttonIncome))
                            .addComponent(TextFieldMovie))
                        .addGap(18, 18, 18)
                        .addComponent(buttonChangesPrincipal)
                        .addGap(61, 61, 61))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitlePrimary, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonChangesPrincipal))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNewSell)
                    .addComponent(buttonOcupation)
                    .addComponent(buttonEmpty)
                    .addComponent(buttonIncome))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labTtileSecundary.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        labTtileSecundary.setText("Room Secundary");

        labMovie1.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        labMovie1.setText("Movie");

        TextFieldMovieSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMovieSecondActionPerformed(evt);
            }
        });

        buttonChangesSecond.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        buttonChangesSecond.setText("CHANGES");
        buttonChangesSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangesSecondActionPerformed(evt);
            }
        });

        buttonNewentry2.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        buttonNewentry2.setText("NEW ENTRY");

        buttonOcupation2.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        buttonOcupation2.setText("OCUPATION");
        buttonOcupation2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOcupation2ActionPerformed(evt);
            }
        });

        buttonEmpty2.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        buttonEmpty2.setText("EMPTY");

        buttonIncome2.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        buttonIncome2.setText("INCOME");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labTtileSecundary, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(labMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buttonNewentry2)
                                .addGap(30, 30, 30)
                                .addComponent(buttonOcupation2)
                                .addGap(32, 32, 32)
                                .addComponent(buttonEmpty2)
                                .addGap(41, 41, 41)
                                .addComponent(buttonIncome2))
                            .addComponent(TextFieldMovieSecond))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonChangesSecond)
                        .addGap(54, 54, 54))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(labTtileSecundary, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMovieSecond)
                    .addComponent(labMovie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonChangesSecond))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNewentry2)
                    .addComponent(buttonOcupation2)
                    .addComponent(buttonEmpty2)
                    .addComponent(buttonIncome2))
                .addGap(206, 206, 206))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void buttonOcupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOcupationActionPerformed
    String info;
    info = "room central";
    info = "Movie"+roomPrimary.getTitleMovie()+"\n";
    info = "Capacity"+roomPrimary.getCapacity()+"\n";
    info = "Seat busy"+roomPrimary.getSeatBusy()+"\n";
    info = "Seat free"+roomPrimary.getFree()+"\n";
    info = "Parcentage"+roomPrimary.getPorcentaje()+"\n";
        JOptionPane.showMessageDialog(null, "las caracteristicas es :"+ info);
    }//GEN-LAST:event_buttonOcupationActionPerformed

    private void buttonChangesPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangesPrincipalActionPerformed
       String title;
       title= JOptionPane.showInputDialog(null, "Enter the title of one movie : ");
       roomPrimary.setTitleMovie(title);
       TextFieldMovie.setText(title);
        
    }//GEN-LAST:event_buttonChangesPrincipalActionPerformed

    private void buttonChangesSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangesSecondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonChangesSecondActionPerformed

    private void buttonNewSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewSellActionPerformed
    roomPrimary.entraUno();
    }//GEN-LAST:event_buttonNewSellActionPerformed

    private void buttonOcupation2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOcupation2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonOcupation2ActionPerformed

    private void TextFieldMovieSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMovieSecondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMovieSecondActionPerformed

    private void TextFieldMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMovieActionPerformed
       
    }//GEN-LAST:event_TextFieldMovieActionPerformed

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
            java.util.logging.Logger.getLogger(windowCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowCentral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldMovie;
    private javax.swing.JTextField TextFieldMovieSecond;
    private javax.swing.JButton buttonChangesPrincipal;
    private javax.swing.JButton buttonChangesSecond;
    private javax.swing.JButton buttonEmpty;
    private javax.swing.JButton buttonEmpty2;
    private javax.swing.JButton buttonIncome;
    private javax.swing.JButton buttonIncome2;
    private javax.swing.JButton buttonNewSell;
    private javax.swing.JButton buttonNewentry2;
    private javax.swing.JButton buttonOcupation;
    private javax.swing.JButton buttonOcupation2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labMovie;
    private javax.swing.JLabel labMovie1;
    private javax.swing.JLabel labTitlePrimary;
    private javax.swing.JLabel labTtileSecundary;
    // End of variables declaration//GEN-END:variables
}
