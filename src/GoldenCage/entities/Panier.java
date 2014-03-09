/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.entities;

/**
 *
 * @author lenovo_B
 */
public class Panier {
    private int idPanier;
    private int idClient;
    private int idProduit;

    public Panier(int idPanier, int idClient, int idProduit) {
        this.idPanier = idPanier;
        this.idClient = idClient;
        this.idProduit = idProduit;
    }

    public int getIdPanier() {
        return idPanier;
    }

    public int getIdClient() {
        return idClient;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdPanier(int idPanier) {
        this.idPanier = idPanier;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }
    
    
}
