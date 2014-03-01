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
    
}
