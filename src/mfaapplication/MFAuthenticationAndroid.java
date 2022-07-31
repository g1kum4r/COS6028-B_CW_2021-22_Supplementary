/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfaapplication;

import mfaapplication.method.MFAuthenticationMethod;
import mfaapplication.method.impl.MFAuthenticationPhoneMethod;
import mfaapplication.method.impl.MFAuthenticationEmailMethod;
import javax.swing.JOptionPane;
import mfaapplication.service.AuthenticationService;

/**
 *
 * @author naozeb
 */
public class MFAuthenticationAndroid extends MFAuthenticationJFrame {

    /**
     * Creates new form MFAuthenticationAndroid
     */
    private MFAuthenticationMethod authenticationMethod;

    public MFAuthenticationAndroid() {
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

        mfaMethodGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sendCodeButton = new javax.swing.JButton();
        lblNotify = new javax.swing.JLabel();
        lblNotify3 = new javax.swing.JLabel();
        securityCodeTextField = new javax.swing.JTextField();
        verfiySecurityCode = new javax.swing.JButton();
        lblNotify4 = new javax.swing.JLabel();
        isEmailMethod = new javax.swing.JRadioButton();
        isCellPhoneMethod = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Authentication");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sendCodeButton.setBackground(new java.awt.Color(0, 204, 153));
        sendCodeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendCodeButton.setForeground(new java.awt.Color(255, 255, 255));
        sendCodeButton.setText("Send Code");
        sendCodeButton.setToolTipText("");
        sendCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendCodeButtonActionPerformed(evt);
            }
        });

        lblNotify.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        lblNotify.setForeground(new java.awt.Color(255, 255, 255));

        lblNotify3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblNotify3.setForeground(new java.awt.Color(255, 255, 255));
        lblNotify3.setText("Verification code ");

        verfiySecurityCode.setBackground(new java.awt.Color(0, 204, 153));
        verfiySecurityCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        verfiySecurityCode.setForeground(new java.awt.Color(255, 255, 255));
        verfiySecurityCode.setText("Submit");
        verfiySecurityCode.setToolTipText("");
        verfiySecurityCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verfiySecurityCodeActionPerformed(evt);
            }
        });

        lblNotify4.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        lblNotify4.setForeground(new java.awt.Color(255, 255, 255));
        lblNotify4.setText("Didn't receive code? Resend");

        isEmailMethod.setBackground(new java.awt.Color(51, 51, 51));
        mfaMethodGroup.add(isEmailMethod);
        isEmailMethod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        isEmailMethod.setForeground(new java.awt.Color(255, 255, 255));
        isEmailMethod.setSelected(true);
        isEmailMethod.setText("Email");

        isCellPhoneMethod.setBackground(new java.awt.Color(51, 51, 51));
        mfaMethodGroup.add(isCellPhoneMethod);
        isCellPhoneMethod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        isCellPhoneMethod.setForeground(new java.awt.Color(255, 255, 255));
        isCellPhoneMethod.setText("Cell Phone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNotify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isCellPhoneMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isEmailMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNotify4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNotify3)
                                .addGap(41, 41, 41)
                                .addComponent(securityCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(verfiySecurityCode, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sendCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(isEmailMethod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isCellPhoneMethod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendCodeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNotify, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNotify3)
                    .addComponent(securityCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verfiySecurityCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNotify4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendCodeButtonActionPerformed

        //Enable veriification button after requesting code
        verfiySecurityCode.setEnabled(true);
        //Check verification method
        if (isEmailMethod.isSelected()) {
            //Sending email via send class
            authenticationMethod = new MFAuthenticationEmailMethod();
            //Show label about which option chose(Email)
            lblNotify.setText("Verification code has been sent to your Email -" + AuthenticationService.getInstance().getUser().getEmail());
        } else if(isCellPhoneMethod.isSelected()) {
            //Show label about which option chose(MobileNo)
            authenticationMethod = new MFAuthenticationPhoneMethod();
            lblNotify.setText("Verification code has been sent to your Contact No -" + AuthenticationService.getInstance().getUser().getContactNo());
        }
        sendCode(authenticationMethod);
    }//GEN-LAST:event_sendCodeButtonActionPerformed

    private void verfiySecurityCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verfiySecurityCodeActionPerformed
        if (authenticationMethod.verify(Integer.valueOf(securityCodeTextField.getText()))) {
            JOptionPane.showMessageDialog(null, "User Verified");
        } else {
            JOptionPane.showMessageDialog(null, "User Verification Failed");
        }
    }//GEN-LAST:event_verfiySecurityCodeActionPerformed

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
            java.util.logging.Logger.getLogger(MFAuthenticationAndroid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MFAuthenticationAndroid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MFAuthenticationAndroid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MFAuthenticationAndroid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MFAuthenticationAndroid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton isCellPhoneMethod;
    private javax.swing.JRadioButton isEmailMethod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNotify;
    private javax.swing.JLabel lblNotify3;
    private javax.swing.JLabel lblNotify4;
    private javax.swing.ButtonGroup mfaMethodGroup;
    private javax.swing.JTextField securityCodeTextField;
    private javax.swing.JButton sendCodeButton;
    private javax.swing.JButton verfiySecurityCode;
    // End of variables declaration//GEN-END:variables
}