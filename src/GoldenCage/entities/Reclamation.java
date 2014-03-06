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
    private String DateRec;
    private String TimeRec;

    public Reclamation() {
    }

    public Reclamation( int idClient, int idPrestataire, String TextRec, int NoteRec, String DateRec,String TimeRec) {
        this.idClient = idClient;
        this.idPrestataire = idPrestataire;
        this.TextRec = TextRec;
        this.NoteRec = NoteRec;
        this.DateRec = DateRec;
        this.TimeRec =  TimeRec;
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

    public void setTimeRec(String TimeRec) {
        this.TimeRec = TimeRec;
    }

    public String getTimeRec() {
        return TimeRec;
    }

    public int getNoteRec() {
        return NoteRec;
    }

    public String getDateRec() {
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

    public void setDateRec(String DateRec) {
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
