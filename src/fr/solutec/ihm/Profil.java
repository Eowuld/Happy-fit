/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.ihm;

import fr.solutec.model.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import fr.solutec.dao.*;
import javax.swing.JOptionPane;

/**
 *
 * @author stagiaire
 */
public class Profil extends javax.swing.JFrame {

    /**
     * Creates new form Profil
     */
    public static boolean emailValidate(String email) {
    Matcher matcher = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}(.[a-z]{2,3})+$|^$", Pattern.CASE_INSENSITIVE).matcher(email);
    return matcher.find();
    }
    
    private static User u;
    public Profil(User u) {
        this.u = u;
        initComponents();
        this.getRootPane().setDefaultButton(exitProfil);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitre = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        lbMail = new javax.swing.JLabel();
        lbMdp = new javax.swing.JLabel();
        lbMdpConf = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lbSexe = new javax.swing.JLabel();
        txtTaille = new javax.swing.JTextField();
        lbTaille = new javax.swing.JLabel();
        txtPoids = new javax.swing.JTextField();
        lbPoids = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        exitProfil = new javax.swing.JButton();
        lblAns = new javax.swing.JLabel();
        lblCm = new javax.swing.JLabel();
        lbKg = new javax.swing.JLabel();
        lbPseudo = new javax.swing.JLabel();
        scrollSexe = new javax.swing.JComboBox<>();
        txtMdp = new javax.swing.JPasswordField();
        txtMdpConfirm = new javax.swing.JPasswordField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitre.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Mon Profil");

        lbID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbID.setText("Pseudo");

        txtMail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMail.setAlignmentX(0.0F);
        txtMail.setAlignmentY(0.0F);
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        lbMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMail.setText("E-mail");

        lbMdp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMdp.setText("Mot de passe");

        lbMdpConf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMdpConf.setText("Confirmer Mot de passe");

        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAge.setAlignmentX(0.0F);
        txtAge.setAlignmentY(0.0F);

        lbSexe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSexe.setText("Sexe");

        txtTaille.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTaille.setAlignmentX(0.0F);
        txtTaille.setAlignmentY(0.0F);

        lbTaille.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTaille.setText("Taille");

        txtPoids.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPoids.setAlignmentX(0.0F);
        txtPoids.setAlignmentY(0.0F);

        lbPoids.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPoids.setText("Poids");

        lbAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAge.setText("Age");

        exitProfil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exitProfil.setText("VALIDER");
        exitProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProfilActionPerformed(evt);
            }
        });

        lblAns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAns.setText("ans");

        lblCm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCm.setText("cm");

        lbKg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbKg.setText("kg");

        lbPseudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPseudo.setToolTipText("");

        scrollSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme", "Autre" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbMdp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbMdpConf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbSexe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbTaille, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbPoids, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaille, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPoids, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAns, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(lblCm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbKg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lbPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(scrollSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMdpConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitre)
                .addGap(35, 35, 35)
                .addComponent(lbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMail)
                .addGap(4, 4, 4)
                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbMdp)
                .addGap(11, 11, 11)
                .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMdpConf)
                .addGap(11, 11, 11)
                .addComponent(txtMdpConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSexe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lbAge)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAns))
                .addGap(18, 18, 18)
                .addComponent(lbTaille)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCm))
                .addGap(18, 18, 18)
                .addComponent(lbPoids)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPoids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbKg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(exitProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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

    private void exitProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProfilActionPerformed
        String newPseudo = u.getPseudo();
        String newMail = txtMail.getText();
        if (!emailValidate(newMail)){
            newMail = u.getMail();
        }
        String newPassword = txtMdp.getText();
        String newPasswordConfirm = txtMdpConfirm.getText();
        if (!(newPassword==newPasswordConfirm)){
            newPassword = u.getMdp();
        }
        String newSexe = (String)scrollSexe.getSelectedItem();
        int newAge = 0;
        try{
            newAge = Integer.parseInt(txtAge.getText());
        } catch (Exception e) {
            newAge = u.getAge();
        }
        int newTaille = 0;
        try{
            newTaille = Integer.parseInt(txtTaille.getText());
        } catch (Exception e){
            newTaille = u.getTaille();
        }
        double newPoids = 0; 
        try{
            newPoids = Double.parseDouble(txtPoids.getText()); 
        } catch (Exception e) {
            newPoids = u.getPoids();
        }
        User v = new User(newPseudo, newMail, newPassword, newSexe, newAge, newTaille, newPoids);
        try{
            UserDao.updateUser(u,v);
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        Home fnHome = new Home(u);
        fnHome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitProfilActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lbPseudo.setText(u.getPseudo());
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profil(u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitProfil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbKg;
    private javax.swing.JLabel lbMail;
    private javax.swing.JLabel lbMdp;
    private javax.swing.JLabel lbMdpConf;
    private javax.swing.JLabel lbPoids;
    private javax.swing.JLabel lbPseudo;
    private javax.swing.JLabel lbSexe;
    private javax.swing.JLabel lbTaille;
    private javax.swing.JLabel lblAns;
    private javax.swing.JLabel lblCm;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JComboBox<String> scrollSexe;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtMdp;
    private javax.swing.JPasswordField txtMdpConfirm;
    private javax.swing.JTextField txtPoids;
    private javax.swing.JTextField txtTaille;
    // End of variables declaration//GEN-END:variables
}
