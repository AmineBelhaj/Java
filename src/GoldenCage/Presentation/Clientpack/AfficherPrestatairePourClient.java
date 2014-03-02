package GoldenCage.Presentation.Clientpack;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import GoldenCage.dao.PrestataireDAO;
import GoldenCage.entities.Prestataire;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo_B
 */
public class AfficherPrestatairePourClient extends AbstractTableModel{
     private int idPres ;

    public int getIdPres() {
        return idPres;
    }
     List<Prestataire>prestataires;
     String [] columnTab={"NomSociete","Adresse","Tel","GSM","Fax","AdresseMail","SiteWeb"};
   
     public AfficherPrestatairePourClient(){
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
        switch (columnIndex){
            case 0 :return prestataires.get(rowIndex).getNomSociete();
            case 1 :return prestataires.get(rowIndex).getAdresse();
            case 2 :return prestataires.get(rowIndex).getTel();
            case 3 :return prestataires.get(rowIndex).getGSM();
            case 4 :return prestataires.get(rowIndex).getFax() ;
            case 5 :return prestataires.get(rowIndex).getAdresseMail();
            case 6 :return prestataires.get(rowIndex).getSiteWeb();
            default:return null;
        }
    }
     @Override
    public String getColumnName(int column) {
        return columnTab[column];
    }
    
}
