/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Presentation.Administrateur;

import GoldenCage.dao.PrestataireDAO;
import GoldenCage.dao.RubriqueDAO;
import GoldenCage.entities.Prestataire;
import GoldenCage.entities.Rubrique;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author minoo
 */
public class AfficherPrestataire extends AbstractTableModel{

     List<Prestataire>prestataires;
     String [] columnTab={"NomSociete","Login","MotDePasse","Adresse","Presentation","Tel","GSM","Fax","AdresseMail","SiteWeb","Rubrique"};
   
     public AfficherPrestataire(){
         PrestataireDAO prestataireDAO=new PrestataireDAO();
         prestataires=prestataireDAO.DisplayAllPrestataire();
        

     }
     
     @Override
    public int getRowCount() {
        return prestataires.size();
    }

    @Override
    public int getColumnCount() {
        return columnTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         RubriqueDAO rubriqueDAO=new RubriqueDAO();
         
        switch (columnIndex){
            
            case 0 :return prestataires.get(rowIndex).getNomSociete();
            case 1 :return prestataires.get(rowIndex).getLogin();
            case 2 :return prestataires.get(rowIndex).getMotDePasse();
            case 3 :return prestataires.get(rowIndex).getAdresse();
            case 4 :return prestataires.get(rowIndex).getPresentation();
            case 5 :return prestataires.get(rowIndex).getTel();
            case 6 :return prestataires.get(rowIndex).getGSM();
            case 7 :return prestataires.get(rowIndex).getFax();
            case 8 :return prestataires.get(rowIndex).getAdresseMail();
            case 9 :return prestataires.get(rowIndex).getSiteWeb();
            case 10:return prestataires.get(rowIndex).getIdRubrique();
            default:return null;
        }
    }
     @Override
    public String getColumnName(int column) {
        return columnTab[column];
    }
}
