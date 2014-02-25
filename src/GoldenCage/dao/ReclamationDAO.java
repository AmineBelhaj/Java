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
import java.util.*;

/**
 *
 * @author lenovo_B
 */
public class ReclamationDAO {
    public void insertReclamation(Reclamation rec){

        String requete = "insert into depot (IdRec,IdClient,IdPrestataire,TextRec,NoteRec,DateRec) values ("+rec.getIdRec()+","+rec.getIdClient()+","+rec.getIdPrestataire()+","+rec.getTextRec()+","+rec.getNoteRec()+","+rec.getDateRec()+");";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, rec.getIdRec());
            ps.setInt(2, rec.getIdClient());
            ps.setInt(3, rec.getIdPrestataire());
            ps.setString(4, rec.getTextRec());
            ps.setInt(5, rec.getNoteRec());
           // ps.setDate(6, rec.getDateRec());
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
                rec.setIdRec(resultat.getInt(1));
                rec.setIdClient(resultat.getInt(2));
                rec.setIdPrestataire(resultat.getInt(3));
                rec.setTextRec(resultat.getString(4));
                rec.setNoteRec(resultat.getInt(5));
                rec.setDateRec(resultat.getDate(6));
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
