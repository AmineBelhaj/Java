package GoldenCage.Presentation.Clientpack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import GoldenCage.Presentation.Clientpack.ImageProd;

import GoldenCage.dao.ClientDAO;
import GoldenCage.dao.PrestataireDAO;
import GoldenCage.dao.ReclamationDAO;
import GoldenCage.entities.Client;
import GoldenCage.entities.Prestataire;
import GoldenCage.entities.Reclamation;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author lenovo_B
 */
public class InfoPrestataire extends javax.swing.JFrame {

    /**
     * Creates new form InfoPrestataire
     */
    JLabel lbl[][] = new JLabel[5][5];

    String nom;
    int note = 0;
    String nomClient;
    int idClient =0 ;
    
    InfoPrestataire() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public InfoPrestataire(String nomCli) {
        nomClient=nomCli;
        System.out.println(nomClient);
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //jPanel2.setVisible(false);
    }
    

    public JLabel getLblNom() {
        return lblNom;
    }

   
    public JLabel getLblAdresse() {
        return lblAdresse;
    }

    public JLabel getLblFax() {
        return lblFax;
    }

    public JLabel getLblMail() {
        return lblMail;
    }

    public JLabel getLblPhoto() {
        return lblPhoto;
    }

    public JLabel getLblTel() {
        return lblTel;
    }

