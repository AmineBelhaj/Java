/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Prestataire;
import GoldenCage.dao.ProduitDAO;

import GoldenCage.entities.Produit;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author minoo
 */
public class Afficherservice extends AbstractTableModel{

     List<Produit>produits;
     String [] columnTab={"IdProduit","NomProduit","PhotoProduit","DescriptionProduit","CoutProduit","CoutSolde"};
  
     public Afficherservice(){
         ProduitDAO ProduitDAO=new ProduitDAO();
         produits=ProduitDAO.DisplayAllProduit();
     }
     
     @Override
    public int getRowCount() {
        System.out.println(produits.size());
        return produits.size();
    }

    @Override
    public int getColumnCount() {
        return columnTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0 :return produits.get(rowIndex).getIdProduit();
            case 1 :return produits.get(rowIndex).getNomProduit();
            case 2 :return produits.get(rowIndex).getPhotoProduit();
            case 3 :return produits.get(rowIndex).getDescriptionProduit();
            case 4 :return produits.get(rowIndex).getCoutProduit();
            case 5 :return produits.get(rowIndex).getCoutSolde();
       
            
            default:return null;
        }
    }
     @Override
    public String getColumnName(int column) {
        return columnTab[column];
    }
}
