/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.dao;

import GoldenCage.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import GoldenCage.entities.Reclamation;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo_B
 */
public class ReclamationDAO {
    public void insertReclamation(Reclamation rec){

        String date = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        String time = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        String requete = "insert into reclamation (DateRec, HeureRec,  NoteRec, TextRec, IdPrestataire, IdClient) values (?,?,?,?,?,?);";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setInt(6, rec.getIdClient());
            ps.setInt(5, rec.getIdPrestataire());
            ps.setString(4, rec.getTextRec());
            ps.setInt(3, rec.getNoteRec());
            ps.setString(1, rec.getDateRec());
            ps.setString(2, rec.getTimeRec());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Réclamation envoyée avec succès ");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public int GetNbReclamation(){
        String requete = "Select count(*) from Reclamation ;";
         int nb = 0;
        try {
              Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                nb =resultat.getInt(1);
             }
          return nb+1;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            return nb+1;
        }
    }
    
    
     public List<Reclamation> DisplayAllReclamations (){


        List<Reclamation> listeReclamation = new ArrayList<Reclamation>();

        String requete = "select * from Reclamation";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
              
                Reclamation rec =new Reclamation();
                rec.setIdRec(resultat.getInt(3));
                rec.setIdClient(resultat.getInt(7));
                rec.setIdPrestataire(resultat.getInt(6));
                rec.setTextRec(resultat.getString(5));
                rec.setNoteRec(resultat.getInt(4));
                rec.setDateRec(resultat.getString(1));
                rec.setTimeRec(resultat.getString(2));
                //findById ??????
                listeReclamation.add(rec);
            }
            return listeReclamation;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
     
    
}
