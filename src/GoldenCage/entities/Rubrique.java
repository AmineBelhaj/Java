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
    private int IdRec;
    private Date DateRec;
    private Time HeureRec;
    private int NoteRec;
    private String TextRec;
    private int IdPrestataire;
    private int IdClient;

    public int getIdRec() {
        return IdRec;
    }

    public Date getDateRec() {
        return DateRec;
    }

    public Time getHeureRec() {
        return HeureRec;
    }

    public int getNoteRec() {
        return NoteRec;
    }

    public String getTextRec() {
        return TextRec;
    }

    public int getIdPrestataire() {
        return IdPrestataire;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdRec(int IdRec) {
        this.IdRec = IdRec;
    }

    public void setDateRec(Date DateRec) {
        this.DateRec = DateRec;
    }

    public void setHeureRec(Time HeureRec) {
        this.HeureRec = HeureRec;
    }

    public void setNoteRec(int NoteRec) {
        this.NoteRec = NoteRec;
    }

    public void setTextRec(String TextRec) {
        this.TextRec = TextRec;
    }

    public void setIdPrestataire(int IdPrestataire) {
        this.IdPrestataire = IdPrestataire;
    }

    public void setIdClient(int IdClient) {
        this.IdClient = IdClient;
    }
    
}
