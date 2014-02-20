/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.entities;

/**
 *
 * @author minoo
 */
public class Admin {
    private int idAdmin;
    private String login;
    private String motDePasse;
    private String dateDerniereVisite;

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getLogin() {
        return login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getDateDerniereVisite() {
        return dateDerniereVisite;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setDateDerniereVisite(String dateDerniereVisite) {
        this.dateDerniereVisite = dateDerniereVisite;
    }

    
    public Admin(String login, String motDePasse, String dateDerniereVisite) {
        this.login = login;
        this.motDePasse = motDePasse;
        this.dateDerniereVisite = dateDerniereVisite;
    }
    
    public Admin(){
        
    }
}
