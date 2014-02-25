/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.entities;

/**
 *
 * @author lenovo_B
 */
public class Client {
    private int idClient;
    private String login;
    private String motDePasse;
    private String Nom;
    private String Prenom;
    private String NumTel;
    private String AdressMail;
    private int idPanier;

    public Client() {
    }

    public int getIdClient() {
        return idClient;
    }

    public String getLogin() {
        return login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getNumTel() {
        return NumTel;
    }

    public String getAdressMail() {
        return AdressMail;
    }

    public int getIdPanier() {
        return idPanier;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setNumTel(String NumTel) {
        this.NumTel = NumTel;
    }

    public void setAdressMail(String AressMail) {
        this.AdressMail = AressMail;
    }

    public void setIdPanier(int idPanier) {
        this.idPanier = idPanier;
    }

    public Client(int idClient, String login, String motDePasse, String Nom, String Prenom, String NumTel, String AressMail, int idPanier) {
        this.idClient = idClient;
        this.login = login;
        this.motDePasse = motDePasse;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.NumTel = NumTel;
        this.AdressMail = AressMail;
        this.idPanier = idPanier;
    }
    
    
    
}