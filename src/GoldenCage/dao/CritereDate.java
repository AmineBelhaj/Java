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
public class CritereDate implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Reclamation r1=(Reclamation)o1;
        Reclamation r2=(Reclamation)o2;
        if(r1.getDateRec().compareTo(r2.getDateRec())>0)
            return 1;
        else if(r1.getDateRec().compareTo(r2.getDateRec())<0)
            return -1;
        else
            return 0;
    }
    
}
