/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.dao;

import GoldenCage.entities.Client;
import GoldenCage.entities.Reclamation;
import java.util.Comparator;

/**
 *
 * @author minoo
 */
public class CritereClient implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Reclamation r1=(Reclamation)o1;
        Reclamation r2=(Reclamation)o2;
        ClientDAO clientDAO=new ClientDAO();
        
        return clientDAO.getLogin(r1.getIdClient()).compareTo(clientDAO.getLogin(r2.getIdClient()));
            
    }
    
}
