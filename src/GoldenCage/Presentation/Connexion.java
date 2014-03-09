/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Presentation;

import GoldenCage.Presentation.Administrateur.Choix;
import GoldenCage.Presentation.Clientpack.Client;
import GoldenCage.Prestataire.Acceuil;
import GoldenCage.Presentation.FaceBookConnect.GraphReaderExample;
import GoldenCage.dao.AdminDAO;
import GoldenCage.dao.ClientDAO;
import GoldenCage.dao.PrestataireDAO;
import GoldenCage.entities.Admin;
import GoldenCage.entities.Prestataire;
import com.restfb.types.User;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author minoo
 */
public class Connexion extends javax.swing.JFrame {

    /**
     * Creates new form Connexion
     */
    public Connexion() {
        initComponents();
      Image image;
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/resources/Facebook.png"));
            Image scaledImage=image.getScaledInstance(jPanel1.getWidth(),jPanel1.getHeight(),Image.SCALE_SMOOTH); 
            jLabel4.setIcon(new ImageIcon(scaledImage));
           
        } catch (IOException ex) {
            //
        }
    }

    public JTextField getLoginInput() {
        return LoginInput;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LoginInput = new javax.swing.JTextField();
        Jconnect = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        MDPInput = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Veuillez vous authentifié");

        jLabel2.setText("Login");

        jLabel3.setText("Mot De Passe:");

        Jconnect.setText("Valider");
        Jconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JconnectActionPerformed(evt);
            }
        });

        jButton2.setText("Quitter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addGap(180, 180, 180)
                .addComponent(Jconnect)
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginInput, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(MDPInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LoginInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MDPInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(Jconnect))
                .addGap(94, 94, 94))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JconnectActionPerformed

        if(LoginInput.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Veuillez Saisir votre Login");
        }
        else if(MDPInput.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Veuillez Saisir votre Mot de passe");
        }
        else{
            AdminDAO admindao=new AdminDAO();
            Admin admin=new Admin();
            admin=admindao.authentification(LoginInput.getText(), MDPInput.getText());
            if(admin.getIdAdmin()!=0){
                Choix ch=new Choix();
                this.setVisible(false);
                ch.setVisible(true);
            }
            else{
               PrestataireDAO prestataireDAO=new PrestataireDAO();
                Prestataire prestataire=new Prestataire();
                prestataire=prestataireDAO.AuthentificationWithLoginMDP(LoginInput.getText(), MDPInput.getText());
                if(prestataire.getIdPrestataire()!=0){
                    Acceuil acceuil=new Acceuil();
                    this.setVisible(false);
                    acceuil.setVisible(true);
                }
                else{
                    ClientDAO clientDAO=new ClientDAO();
                    GoldenCage.entities.Client client=new GoldenCage.entities.Client();
                    client=clientDAO.authentification(LoginInput.getText(), MDPInput.getText());
                    System.out.println(client.getIdClient());
                    if(client.getIdClient()!=0){
                        if(!client.isBannir()){
                             Client cl=new Client(this);
                            this.setVisible(false);
                            cl.setVisible(true);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Votre compte"+LoginInput.getText()+" est banni");
                        }
           
                       
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Login ou Mot de passe incorrecte");
                    }
                }
            }
             System.out.println(admin.getIdAdmin());
        }
        
        
        
    }//GEN-LAST:event_JconnectActionPerformed

    private void JconnectFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JconnectFacebookActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_JconnectFacebookActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        GraphReaderExample gre=new GraphReaderExample("CAAE9RWLux8IBADraHN4Uate1lrjbZC9WoQZAwbtOOZBwGL6J55G9cJCvIccVMEeF6iRO9bxjzk41MlIU0rd0Li8DbW56vblhnhskeAoIEi8NrQSqv6ial2qj7cF3uIRZCSdJCraHe37ZBewYJnxXWY6NCMVRgDc1Qw7P6v4z23TYxNJXqZCMCq");
        User user= gre.fetchObject();
        user.getEmail();
        ClientDAO clientDAO=new ClientDAO();
        GoldenCage.entities.Client client;
        client=clientDAO.AuthentificationWithFacebook(user.getEmail());
        if(client.getIdClient()!=0){
            if(client.isBannir()==false){
                Client cl=new Client(this);
                this.setVisible(false);
                cl.setVisible(true);
            }
            else{
                 JOptionPane.showMessageDialog(null,"Votre compte est banni");
            }
        }
        else{

            client=new GoldenCage.entities.Client();
            client.setAdressMail(user.getEmail());
            client.setBannir(false);
            client.setLogin(user.getUsername());
            client.setMotDePasse(user.getEmail());
            client.setNom(user.getName());
            client.setPrenom(user.getFirstName());
            client.setNumTel("0");
            if(clientDAO.ajouterClient(client))
                JOptionPane.showMessageDialog(null,"Votre compte a été crée");
            else
                JOptionPane.showMessageDialog(null,"Un probléme lors de la creation de votre compte");
            Client cl=new Client(this);
            this.setVisible(true);
            cl.setVisible(true);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jconnect;
    private javax.swing.JTextField LoginInput;
    private javax.swing.JPasswordField MDPInput;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
