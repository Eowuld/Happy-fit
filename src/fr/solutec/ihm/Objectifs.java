/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.ihm;

import fr.solutec.dao.UserDao;
import fr.solutec.dao.ObjectifDao;
import fr.solutec.model.Objectif;
import fr.solutec.model.User;
import javax.swing.JOptionPane;

/**
 *
 * @author stagiaire
 */
public class Objectifs extends javax.swing.JFrame {

    /**
     * Creates new form Objectifs
     */
    private static User u;
    public Objectifs(User u) {
        initComponents();
        this.u = u;
        this.getRootPane().setDefaultButton(exitObjectifs);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitre = new javax.swing.JLabel();
        exitObjectifs = new javax.swing.JButton();
        cbObj = new javax.swing.JComboBox<>();
        txtObj = new javax.swing.JTextField();
        txtSport = new javax.swing.JTextField();
        lbSport = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObj = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        lblTitre.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Objectifs");

        exitObjectifs.setText("VALIDER");
        exitObjectifs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitObjectifsActionPerformed(evt);
            }
        });

        cbObj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "min", "km" }));

        txtObj.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSport.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbSport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSport.setText("Sport");

        txtAreaObj.setColumns(20);
        txtAreaObj.setRows(5);
        jScrollPane1.setViewportView(txtAreaObj);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitre, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSport, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbSport, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtObj)
                                                .addGap(19, 19, 19)))
                                        .addComponent(cbObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(exitObjectifs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitre)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(lbSport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(exitObjectifs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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

    private void exitObjectifsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitObjectifsActionPerformed
        Objectif new_obj = new Objectif();
        double objPoids = 0;
        double objDistance = 0;
        double objDuree = 0;
        
        if (objPoids < 0 || objDistance < 0 || objDuree < 0){
            JOptionPane.showMessageDialog(rootPane, "Objectif négatif invalide");
        }
        else {
        if (cbObj.getSelectedItem().toString().equals("kg")){
            try{
                objPoids = Double.parseDouble(txtObj.getText());
            } catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "Objectif de poids invalide");
            }
        }else if (cbObj.getSelectedItem().toString().equals("km")){
            try{
                objDistance = Double.parseDouble(txtObj.getText());
            } catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "Objectif de distance invalide");
            }
        }else if (cbObj.getSelectedItem().toString().equals("min")){
            try{
                objDuree = Double.parseDouble(txtObj.getText());
            } catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "Objectif de durée invalide");
            }
        }}
        
        
        if (!(objPoids == 0 && objDistance == 0 && objDuree == 0)){
           
            new_obj.setObjectifPoids(objPoids);
            new_obj.setObjectifPoids(objDistance);
            new_obj.setObjectifPoids(objDuree);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Objectif nul invalide");
        }
        try{
            ObjectifDao.insertObjectif(new_obj);
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        Home fnHome = new Home(u);
        fnHome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitObjectifsActionPerformed

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
            java.util.logging.Logger.getLogger(Objectifs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Objectifs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Objectifs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Objectifs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Objectifs(u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbObj;
    private javax.swing.JButton exitObjectifs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSport;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JTextArea txtAreaObj;
    private javax.swing.JTextField txtObj;
    private javax.swing.JTextField txtSport;
    // End of variables declaration//GEN-END:variables
}
