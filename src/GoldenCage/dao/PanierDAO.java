/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.dao;

import GoldenCage.entities.Produit;
import GoldenCage.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo_B
 */
public class PanierDAO {
        public boolean InsertIntoPanier(int idClient, int idProduit){
         String requete = "insert into panier (IdClient,IdProduit) values (?,?)";
          try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, idClient);
            ps.setInt(2, idProduit);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Produit ajouté avec succès ");
            return true;
          }catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
            return false;
            }
     }
}
