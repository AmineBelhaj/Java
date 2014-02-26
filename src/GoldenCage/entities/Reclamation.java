/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.entities;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;
import java.util.*;

/**
 *
 * @author lenovo_B
 */
public class Reclamation {
    private int idRec;
    private int idClient;
    private int idPrestataire;
    private String TextRec;
    private int NoteRec;
    private Date DateRec;

    public Reclamation() {
    }

    public Reclamation(int idRec, int idClient, int idPrestataire, String TextRec, int NoteRec, Date DateRec) {
        this.idRec = idRec;
        this.idClient = idClient;
        this.idPrestataire = idPrestataire;
        this.TextRec = TextRec;
        this.NoteRec = NoteRec;
        this.DateRec = DateRec;
    }

    public int getIdRec() {
        return idRec;
    }

    public int getIdClient() {
        return idClient;
    }

    public int getIdPrestataire() {
        return idPrestataire;
    }

    public String getTextRec() {
        return TextRec;
    }

    public int getNoteRec() {
        return NoteRec;
    }

    public Date getDateRec() {
        return DateRec;
    }

    public void setIdRec(int idRec) {
        this.idRec = idRec;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setIdPrestataire(int idPrestataire) {
        this.idPrestataire = idPrestataire;
    }

    public void setTextRec(String TextRec) {
        this.TextRec = TextRec;
    }

    public void setNoteRec(int NoteRec) {
        this.NoteRec = NoteRec;
    }

    public void setDateRec(Date DateRec) {
        this.DateRec = DateRec;
    }
    
    @Override
    public boolean equals(Object obj){
        Reclamation r=(Reclamation)obj;
        if((this.idRec==r.idRec)&&(this.DateRec==r.DateRec)){
            return true;
        }
        else
            return false;
    }
    
}
