package Views;
import javax.swing.JOptionPane;
import Models.Bicycle;
import Controllers.BicycleController;
import DatabaseLayer.DatabaseConnection;
public class BicycleView extends javax.swing.JFrame {

    Bicycle modelObj;
    Bicycle[] bikeArray;
    BicycleController e1;
    int index;
    public BicycleView() {
        initComponents();
         e1=new BicycleController();
         bikeArray=new Bicycle[100];
         index=0;
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGear = new javax.swing.JLabel();
        lblSpeed = new javax.swing.JLabel();
        lblCurrent = new javax.swing.JLabel();
        btnApply = new javax.swing.JButton();
        btnAddBicycle = new javax.swing.JButton();
        btnAceelerate = new javax.swing.JButton();
        txtGear = new javax.swing.JTextField();
        txtSpeed = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bicycle 2.0");

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        lblGear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGear.setText("Gear");

        lblSpeed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSpeed.setText("Speed");

        lblCurrent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCurrent.setText("Current Speed");

        btnApply.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnApply.setText("Apply Brake");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        btnAddBicycle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddBicycle.setText("Add Bicycle");
        btnAddBicycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBicycleActionPerformed(evt);
            }
        });

        btnAceelerate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceelerate.setText("Accelerate");
        btnAceelerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceelerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddBicycle)
                            .addComponent(btnAceelerate))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGear, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnApply)
                        .addGap(160, 160, 160))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnApply)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceelerate)
                    .addComponent(txtSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnAddBicycle)
                .addGap(56, 56, 56)
                .addComponent(lblCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
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

    private void btnAddBicycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBicycleActionPerformed
        try {
        int Gear = Integer.parseInt(txtGear.getText());
        float Speed = Float.parseFloat(txtSpeed.getText());
        modelObj=e1.addBicycle(Gear, Speed);
        boolean result=e1.insertBikeToDB(modelObj);
        bikeArray[index]=modelObj;
        lblCurrent.setText(modelObj.toString());
        index++;
        if(result)
        {
            JOptionPane.showMessageDialog(rootPane,(index)+" Bike has been Added", "info", 1);
        }else{
               JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0); 
            }
        
        } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane," Input is empty", "Error", 0);
                }
    }//GEN-LAST:event_btnAddBicycleActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        try {
        float Speed = Float.parseFloat(txtSpeed.getText());
        modelObj.applyBrake(Speed);
        lblCurrent.setText(modelObj.toString());
        } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane," Input is Invalid", "Error", 0);
                }
    }//GEN-LAST:event_btnApplyActionPerformed

    private void btnAceelerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceelerateActionPerformed
        try {
        float Speed = Float.parseFloat(txtSpeed.getText());
        modelObj.speedUp(Speed);
        lblCurrent.setText(modelObj.toString());
        } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane," Input is Invalid", "Error", 0);
                }
    }//GEN-LAST:event_btnAceelerateActionPerformed

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
            java.util.logging.Logger.getLogger(BicycleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BicycleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BicycleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BicycleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BicycleView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceelerate;
    private javax.swing.JButton btnAddBicycle;
    private javax.swing.JButton btnApply;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCurrent;
    private javax.swing.JLabel lblGear;
    private javax.swing.JLabel lblSpeed;
    private javax.swing.JTextField txtGear;
    private javax.swing.JTextField txtSpeed;
    // End of variables declaration//GEN-END:variables
}
