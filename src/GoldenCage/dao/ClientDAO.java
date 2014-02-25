/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.dao;

import GoldenCage.entities.Admin;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import GoldenCage.entities.Client;
import GoldenCage.util.MyConnection;
import java.sql.ResultSet;

/**
 *
 * @author lenovo_B
 */
public class ClientDAO {
    
   public Client authentification(String login,String mdp){
        Client client=new Client();
        String requete = "select * from cient where Login='"+login+"' and MotDePasse='"+mdp+"'";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
        while (resultat.next())
            { 
                client.setIdClient(resultat.getInt(1));
                client.setLogin(resultat.getString(2));
                client.setMotDePasse(resultat.getString(3));
                client.setNom(resultat.getString(4));
                client.setPrenom(resultat.getString(5));
                client.setNumTel(resultat.getString(6));
                client.setAdressMail(resultat.getString(7));
                client.setIdPanier(resultat.getInt(8));
            }
            return client;
        
        }catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Client innexistant"+ex.getMessage());
            return null;
        }
    }
    
}