    public JTextArea getLblDescription() {
        return lblDescription;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblAdresse = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblDescription = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lblCommentaire = new javax.swing.JTextArea();
        btCommenter = new javax.swing.JButton();
        vote1 = new javax.swing.JLabel();
        vote2 = new javax.swing.JLabel();
        vote4 = new javax.swing.JLabel();
        vote3 = new javax.swing.JLabel();
        lblRedigerCommentaire = new javax.swing.JLabel();
        lblConsulterProduit = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        lblNom.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel1.setText("Présentataion");

        jLabel2.setText("Contact :");

        jLabel3.setText("Adresse :");

        jLabel4.setText("Fax :");

        jLabel5.setText("Mail :");

        jLabel6.setText("Description :");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        lblDescription.setEditable(false);
        lblDescription.setColumns(20);
        lblDescription.setRows(5);
        lblDescription.setMaximumSize(new java.awt.Dimension(60, 20));
        jScrollPane1.setViewportView(lblDescription);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 102, 204)));

        lblCommentaire.setColumns(20);
        lblCommentaire.setRows(5);
        jScrollPane3.setViewportView(lblCommentaire);

        btCommenter.setText("Commenter");
        btCommenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCommenterActionPerformed(evt);
            }
        });

        vote1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/vote_Jaune1.png"))); // NOI18N
        vote1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vote1MouseClicked(evt);
            }
        });

        vote2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/vote_Jaune1.png"))); // NOI18N
        vote2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vote2MouseClicked(evt);
            }
        });

        vote4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/vote_Jaune1.png"))); // NOI18N
        vote4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vote4MouseClicked(evt);
            }
        });

        vote3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/vote_Jaune1.png"))); // NOI18N
        vote3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vote3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(vote1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(vote2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(vote3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(vote4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 636, Short.MAX_VALUE)
                        .addComponent(btCommenter, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCommenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vote1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vote2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vote4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vote3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblRedigerCommentaire.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        lblRedigerCommentaire.setText("Rédiger Commentaire");
        lblRedigerCommentaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRedigerCommentaireMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRedigerCommentaireMouseExited(evt);
            }
        });
        lblRedigerCommentaire.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblRedigerCommentaireMouseMoved(evt);
            }
        });

        lblConsulterProduit.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        lblConsulterProduit.setText("Consulter le produits");
        lblConsulterProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConsulterProduitMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsulterProduitMouseClicked(evt);
            }
        });
        lblConsulterProduit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblConsulterProduitMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblRedigerCommentaire)
                                .addGap(34, 34, 34)
                                .addComponent(lblConsulterProduit)))
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblFax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblMail))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRedigerCommentaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConsulterProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCommenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCommenterActionPerformed
        // TODO add your handling code here:
        Client client ;
        PrestataireDAO p = new PrestataireDAO();
        int idPrestataire;
        idPrestataire = p.getIdSociét(lblNom.getText());
        ClientDAO c = new ClientDAO();
        idClient = c.Rechercher(nomClient);
        String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        String time = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        Reclamation rec = new Reclamation();
        ReclamationDAO r = new ReclamationDAO();
        rec.setIdRec(r.GetNbReclamation());
        rec.setIdClient(c.Rechercher(nomClient));
        rec.setIdPrestataire(idPrestataire);
        rec.setTextRec(lblCommentaire.getText());
        rec.setNoteRec(note);
        rec.setDateRec(date);
        rec.setTimeRec(time);
        ReclamationDAO r1 = new ReclamationDAO();
        r1.insertReclamation(rec);
       
    }//GEN-LAST:event_btCommenterActionPerformed

    private void lblRedigerCommentaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRedigerCommentaireMouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(true);
        
    }//GEN-LAST:event_lblRedigerCommentaireMouseClicked

    private void lblRedigerCommentaireMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRedigerCommentaireMouseMoved
        // TODO add your handling code here:
	lblRedigerCommentaire.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRedigerCommentaire.setForeground(new Color(153, 0, 153));
    }//GEN-LAST:event_lblRedigerCommentaireMouseMoved

    private void lblRedigerCommentaireMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRedigerCommentaireMouseExited
        // TODO add your handling code here:
        lblRedigerCommentaire.setText("Rédiger Commentaire");
        lblRedigerCommentaire.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblRedigerCommentaireMouseExited

    private void lblConsulterProduitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsulterProduitMouseMoved
        // TODO add your handling code here:
	lblConsulterProduit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsulterProduit.setForeground(new Color(153, 0, 153));
    }//GEN-LAST:event_lblConsulterProduitMouseMoved

    private void lblConsulterProduitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsulterProduitMouseExited
        // TODO add your handling code here:
        lblConsulterProduit.setText("Consulter les produits");
        lblConsulterProduit.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblConsulterProduitMouseExited

    private void lblConsulterProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsulterProduitMouseClicked
        // TODO add your handling code here:
        ImageProd listeProduit = new ImageProd(lblNom.getText());
        listeProduit.setVisible(true);
    }//GEN-LAST:event_lblConsulterProduitMouseClicked

    private void vote1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vote1MouseClicked

        // TODO add your handling code here:

        vote1.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Rouge1.png")));
        note = 25;
        vote2.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Jaune1.png")));
        vote3.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Jaune1.png")));
        vote4.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Jaune1.png")));
       
    }//GEN-LAST:event_vote1MouseClicked

    private void vote2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vote2MouseClicked
        // TODO add your handling code here:
        vote1.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Rouge1.png")));
        vote2.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Rouge1.png")));
        vote3.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Jaune1.png")));
        vote4.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Jaune1.png")));
        note=50;
    }//GEN-LAST:event_vote2MouseClicked

    private void vote3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vote3MouseClicked
        // TODO add your handling code here:
        vote1.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Rouge1.png")));
        vote2.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Rouge1.png")));
        vote3.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Rouge1.png")));
        vote4.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Jaune1.png")));
        note=75;
    }//GEN-LAST:event_vote3MouseClicked

    private void vote4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vote4MouseClicked
        // TODO add your handling code here:

        vote1.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Rouge1.png")));
        vote2.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Rouge1.png")));
        vote3.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Rouge1.png")));
        vote4.setIcon(new ImageIcon(getClass().getResource("/resources/vote_Rouge1.png")));
        note=100;
    }//GEN-LAST:event_vote4MouseClicked

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
            java.util.logging.Logger.getLogger(InfoPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoPrestataire().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCommenter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAdresse;
    private javax.swing.JTextArea lblCommentaire;
    private javax.swing.JLabel lblConsulterProduit;
    private javax.swing.JTextArea lblDescription;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblRedigerCommentaire;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel vote1;
    private javax.swing.JLabel vote2;
    private javax.swing.JLabel vote3;
    private javax.swing.JLabel vote4;
    // End of variables declaration//GEN-END:variables

}
