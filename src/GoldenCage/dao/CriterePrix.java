/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.dao;

import GoldenCage.entities.Produit;
import java.util.Comparator;


/**
 *
 * @author lenovo_B
 */
public class CriterePrix implements Comparator {
     @Override
    public int compare(Object o1, Object o2) {
        Produit p1=(Produit)o1;
        Produit p2=(Produit)o2;
        if (p1.getCoutProduit() > p2.getCoutProduit())
            return 1;
        else if (p1.getCoutProduit() > p2.getCoutProduit())
            return -1;
        else
            return 0;

            
    }
}
