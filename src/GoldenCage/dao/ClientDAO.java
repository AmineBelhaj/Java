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
                client.setIdClient(resultat.getInt(3));
                client.setLogin(resultat.getString(4));
                client.setMotDePasse(resultat.getString(5));
                client.setNom(resultat.getString(6));
                client.setPrenom(resultat.getString(8));
                client.setNumTel(resultat.getString(7));
                client.setAdressMail(resultat.getString(1)); 
                if(resultat.getInt(2)==0)
                    client.setBannir(true);
                else
                    client.setBannir(false);
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
        String requete = "select * from client where AdressMail='"+mail+"'";
        try {
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
        while (resultat.next())
            { 
                client.setIdClient(resultat.getInt(3));
                client.setLogin(resultat.getString(4));
                client.setMotDePasse(resultat.getString(5));
                client.setNom(resultat.getString(6));
                client.setPrenom(resultat.getString(8));
                client.setNumTel(resultat.getString(7));
                client.setAdressMail(resultat.getString(1));
                 if(resultat.getInt(2)==0)
                    client.setBannir(true);
                else
                    client.setBannir(false);
                
            }
            return client;
        
        }catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Client innexistant"+ex.getMessage());
            return null;
        }
       }
    
    public Client getClientFromLogin(String login){
        String requete = "select * from Client where Login=?";
         String soc="";
         Client client=new Client();
         try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,login);
            ResultSet resultat = ps.executeQuery();
             while(resultat.next()){
                 client.setIdClient(resultat.getInt(3));
                client.setLogin(resultat.getString(4));
                client.setMotDePasse(resultat.getString(5));
                client.setNom(resultat.getString(6));
                client.setPrenom(resultat.getString(8));
                client.setNumTel(resultat.getString(7));
                client.setAdressMail(resultat.getString(1));
               if(resultat.getInt(2)==0)
                    client.setBannir(true);
                else
                    client.setBannir(false);
             }
             return client;
          
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
            return client;
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
                 client.setIdClient(resultat.getInt(3));
                client.setLogin(resultat.getString(4));
                client.setMotDePasse(resultat.getString(5));
                client.setNom(resultat.getString(6));
                client.setPrenom(resultat.getString(8));
                client.setNumTel(resultat.getString(7));
                client.setAdressMail(resultat.getString(1));
                if(resultat.getInt(2)==0)
                    client.setBannir(true);
                else
                    client.setBannir(false);
                /*String ban=resultat.getString(2);
                if(ban.equals("0"))
                    client.setBannir(false);
                else
                    client.setBannir(true);*/
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
         String requete = "update client set bannir=0 where IdClient=?";
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
    
    
     public int Rechercher (String nomClient){
         String requete = "Select IdClient from Client where Login='"+nomClient.toString()+"';";
         int idClient = 0;
        try {
              Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                idClient =resultat.getInt(1);
             }
          return idClient;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            return idClient;
        }
     }
    
    
    public boolean ajouterClient(Client cli){
         String requete = "insert into client (Login,MotDePasse,Nom,Prenom,NumTel,AdressMail,Banir) values (?,?,?,?,?,?,?)";
          try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, cli.getLogin());
            ps.setString(2, cli.getMotDePasse());
            ps.setString(3, cli.getNom());
            ps.setString(4, cli.getPrenom());
            ps.setString(5, cli.getNumTel());
            ps.setString(6, cli.getAdressMail());
            if(cli.isBannir())
                ps.setInt(7, 0);
            else
                ps.setInt(7, 1);
           
            ps.executeUpdate();
            return true;
          }catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
            return false;
            }
     }
}
