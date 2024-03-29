package UserInterface.SupplierRole;

import UserInterface.CustomerRole.*;
import Business.Business;
import Business.Organization.SalesSpecialistOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EnrollmentWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class RequestEnrollmentJPanel extends javax.swing.JPanel {

    JPanel upc;
    UserAccount ua;
    Business business;
    
    public RequestEnrollmentJPanel(JPanel upc,UserAccount ua, Business business) {
        initComponents();
        this.upc = upc;
        this.ua = ua;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestEnrollmentJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        requestEnrollmentJButton.setText("Request Enrollment");
        requestEnrollmentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestEnrollmentJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Message");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(requestEnrollmentJButton)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backJButton)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(requestEnrollmentJButton)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestEnrollmentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestEnrollmentJButtonActionPerformed

        String message = messageJTextField.getText();
        
        EnrollmentWorkRequest enrollReq = new EnrollmentWorkRequest();
        enrollReq.setMessage(message);
        enrollReq.setSender(ua);
        enrollReq.setStatus("SENT");
        enrollReq.setEnrollmentResult("Waiting");
        
        Organization foundOrg = null;
        for (Organization org : business.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof SalesSpecialistOrganization) {
                foundOrg = org;
                break;
            }
        }
        if (foundOrg != null) {
            foundOrg.getWorkQueue().getWorkRequestList().add(enrollReq);
            ua.getWorkQueue().getWorkRequestList().add(enrollReq);
        }
    }//GEN-LAST:event_requestEnrollmentJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestEnrollmentJButton;
    // End of variables declaration//GEN-END:variables
}
