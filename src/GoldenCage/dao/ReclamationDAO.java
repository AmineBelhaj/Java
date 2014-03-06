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

/**
 *
 * @author lenovo_B
 */
public class ReclamationDAO {
    public void insertReclamation(Reclamation rec){

        String date = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        String time = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        String requete = "insert into reclamation (DateRec, HeureRec, IdRec, NoteRec, TextRec, IdPrestataire, IdClient) values ("+date+","+time+",NULL,"+rec.getNoteRec()+","+rec.getTextRec()+","+rec.getIdPrestataire()+","+rec.getIdClient()+");";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(3, rec.getIdRec());
            ps.setInt(7, rec.getIdClient());
            ps.setInt(6, rec.getIdPrestataire());
            ps.setString(5, rec.getTextRec());
            ps.setInt(4, rec.getNoteRec());
            ps.setString(1, rec.getDateRec());
            ps.setString(2, rec.getTimeRec());
            ps.executeUpdate();
            System.out.println("Réclamation ajoutée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
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
