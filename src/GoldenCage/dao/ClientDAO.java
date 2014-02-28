/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import GoldenCage.entities.Client;
import GoldenCage.util.MyConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo_B
 */
public class ClientDAO {
    
   public Client authentification(String login,String mdp){
        Client client=new Client();
        String requete = "select * from client where Login='"+login+"' and MotDePasse='"+mdp+"'";
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
                
            }
            return client;
        
        }catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Client innexistant"+ex.getMessage());
            return null;
        }
    }
   
    public Client AuthentificationWithFacebook(String mail){
       Client client=new Client();
        String requete = "select * from client where AdressMail="+mail;
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
                
            }
            return client;
        
        }catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Client innexistant"+ex.getMessage());
            return null;
        }
       }
    public String getLogin(int idclient){
         String requete = "select Login from Client where Idclient=?";
         String soc="";
         try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,idclient);
            ResultSet resultat = ps.executeQuery();
             while(resultat.next()){
                 soc=resultat.getString(1);
             }
          return soc;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return soc;
       }
     }
    public List<Client> DisplayAllPrestataire(){
        List<Client>clients=new ArrayList<>();
        String requete = "select * from client";
         try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Client client=new Client();
                client.setIdClient(resultat.getInt(1));
                client.setLogin(resultat.getString(2));
                client.setMotDePasse(resultat.getString(3));
                client.setNom(resultat.getString(4));
                client.setPrenom(resultat.getString(5));
                client.setNumTel(resultat.getString(6));
                client.setAdressMail(resultat.getString(7));
                String ban=resultat.getString(8);
                if(ban.equals("0"))
                    client.setBannir(false);
                else
                    client.setBannir(true);
                clients.add(client);
            }
            return clients;
         }
         catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des prestataires "+ex.getMessage());
            return null;
            }
    }
    public boolean bannirClient(int id){
         String requete = "update client set bannir=1 where IdClient=?";
         try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
             ps.executeUpdate();
            return true;
          } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return false;
        }
    }
}
