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
public class Produit {
   private int IdProduit; 
   private String NomProduit;
   private String PhotoProduit;
   private String DescriptionProduit;
   private float CoutProduit;
   private float Coutsolde;
  
  
   
   
   public int getIdProduit() {
        return IdProduit;
    }

    public String getNomProduit() {
        return NomProduit;
    }

    public String getPhotoProduit() {
        return PhotoProduit;
    }

    public String getDescriptionProduit() {
        return DescriptionProduit;
    }

    public float getCoutProduit() {
        return CoutProduit;
    }

    public float getCoutsolde() {
        return Coutsolde;
    }


    public void setIdProduit(int IdProduit) {
        this.IdProduit = IdProduit;
    }

    public void setNomProduit(String NomProduit) {
        this.NomProduit = NomProduit;
    }
    
     public void setPhotoProduit(String PhotoProduit) {
        this.PhotoProduit = PhotoProduit;
    }
 public void setDescriptionProduit(String DescriptionProduit) {
        this.DescriptionProduit = DescriptionProduit;
    }
   

    public void setCoutProduit(float CoutProduit) {
        this.CoutProduit =CoutProduit;
    }

    public void setCoutsolde (float Coutsolde) {
        this.Coutsolde = Coutsolde;
    }


    public Produit(int IdProduit, String NomProduit, String PhotoProduit , String DescriptionProduit, float CoutProduit, float Coutsolde ) {
        this.IdProduit = IdProduit;
        this.NomProduit = NomProduit;
        this.PhotoProduit = PhotoProduit;
        
        this.DescriptionProduit = DescriptionProduit;
        this.CoutProduit = CoutProduit;
        
        this.Coutsolde = Coutsolde;
      
    }
   public Produit(){
       
   }
    
}
