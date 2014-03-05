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
import javax.swing.ImageIcon;


/**
 *
 * @author lenovo_B
 */
public class ProduitDAO {
    
    public List<Produit> Rechercher (String nomPrest){
         String requete = "Select IdProduit,NomProduit,p1.Photo,CoutProduit,CoutSolde,DescriptionProduit,p1.IdPrestataire,IdCategorie from produit p1 ,Prestataire p2 where p1.IdPrestataire=p2.IdPrestataire and NomSociete='"+nomPrest+"' ;";
        try {
            Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
//            
            List<Produit>listProduit=new ArrayList<>();
            ImageIcon icon;
            while(resultat.next()){
                Produit produit=new Produit();
                produit.setIdProduit(resultat.getInt(1));
                produit.setIdCategorie(resultat.getInt(8));
                produit.setNomProduit(resultat.getString(2));
                Blob blob = resultat.getBlob(3);
                icon = new ImageIcon(blob.getBytes(1, (int)blob.length()));
                produit.setPhotoProduit(icon);
                produit.setDescriptionProduit(resultat.getString(6));
                produit.setCoutProduit(resultat.getInt(4));
                produit.setCoutSolde(resultat.getInt(5));
                listProduit.add(produit);
            }
            return listProduit;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
    
    
    public List<Produit> DisplayAllProduit(){
        List<Produit>listProduit=new ArrayList<>();
        String requete = "select * from produit";
        ImageIcon icon;
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ProduitDAO ProduitDAO=new ProduitDAO();
            while(resultat.next()){
                Produit produit=new Produit();
             
                produit.setNomProduit(resultat.getString(1));
                Blob blob = resultat.getBlob(3);
                icon = new ImageIcon(blob.getBytes(1, (int)blob.length()));
                produit.setPhotoProduit(icon);
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
           // ps.setString(2, prod.getPhotoProduit());
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
            //ps.setString(2, prod.getPhotoProduit());
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
