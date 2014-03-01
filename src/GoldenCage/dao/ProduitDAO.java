/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.dao;

import GoldenCage.entities.Prestataire;
import GoldenCage.entities.Produit;
import GoldenCage.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import GoldenCage.entities.Produit;
import GoldenCage.util.MyConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author lenovo_B
 */
public class ProduitDAO {
    
    public Produit Rechercher (int IdPrestataire){
         String requete = "Select * from sousrubrique,prestatairesousrubrique  where sousrubrique.IdSR=prestatairesousrubrique.IdSR and IdPrestataire=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, IdPrestataire);
            ps.executeUpdate();
            ResultSet resultat = ps.executeQuery(requete);
            Produit produit=new Produit();
            while(resultat.next()){
                produit.setIdProduit(resultat.getInt(1));
                produit.setIdSR(resultat.getInt(2));
                produit.setIdCategorie(resultat.getInt(3));
                produit.setNomProduit(resultat.getString(4));
                produit.setPhotoProduit(resultat.getString(5));
                produit.setDescriptionProduit(resultat.getString(6));
                produit.setCoutProduit(resultat.getInt(7));
                produit.setCoutSolde(resultat.getInt(8));
            }
            return produit;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
    
    
    public List<Produit> DisplayAllProduit(){
        List<Produit>listProduit=new ArrayList<>();
        String requete = "select * from produit";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ProduitDAO ProduitDAO=new ProduitDAO();
            while(resultat.next()){
                Produit produit=new Produit();
             
                produit.setNomProduit(resultat.getString(1));
                produit.setPhotoProduit(resultat.getString(2));
                produit.setDescriptionProduit(resultat.getString(3));
                produit.setCoutProduit(resultat.getFloat(4));
                //produit.setCoutsolde(resultat.getFloat(6));
                
                listProduit.add(produit);
            }
            return listProduit;
            } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des services "+ex.getMessage());
            return null;
            }
        }
     public boolean deleteProduit(int num){

          String requete = "delete from produit where IdProduit=?";
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
     
     public boolean ajouterProduit(Produit prod){
         String requete = "insert into produit (NomProduit,PhotoProduit,DescriptionProduit,CoutProduit) values (?,?,?,?)";
          try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, prod.getNomProduit());
            ps.setString(2, prod.getPhotoProduit());
            ps.setString(3, prod.getDescriptionProduit());
            ps.setDouble(4, prod.getCoutProduit());
            
           
            ps.executeUpdate();
            return true;
          }catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
            return false;
            }
     }
    public boolean modifierProduit(Produit prod){
        String requete = "update produit set NomProduit=?, PhotoProduit=?, DescriptionProduit=?, CoutProduit=?, Coutsolde=? where IdProduit=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, prod.getNomProduit());
            ps.setString(2, prod.getPhotoProduit());
            ps.setString(3, prod.getDescriptionProduit());
            ps.setDouble(4, prod.getCoutProduit());
            ps.setDouble(5, prod.getCoutSolde());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise Ã  jour "+ex.getMessage());
            return false;
        }
    }
    
}
