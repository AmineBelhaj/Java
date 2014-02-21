/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Presentation.Administrateur;

import GoldenCage.dao.PrestataireDAO;
import GoldenCage.entities.Prestataire;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author minoo
 */
public class AfficherPrestataire extends AbstractTableModel{

     List<Prestataire>prestataires;
     String [] columnTab={"IdPrestataire","NomSociete","Login","MotDePasse","Adresse","Presentation","Tel","GSM","Fax","AdresseMail","SiteWeb","Photo"};
   
     public AfficherPrestataire(){
         PrestataireDAO prestataireDAO=new PrestataireDAO();
         prestataires=prestataireDAO.DisplayAllPrestataire();
     }
     
     @Override
    public int getRowCount() {
        System.out.println(prestataires.size());
        return prestataires.size();
    }

    @Override
    public int getColumnCount() {
        return columnTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0 :return prestataires.get(rowIndex).getIdPrestataire();
            case 1 :return prestataires.get(rowIndex).getNomSociete();
            case 2 :return prestataires.get(rowIndex).getLogin();
            case 3 :return prestataires.get(rowIndex).getMotDePasse();
            case 4 :return prestataires.get(rowIndex).getAdresse();
            case 5 :return prestataires.get(rowIndex).getPresentation();
            case 6 :return prestataires.get(rowIndex).getTel();
            case 7 :return prestataires.get(rowIndex).getGSM();
            case 8 :return prestataires.get(rowIndex).getFax();
            case 9 :return prestataires.get(rowIndex).getAdresseMail();
            case 10 :return prestataires.get(rowIndex).getSiteWeb();
            case 11 :return prestataires.get(rowIndex).getPhoto() ;
            
            default:return null;
        }
    }
     @Override
    public String getColumnName(int column) {
        return columnTab[column];
    }
}
