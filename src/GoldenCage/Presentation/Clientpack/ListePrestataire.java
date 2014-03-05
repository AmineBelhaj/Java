/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.Presentation.Clientpack;
import GoldenCage.Presentation.Administrateur.*;
import GoldenCage.dao.PrestataireDAO;
import GoldenCage.entities.Prestataire;
import GoldenCage.util.MyConnection;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author lenovo_B
 */
public class ListePrestataire extends javax.swing.JPanel {
    /**
     * Creates new form ListePrestataire
     */
    AfficherPrestatairePourClient A = new AfficherPrestatairePourClient();
    public String nomPres;
    
    public ListePrestataire() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTable1.setModel(A);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jTable1.setRowHeight(40);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
            if (evt.getClickCount() == 2) {
             nomPres=(String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
             PrestataireDAO p = new PrestataireDAO();
             Prestataire prest ;
             InfoPrestataire info = new InfoPrestataire();
             prest=p.Rechercher(nomPres);
             info.setNom(prest.getNomSociete());
             info.getLblNom().setText(prest.getNomSociete());
             info.getLblAdresse().setText(prest.getAdresse());
             info.getLblDescription().setLineWrap(true);
             info.getLblDescription().append(prest.getPresentation());
             info.getLblFax().setText(prest.getFax()+"");
             info.getLblMail().setText(prest.getAdresseMail());
             info.getLblTel().setText(prest.getTel()+"");
             //Affichage de l'image
             info.getLblPhoto().setIcon(p.icon);
             info.setVisible(true);
             this.setVisible(false);
         }
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
