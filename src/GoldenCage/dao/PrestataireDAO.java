/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.dao;

import GoldenCage.entities.Prestataire;
import GoldenCage.util.MyConnection;
import java.io.BufferedInputStream;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author minoo
 */
public class PrestataireDAO {
   private int idPres;
   public ImageIcon icon;

    public int getIdPres() {
        return idPres;
    }
    public List<Prestataire> DisplayAllPrestataire(){
        List<Prestataire>listPrestataire=new ArrayList<>();
        String requete = "select * from prestataire";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Prestataire prestataire=new Prestataire();
                prestataire.setIdPrestataire(resultat.getInt(5));
                prestataire.setNomSociete(resultat.getString(8));
                prestataire.setLogin(resultat.getString(6));
                prestataire.setMotDePasse(resultat.getString(7));
                prestataire.setAdresse(resultat.getString(1));
                prestataire.setPresentation(resultat.getString(10));
                prestataire.setTel(resultat.getInt(12));
                prestataire.setGSM(resultat.getInt(4));
                prestataire.setFax(resultat.getInt(3));
                prestataire.setAdresseMail(resultat.getString(2));
                prestataire.setSiteWeb(resultat.getString(11));
                Blob blob = resultat.getBlob(9);
                if(blob!=null)
                     prestataire.setPhoto(new BufferedInputStream(blob.getBinaryStream()));
                prestataire.setIdRubrique(resultat.getInt(13));
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
            ps.setInt(5, num);
            ps.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
     public Prestataire Rechercher (String nomPres){
         String requete = "Select * from prestataire where NomSociete='"+nomPres+"'";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            //ps.setString(1, nomPres);
            // ps.executeUpdate();
            ResultSet resultat = ps.executeQuery(requete);
            Prestataire prestataire=new Prestataire();
            while(resultat.next()){
               prestataire.setIdPrestataire(resultat.getInt(5));
                prestataire.setNomSociete(resultat.getString(8));
                prestataire.setLogin(resultat.getString(6));
                prestataire.setMotDePasse(resultat.getString(7));
                prestataire.setAdresse(resultat.getString(1));
                prestataire.setPresentation(resultat.getString(10));
                prestataire.setTel(resultat.getInt(12));
                prestataire.setGSM(resultat.getInt(4));
                prestataire.setFax(resultat.getInt(3));
                prestataire.setAdresseMail(resultat.getString(2));
                prestataire.setSiteWeb(resultat.getString(11));
                Blob blob = resultat.getBlob(9);
                if(blob!=null)
                     prestataire.setPhoto(new BufferedInputStream(blob.getBinaryStream()));
                prestataire.setIdRubrique(resultat.getInt(13));
            }
            return prestataire;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
     
     public boolean ajouterPrestataire(Prestataire prest,File f){
         String requete = "insert into prestataire (NomSociete,Login,MotDePasse,Adresse,Presentation,Tel,GSM,Fax,AdressMail,SiteWeb,Photo,IdRubrique) values (?,?,?,?,?,?,?,?,?,?,?,?)";
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
                ps.setBinaryStream(11, prest.getPhoto(), (int)f.length());
            ps.setInt(12, prest.getIdRubrique());
            ps.executeUpdate();
            return true;
          }catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
            return false;
            }
     }
     public boolean modifierPrestataire(Prestataire prest){
        String requete = "update prestataire set NomSociete=?, Login=?, MotDePasse=?, Adresse=?, Presentation=?, Tel=?, GSM=?, Fax=?, AdressMail=?, SiteWeb=?, IdRubrique=? where IdPrestataire=?";
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
            ps.setInt(11, prest.getIdRubrique());
            // ps.setBlob(11, prest.getPhoto());
            ps.setInt(12,prest.getIdPrestataire());
           
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return false;
        }
    }
     
     
    public boolean modifierPrestataire(Prestataire prest,File f){
        String requete = "update prestataire set NomSociete=?, Login=?, MotDePasse=?, Adresse=?, Presentation=?, Tel=?, GSM=?, Fax=?, AdressMail=?, SiteWeb=?, Photo=?, IdRubrique=? where IdPrestataire=?";
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
            ps.setBinaryStream(11, prest.getPhoto(), (int)f.length());
           // ps.setBlob(11, prest.getPhoto());
            ps.setInt(12, prest.getIdRubrique());
            ps.setInt(13,prest.getIdPrestataire());
           
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return false;
        }
    }
    public String getNomSociét(int idprest){
         String requete = "select NomSociete from prestataire where IdPrestataire=?";
         String soc="";
         try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,idprest);
            ResultSet resultat = ps.executeQuery();
             while(resultat.next()){
                 soc=resultat.getString(1);
             }
          return soc;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return soc;
       }
     }
    
      public int getIdSociét(String nomSoc){
         String requete = "select IdPrestataire from prestataire where NomSociete=?";
         int idPrest = 0;
         try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,nomSoc);
            ResultSet resultat = ps.executeQuery();
             while(resultat.next()){
                 idPrest=resultat.getInt(1);
             }
          return idPrest;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return idPrest;
       }
     }
    public Prestataire AuthentificationWithLoginMDP(String login,String mdp){
        String requete = "select * from prestataire where Login=? and MotDePasse=?";
         Prestataire prestataire=new Prestataire();
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,login);
            ps.setString(2, mdp);
             ResultSet resultat = ps.executeQuery();
              while (resultat.next())
              {
                 prestataire.setIdPrestataire(resultat.getInt(5));
                prestataire.setNomSociete(resultat.getString(8));
                prestataire.setLogin(resultat.getString(6));
                prestataire.setMotDePasse(resultat.getString(7));
                prestataire.setAdresse(resultat.getString(1));
                prestataire.setPresentation(resultat.getString(10));
                prestataire.setTel(resultat.getInt(12));
                prestataire.setGSM(resultat.getInt(4));
                prestataire.setFax(resultat.getInt(3));
                prestataire.setAdresseMail(resultat.getString(2));
                prestataire.setSiteWeb(resultat.getString(11));
                Blob blob = resultat.getBlob(9);
                if(blob!=null)
                     prestataire.setPhoto(new BufferedInputStream(blob.getBinaryStream()));
                prestataire.setIdRubrique(resultat.getInt(13));
               }
              return prestataire;
            } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return null;
       }
    }
    public Prestataire AuthentificationWithMail(String mail){
        String requete = "select * from prestataire where AdressMail='"+mail+"'";
        Prestataire prestataire=new Prestataire();
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
             ResultSet resultat = ps.executeQuery();
              while (resultat.next())
              {
                 prestataire.setIdPrestataire(resultat.getInt(5));
                prestataire.setNomSociete(resultat.getString(8));
                prestataire.setLogin(resultat.getString(6));
                prestataire.setMotDePasse(resultat.getString(7));
                prestataire.setAdresse(resultat.getString(1));
                prestataire.setPresentation(resultat.getString(10));
                prestataire.setTel(resultat.getInt(12));
                prestataire.setGSM(resultat.getInt(4));
                prestataire.setFax(resultat.getInt(3));
                prestataire.setAdresseMail(resultat.getString(2));
                prestataire.setSiteWeb(resultat.getString(11));
                prestataire.setIdRubrique(resultat.getInt(13));
                Blob blob = resultat.getBlob(9);
                icon = new ImageIcon(blob.getBytes(1, (int)blob.length()));
                if(blob!=null)
                     prestataire.setPhoto(new BufferedInputStream(blob.getBinaryStream()));
                
               }
              return prestataire;
            } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return null;
       }
    }
    public boolean VerifierBD(String nameob,String ob){
        String requete = "Select * from prestataire where "+nameob+"='"+ob+"'";
        boolean verif=false;
        if(!ob.equals(""))
            try {
                PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);          
                ResultSet resultat = ps.executeQuery(requete);
                Prestataire prestataire=new Prestataire();
                while(resultat.next()){
                    verif=true;
                }
                return verif;
                } catch (SQLException ex) {
                return false;
        }
        else{
            return true;
        }
    }
}
