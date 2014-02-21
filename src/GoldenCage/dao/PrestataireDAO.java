/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.dao;

import GoldenCage.entities.Prestataire;
import GoldenCage.util.MyConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author minoo
 */
public class PrestataireDAO {
   
    public List<Prestataire> DisplayAllPrestataire(){
        List<Prestataire>listPrestataire=new ArrayList<>();
        String requete = "select * from prestataire";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            PrestataireDAO prestataireDAO=new PrestataireDAO();
            while(resultat.next()){
                Prestataire prestataire=new Prestataire();
                prestataire.setIdPrestataire(resultat.getInt(1));
                prestataire.setNomSociete(resultat.getString(2));
                prestataire.setLogin(resultat.getString(3));
                prestataire.setMotDePasse(resultat.getString(4));
                prestataire.setAdresse(resultat.getString(5));
                prestataire.setPresentation(resultat.getString(6));
                prestataire.setTel(resultat.getInt(7));
                prestataire.setGSM(resultat.getInt(8));
                prestataire.setFax(resultat.getInt(9));
                prestataire.setAdresseMail(resultat.getString(10));
                prestataire.setSiteWeb(resultat.getString(11));
                prestataire.setPhoto(resultat.getString(12));
                listPrestataire.add(prestataire);
            }
            return listPrestataire;
            } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des prestataires "+ex.getMessage());
            return null;
            }
        }
     public boolean deletePrestataire(int num){

          String requete = "delete from prestataire where IdPrestataire=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
     public boolean ajouterPrestataire(Prestataire prest){
         String requete = "insert into prestataire (NomSociete,Login,MotDePasse,Adresse,Presentation,Tel,GSM,Fax,AdresseMail,SiteWeb,Photo) values (?,?,?,?,?,?,?,?,?,?,?)";
          try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, prest.getNomSociete());
            ps.setString(2, prest.getLogin());
            ps.setString(3, prest.getMotDePasse());
            ps.setString(4, prest.getAdresse());
            ps.setString(5, prest.getPresentation());
            ps.setInt(6, prest.getTel());
            ps.setInt(7, prest.getGSM());
            ps.setInt(8, prest.getFax());
            ps.setString(9, prest.getAdresseMail());
            ps.setString(10, prest.getSiteWeb());
            ps.setString(11, prest.getPhoto());
            ps.executeUpdate();
            return true;
          }catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
            return false;
            }
     }
    
    
}
