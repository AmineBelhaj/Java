/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.Presentation.Clientpack;

import GoldenCage.dao.ProduitDAO;
import GoldenCage.entities.Produit;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo_B
 */
public class AfficherProduits extends AbstractTableModel{
    List<Produit>produits;
    int idPres;
     String [] columnTab={"Photo","Nom produit","Description","Coût","Prix soldé"};
   
     public AfficherProduits(){
         ProduitDAO produitDAO=new ProduitDAO();
         produits=(List<Produit>) produitDAO.Rechercher(idPres);
         System.out.println(idPres);
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
            case 0 :return produits.get(rowIndex).getPhotoProduit();
            case 1 :return produits.get(rowIndex).getNomProduit();
            case 2 :return produits.get(rowIndex).getDescriptionProduit();
            case 3 :return produits.get(rowIndex).getCoutProduit();
            case 4 :return produits.get(rowIndex).getCoutSolde();
            
            default:return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return columnTab[column];
    }
    
}
