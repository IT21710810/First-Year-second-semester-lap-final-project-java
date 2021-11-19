package Views;
import Models.Rider;
import Models.Rider.Record;
import Controllers.RiderController;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import Models.InvalidBMIException;
public class RiderView extends javax.swing.JFrame {

    Rider riderObj;
    Rider.Record recordObj;
    Rider[]riderArray;
    Rider.Record[]recArray;
    ArrayList<Rider>riderList;
    ArrayList<Rider.Record>recList;
    RiderController controllerObj;
    int index;
    
    public RiderView() {
        initComponents();
        controllerObj = new RiderController();
        riderArray=new Rider[100];
        recArray=new Record[100];
        index=0;
        riderList=new ArrayList<>();
        recList=new ArrayList<>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblRider = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblOlympicMedals = new javax.swing.JLabel();
        lblTopSpeed = new javax.swing.JLabel();
        lblNational = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtRider = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        txtTopSpeed = new javax.swing.JTextField();
        txtOlympic = new javax.swing.JTextField();
        txtNational = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnAddRider = new javax.swing.JButton();

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Rider Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Riderr Manage");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lblRider.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRider.setText("Rider Name");

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAge.setText("Age");

        lblWeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblWeight.setText("Weight");

        lblCountry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCountry.setText("Country");

        lblHeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHeight.setText("Height");

        lblOlympicMedals.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOlympicMedals.setText("Olympic Medals");

        lblTopSpeed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTopSpeed.setText("Top Speed");

        lblNational.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNational.setText("National records");

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSearch.setText("Search Rider By Name");

        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalculate.setText("Calculate BMI");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAddRider.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddRider.setText("Add Rider");
        btnAddRider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRider, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRider, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNational, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNational, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblOlympicMedals)
                                            .addComponent(lblTopSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTopSpeed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOlympic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalculate)
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(340, Short.MAX_VALUE)
                    .addComponent(btnAddRider)
                    .addGap(236, 236, 236)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRider, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOlympicMedals, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRider, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOlympic, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTopSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txtTopSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNational, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNational, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnCalculate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(233, Short.MAX_VALUE)
                    .addComponent(btnAddRider)
                    .addGap(198, 198, 198)))
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

    private void btnAddRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRiderActionPerformed
       try{
        String name = txtRider.getText();
        String country = txtCountry.getText();
        int age = Integer.parseInt(txtAge.getText());
        float weight = Float.parseFloat(txtWeight.getText());
        float height = Float.parseFloat(txtHeight.getText());
        int oly = Integer.parseInt(txtOlympic.getText());
        float topspeed = Float.parseFloat(txtTopSpeed.getText());
        int nat = Integer.parseInt(txtNational.getText());
        riderObj=controllerObj.addRider(name, age, country, weight, height);
        recordObj=controllerObj.addRecord(oly, topspeed, nat);
        riderArray[index]=riderObj;
        recArray[index]=recordObj;
        riderList.add(riderArray[index]);
        recList.add(recArray[index]);
        index++;
        JOptionPane.showMessageDialog(rootPane, index +" SuccessFully added Bike and Record", "Sucess", 1);
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }
    }//GEN-LAST:event_btnAddRiderActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        try{
        float weight = Float.parseFloat(txtWeight.getText());
        float height = Float.parseFloat(txtHeight.getText());
        if (weight <= 0 || height <= 0) {
                throw new InvalidBMIException();
            }
        double bmi=riderObj.calBMI(weight, height);
        JOptionPane.showMessageDialog(rootPane, "Your BMI "+bmi, "Info", 1);
         } catch (InvalidBMIException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERROR", 0);
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchText=txtSearch.getText();
        boolean isFound=false;
        for(Rider r: riderList)
        {
            if(r.getName().contains(searchText))
            {
                isFound=true;
                JOptionPane.showMessageDialog(rootPane, r.getName()+" "+r.getCountry()+" "+r.getAge(), "Sucess", 1);
            }
        }
        if(isFound==false)
        {
            JOptionPane.showMessageDialog(rootPane, index +" Rider Not Found", "404 Not Found", 1);
        }
                
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(RiderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRider;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblNational;
    private javax.swing.JLabel lblOlympicMedals;
    private javax.swing.JLabel lblRider;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTopSpeed;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtNational;
    private javax.swing.JTextField txtOlympic;
    private javax.swing.JTextField txtRider;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTopSpeed;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
