/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.entities;

import javax.swing.ImageIcon;

/**
 *
 * @author lenovo_B
 */
public class Produit {
    private int IdProduit;
    private int IdSR;
    private int IdCategorie;
    private String NomProduit;
    private ImageIcon PhotoProduit;
    private String DescriptionProduit;
    private double CoutProduit;
    private double CoutSolde;

    public int getIdProduit() {
        return IdProduit;
    }

    public int getIdSR() {
        return IdSR;
    }

    public int getIdCategorie() {
        return IdCategorie;
    }

    public String getNomProduit() {
        return NomProduit;
    }

    public ImageIcon getPhotoProduit() {
        return PhotoProduit;
    }

    public String getDescriptionProduit() {
        return DescriptionProduit;
    }

    public double getCoutProduit() {
        return CoutProduit;
    }

    public double getCoutSolde() {
        return CoutSolde;
    }

    public void setIdProduit(int IdProduit) {
        this.IdProduit = IdProduit;
    }

    public void setIdSR(int IdSR) {
        this.IdSR = IdSR;
    }

    public void setIdCategorie(int IdCategorie) {
        this.IdCategorie = IdCategorie;
    }

    public void setNomProduit(String NomProduit) {
        this.NomProduit = NomProduit;
    }

    public void setPhotoProduit(ImageIcon PhotoProduit) {
        this.PhotoProduit = PhotoProduit;
    }

    public void setDescriptionProduit(String DescriptionProduit) {
        this.DescriptionProduit = DescriptionProduit;
    }

    public void setCoutProduit(double CoutProduit) {
        this.CoutProduit = CoutProduit;
    }

    public void setCoutSolde(double CoutSolde) {
        this.CoutSolde = CoutSolde;
    }

    public Produit(int IdProduit, int IdSR, int IdCategorie, String NomProduit, ImageIcon PhotoProduit, String DescriptionProduit, double CoutProduit, double CoutSolde) {
        this.IdProduit = IdProduit;
        this.IdSR = IdSR;
        this.IdCategorie = IdCategorie;
        this.NomProduit = NomProduit;
        this.PhotoProduit = PhotoProduit;
        this.DescriptionProduit = DescriptionProduit;
        this.CoutProduit = CoutProduit;
        this.CoutSolde = CoutSolde;
    }
    
    public Produit() {
        
    }

    
}
