/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.dao;

import GoldenCage.entities.Produit;
import GoldenCage.util.MyConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author minoo
 */
public class ProduitDAO {
   
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
                produit.setIdProduit(resultat.getInt(1));
                produit.setNomProduit(resultat.getString(2));
                produit.setPhotoProduit(resultat.getString(3));
                produit.setDescriptionProduit(resultat.getString(4));
                produit.setCoutProduit(resultat.getFloat(5));
                produit.setCoutsolde(resultat.getFloat(6));
                
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
         String requete = "insert into produit (NomProduit,PhotoProduit,DescriptionProduit,CoutProduit,Coutsolde) values (?,?,?,?,?)";
          try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, prod.getNomProduit());
            ps.setString(2, prod.getPhotoProduit());
            ps.setString(3, prod.getDescriptionProduit());
            ps.setFloat(4, prod.getCoutProduit());
            ps.setFloat(5, prod.getCoutsolde());
           
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
            ps.setFloat(4, prod.getCoutProduit());
            ps.setFloat(5, prod.getCoutsolde());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return false;
        }
    }
    
}
