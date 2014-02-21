/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.entities;

/**
 *
 * @author minoo
 */
public class Prestataire {
   private int IdPrestataire;
   private String NomSociete;
   private String Login;
   private String MotDePasse;
   private String Adresse;
   String Presentation;
   int Tel;
   int GSM;
   int Fax;
   String AdresseMail;
   String SiteWeb;
   String Photo;

    public int getIdPrestataire() {
        return IdPrestataire;
    }

    public String getNomSociete() {
        return NomSociete;
    }

    public String getLogin() {
        return Login;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getPresentation() {
        return Presentation;
    }

    public int getTel() {
        return Tel;
    }

    public int getGSM() {
        return GSM;
    }

    public int getFax() {
        return Fax;
    }

    public String getAdresseMail() {
        return AdresseMail;
    }

    public String getSiteWeb() {
        return SiteWeb;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setIdPrestataire(int IdPrestataire) {
        this.IdPrestataire = IdPrestataire;
    }

    public void setNomSociete(String NomSociete) {
        this.NomSociete = NomSociete;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setMotDePasse(String MotDePasse) {
        this.MotDePasse = MotDePasse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public void setPresentation(String Presentation) {
        this.Presentation = Presentation;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public void setGSM(int GSM) {
        this.GSM = GSM;
    }

    public void setFax(int Fax) {
        this.Fax = Fax;
    }

    public void setAdresseMail(String AdresseMail) {
        this.AdresseMail = AdresseMail;
    }

    public void setSiteWeb(String SiteWeb) {
        this.SiteWeb = SiteWeb;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public Prestataire(int IdPrestataire, String NomSociete, String Login, String MotDePasse, String Adresse, String Presentation, int Tel, int GSM, int Fax, String AdresseMail, String SiteWeb, String Photo) {
        this.IdPrestataire = IdPrestataire;
        this.NomSociete = NomSociete;
        this.Login = Login;
        this.MotDePasse = MotDePasse;
        this.Adresse = Adresse;
        this.Presentation = Presentation;
        this.Tel = Tel;
        this.GSM = GSM;
        this.Fax = Fax;
        this.AdresseMail = AdresseMail;
        this.SiteWeb = SiteWeb;
        this.Photo = Photo;
    }
   public Prestataire(){
       
   }
    
}
