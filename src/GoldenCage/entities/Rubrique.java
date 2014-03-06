/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.entities;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author minoo
 */
public class Rubrique {
    private int IdRubrique;
    private String NomRubrique;

    public int getIdRubrique() {
        return IdRubrique;
    }

    public String getNomRubrique() {
        return NomRubrique;
    }

    public void setIdRubrique(int IdRubrique) {
        this.IdRubrique = IdRubrique;
    }

    public void setNomRubrique(String NomRubrique) {
        this.NomRubrique = NomRubrique;
    }
    
}
