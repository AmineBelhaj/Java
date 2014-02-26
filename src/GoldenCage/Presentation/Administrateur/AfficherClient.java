/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Presentation.Administrateur;

import GoldenCage.dao.ClientDAO;
import GoldenCage.entities.Client;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author minoo
 */
public class AfficherClient extends AbstractTableModel{
    List<Client>clients;
    String [] columnTab;

    public AfficherClient() {
        this.columnTab = new String[]{"IdClient", "Login", "MotDePasse", "Nom", "Prenom", "Numéro Tel", "AdressMail","Banni"};
        ClientDAO clientDAO=new ClientDAO();
        clients=clientDAO.DisplayAllPrestataire();
    }

    @Override
    public int getRowCount() {
            return clients.size();
    }

    @Override
    public int getColumnCount() {
        return columnTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0 :return clients.get(rowIndex).getIdClient();
            case 1 :return clients.get(rowIndex).getLogin();
            case 2 :return clients.get(rowIndex).getMotDePasse();
            case 3 :return clients.get(rowIndex).getNom();
            case 4 :return clients.get(rowIndex).getPrenom();
            case 5 :return clients.get(rowIndex).getNumTel();
            case 6 :return clients.get(rowIndex).getAdressMail();
            case 7: if(clients.get(rowIndex).isBannir())
                    return "Oui";
                    else
                    return "Non";
            default:return null;
        }
    }
}
