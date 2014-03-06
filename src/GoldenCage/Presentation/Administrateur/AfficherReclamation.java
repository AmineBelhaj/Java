/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Presentation.Administrateur;

import GoldenCage.dao.ClientDAO;
import GoldenCage.dao.CritereClient;
import GoldenCage.dao.CritereDate;
import GoldenCage.dao.CriterePrestataire;
import GoldenCage.dao.PrestataireDAO;
import GoldenCage.dao.ReclamationDAO;
import GoldenCage.entities.Reclamation;
import java.util.Collections;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author minoo
 */
public class AfficherReclamation extends AbstractTableModel{
    List<Reclamation>reclamations;
    String [] columnTab={"Client","NomSociété","Text","Note","Date"};
    public AfficherReclamation(String critere){
      
        ReclamationDAO reclamationDAO=new ReclamationDAO();
        reclamations=reclamationDAO.DisplayAllReclamations();
        if(critere.equals("Date"))
           Collections.sort(reclamations,new CritereDate());
        if(critere.equals("Prestataire"))
            Collections.sort(reclamations,new CriterePrestataire());
        if(critere.equals("Client"))
            Collections.sort(reclamations,new CritereClient());
    }
    @Override
    public int getRowCount() {
        return reclamations.size();
    }

    @Override
    public int getColumnCount() {
        return columnTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PrestataireDAO prestataireDAO=new PrestataireDAO();
        ClientDAO clientDAO=new ClientDAO();
        switch (columnIndex){
            
            case 0:return clientDAO.getLogin(reclamations.get(rowIndex).getIdClient());
            case 1:return prestataireDAO.getNomSociét(reclamations.get(rowIndex).getIdPrestataire());
            case 2:return reclamations.get(rowIndex).getTextRec();
            case 3:return reclamations.get(rowIndex).getNoteRec();
            case 4:return reclamations.get(rowIndex).getDateRec();
            default:return null;
                
        }
    }
    @Override
    public String getColumnName(int column) {
        return columnTab[column];
    }
}
