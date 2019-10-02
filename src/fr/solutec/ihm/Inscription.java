/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.ihm;

import fr.solutec.dao.UserDao;
import static fr.solutec.ihm.Profil.emailValidate;
import fr.solutec.model.Objectif;
import fr.solutec.model.User;
import static java.time.Instant.now;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static java.util.Objects.isNull;
import javax.swing.JOptionPane;

/**
 *
 * @author stagiaire
 */
public class Inscription extends javax.swing.JFrame {

    /**
     * Creates new form Inscription
     */
    private static User u;
    public Inscription(User u) {
        this.u = u;
        initComponents();
        this.getRootPane().setDefaultButton(exitInscription1);
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
        lbMdpConf = new javax.swing.JLabel();
        lblAns = new javax.swing.JLabel();
        lblTitre = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblCm = new javax.swing.JLabel();
        lbSexe = new javax.swing.JLabel();
        lbKg = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        txtTaille = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        lbTaille = new javax.swing.JLabel();
        lbMail = new javax.swing.JLabel();
        txtPoids = new javax.swing.JTextField();
        lbPoids = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        btRetour = new javax.swing.JButton();
        lbMdp = new javax.swing.JLabel();
        txtPseudo = new javax.swing.JTextField();
        cbSexe = new javax.swing.JComboBox<>();
        txtMdp = new javax.swing.JPasswordField();
        txtMdpConfirm = new javax.swing.JPasswordField();
        exitInscription1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        lbMdpConf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMdpConf.setText("Confirmer Mot de passe");

        lblAns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAns.setText("ans");

        lblTitre.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Inscription");

        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAge.setAlignmentX(0.0F);
        txtAge.setAlignmentY(0.0F);

        lblCm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCm.setText("cm");

        lbSexe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSexe.setText("Sexe");

        lbKg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbKg.setText("kg");

        lbID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbID.setText("Pseudo");

        txtTaille.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTaille.setAlignmentX(0.0F);
        txtTaille.setAlignmentY(0.0F);

        txtMail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMail.setAlignmentX(0.0F);
        txtMail.setAlignmentY(0.0F);

        lbTaille.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTaille.setText("Taille");

        lbMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMail.setText("E-mail");

        txtPoids.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPoids.setAlignmentX(0.0F);
        txtPoids.setAlignmentY(0.0F);

        lbPoids.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPoids.setText("Poids");

        lbAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAge.setText("Age");

        btRetour.setText("RETOUR");
        btRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetourActionPerformed(evt);
            }
        });

        lbMdp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMdp.setText("Mot de passe");

        txtPseudo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPseudo.setAlignmentX(0.0F);
        txtPseudo.setAlignmentY(0.0F);

        cbSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme", "Autre" }));
        cbSexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexeActionPerformed(evt);
            }
        });

        txtMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMdpActionPerformed(evt);
            }
        });

        exitInscription1.setText("VALIDER");
        exitInscription1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitInscription1ActionPerformed(evt);
            }
        });

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
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaille, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPoids, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAns, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(lblCm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbKg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMdpConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(cbSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitInscription1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitre)
                .addGap(35, 35, 35)
                .addComponent(lbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbMail)
                .addGap(4, 4, 4)
                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbMdp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lbMdpConf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMdpConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lbSexe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitInscription1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void cbSexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexeActionPerformed

    private void txtMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMdpActionPerformed

    private void btRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetourActionPerformed
        
        Login fnLogin = new Login(u);
        fnLogin.setVisible(true);
        this.setVisible(false);   
        
    }//GEN-LAST:event_btRetourActionPerformed

    private void exitInscription1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitInscription1ActionPerformed
        
       
            
        String pseudo = txtPseudo.getText();
        String mail = txtMail.getText();
        String mdp = txtMdp.getText();
        String mdpConfirm = txtMdpConfirm.getText();
        String sexe = (String)cbSexe.getSelectedItem();
        int age = 0;
        if (!txtAge.getText().isEmpty()){
            age = Integer.parseInt(txtAge.getText());
        }
        int taille = 0;
         if (!txtTaille.getText().isEmpty()){
            taille = Integer.parseInt(txtTaille.getText());
        }      
        double poids = 0;
        if (!txtPoids.getText().isEmpty()){
            poids = Double.parseDouble(txtPoids.getText());
        }        
        try {
        User v = new User(pseudo, mail, mdp, sexe, age, taille, poids); 
        List<User> membres = UserDao.getAllUsers();
         
            for (User membre : membres) {
                if (membre.getPseudo().equals(pseudo)){
                    JOptionPane.showMessageDialog(rootPane, "Ce pseudo existe déjà !");
                }
                else {
                    if (membre.getMail().equals(mail)){
                        JOptionPane.showMessageDialog(rootPane, "Ce mail existe déjà !");
                    }
                    else {
                         if (mdp.equals(mdpConfirm) && emailValidate(mail)){            
                            UserDao.insertUser(v);
                            java.sql.Date current_date = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
                            Objectif obj = new Objectif(0, 0, 0, 0);
                            UserDao.insertObjectif(v,obj);
                            JOptionPane.showMessageDialog(rootPane, "Vous êtes bien inscrit !");
                            Aide fnAide = new Aide(v);
                            fnAide.setVisible(true);
                            this.setVisible(false);                              
                            }
        
                         else if (!mdp.equals(mdpConfirm)){
                         JOptionPane.showMessageDialog(rootPane, "Vos deux mots de passe sont différents !");
                         }
        
                         else if (!emailValidate(mail)){
                         JOptionPane.showMessageDialog(rootPane, "Votre e-mail n'est pas valide !");
                         }
               
                    }
                } 
            }
         }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "except : " + e.getMessage());
            }                   
    
        
    }//GEN-LAST:event_exitInscription1ActionPerformed

  // emailValidate (mail)  
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscription(u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRetour;
    private javax.swing.JComboBox<String> cbSexe;
    private javax.swing.JButton exitInscription1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbKg;
    private javax.swing.JLabel lbMail;
    private javax.swing.JLabel lbMdp;
    private javax.swing.JLabel lbMdpConf;
    private javax.swing.JLabel lbPoids;
    private javax.swing.JLabel lbSexe;
    private javax.swing.JLabel lbTaille;
    private javax.swing.JLabel lblAns;
    private javax.swing.JLabel lblCm;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtMdp;
    private javax.swing.JPasswordField txtMdpConfirm;
    private javax.swing.JTextField txtPoids;
    private javax.swing.JTextField txtPseudo;
    private javax.swing.JTextField txtTaille;
    // End of variables declaration//GEN-END:variables
}
