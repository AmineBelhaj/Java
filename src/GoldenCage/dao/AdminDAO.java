/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.dao;

import java.sql.*;
import GoldenCage.entities.Admin;
import GoldenCage.util.MyConnection;

/**
 *
 * @author minoo
 */
public class AdminDAO {
    
    public Admin authentification(String login,String mdp){
        Admin admin=new Admin();
        String requete = "select * from administrateur where Login='"+login+"' and MotDePasse='"+mdp+"'";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
        while (resultat.next())
            {
                admin.setIdAdmin(resultat.getInt(1));
                admin.setLogin(resultat.getString(2));
                admin.setMotDePasse(resultat.getString(3));
                admin.setDateDerniereVisite(resultat.getString(4));
            }
            return admin;
        
        }catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Admin innexistant"+ex.getMessage());
            return null;
        }
    }
}
