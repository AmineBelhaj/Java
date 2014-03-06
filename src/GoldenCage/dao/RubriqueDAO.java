/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.dao;

import GoldenCage.entities.Rubrique;
import GoldenCage.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author minoo
 */
public class RubriqueDAO {
    public List<Rubrique> DisplayAllRubriques(){
        List<Rubrique>rubriques=new ArrayList<>();
        String requete = "select * from  rubrique";
         try {
             Statement statement = MyConnection.getInstance()
                   .createStatement();
             ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Rubrique rubrique=new Rubrique();
                 rubrique.setIdRubrique(resultat.getInt(1));
                rubrique.setNomRubrique(resultat.getString(2));
                
               
                rubriques.add(rubrique);
            }
            return rubriques;
         }
         catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des prestataires "+ex.getMessage());
            return null;
            }
    }
    
    public int getIdFromNom(String nom){
        int id=0;
        String requete = "select IdRubrique from rubrique where NomRubrique='"+nom+"'";
         try {
             Statement statement = MyConnection.getInstance()
                   .createStatement();
             ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                id=resultat.getInt(1);
            }
            return id;
        }
         catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des prestataires "+ex.getMessage());
            return 0;
            }
    }
    
    public String getNomFromId(int id){
        String Nom="";
        String requete = "select NomRubrique from rubrique where IdRubrique='"+id+"'";
         try {
             Statement statement = MyConnection.getInstance()
                   .createStatement();
             ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Nom=resultat.getString(1);
            }
            return Nom;
        }
         catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des prestataires "+ex.getMessage());
            return Nom;
            }
    }
}
