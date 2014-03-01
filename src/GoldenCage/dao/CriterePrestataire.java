/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.dao;

import GoldenCage.entities.Reclamation;
import java.util.Comparator;

/**
 *
 * @author minoo
 */
public class CriterePrestataire implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        
        PrestataireDAO prestataireDAO=new PrestataireDAO();
       
        Reclamation r1 = (Reclamation)o1;
        Reclamation r2=(Reclamation)o2;
        return prestataireDAO.getNomSociét(r1.getIdPrestataire()).compareTo(prestataireDAO.getNomSociét(r2.getIdPrestataire()));
       /* if(r1.getIdPrestataire()>r2.getIdPrestataire())
                return 1;
        else if(r1.getIdPrestataire()<r2.getIdPrestataire())
            return -1;
        else 
            return 0;*/
                
           
    }
    
}
