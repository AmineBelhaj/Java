/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.Presentation.Clientpack;

import GoldenCage.dao.CritereClient;
import GoldenCage.dao.CritereDate;
import GoldenCage.dao.CriterePrestataire;
import GoldenCage.dao.CriterePrix;
import GoldenCage.dao.ProduitDAO;
import GoldenCage.entities.Produit;
import java.util.Collections;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo_B
 */
public class AfficherProduits extends AbstractTableModel{
    List<Produit>produits;
    int idPres;
     String [] columnTab={"Nom produit","Description","Coût","Prix soldé"};
   
     public AfficherProduits(){
         ProduitDAO produitDAO=new ProduitDAO();
         produits=produitDAO.DisplayAllProduit();
        /*if(critere.equals("Afficher les offres"))
           Collections.sort(produits,new CritereDate());
        if(critere.equals("Trier selon prix"))
            Collections.sort(produits,new CriterePrix());*/
     }
   
    
    
    @Override
    public int getRowCount() {
        return produits.size();    
    }

    @Override
    public int getColumnCount() {
        return columnTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex){
            case 0 :return produits.get(rowIndex).getNomProduit();
            case 1 :return produits.get(rowIndex).getDescriptionProduit();
            case 2 :return produits.get(rowIndex).getCoutProduit();
            case 3 :return produits.get(rowIndex).getCoutSolde();
            
            default:return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return columnTab[column];
    }
    
}
