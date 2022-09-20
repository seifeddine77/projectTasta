/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tasta.entities;

import java.sql.Timestamp;

/**
 *
 * @author hp
 */
public class Payment {

    private int Id_Paiement;
    private String Paiement_type;
    private String paiement_status;
    private Timestamp time_stamp;
    private int  commande;

    public Payment() {
    }

    public Payment(int Id_Paiement, String Paiement_type, String paiement_status, Timestamp time_stamp, int commande) {
        this.Id_Paiement = Id_Paiement;
        this.Paiement_type = Paiement_type;
        this.paiement_status = paiement_status;
        this.time_stamp = time_stamp;
        this.commande = commande;
    }

    public int getId_Paiement() {
        return Id_Paiement;
    }

    public void setId_Paiement(int Id_Paiement) {
        this.Id_Paiement = Id_Paiement;
    }

    public String getPaiement_type() {
        return Paiement_type;
    }

    public void setPaiement_type(String Paiement_type) {
        this.Paiement_type = Paiement_type;
    }

    public String getPaiement_status() {
        return paiement_status;
    }

    public void setPaiement_status(String paiement_status) {
        this.paiement_status = paiement_status;
    }

    public Timestamp getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(Timestamp time_stamp) {
        this.time_stamp = time_stamp;
    }

    public int getCommande() {
        return commande;
    }

    public void setCommande(int commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "Paiement{" + "Id_Paiement=" + Id_Paiement + ", Paiement_type=" + Paiement_type + ", paiement_status=" + paiement_status + ", time_stamp=" + time_stamp + ", commande=" + commande + '}';
    }
    
}
