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
public class Payment_Detailes {
    private int id_details;
    private int id_Client;	
    private int Card_Number;
    private String Card_Holder_Name;
    private int CVV;	
    private int Exp_Month;
    private int Exp_Year;
    private Timestamp time_Stamp;

    public Payment_Detailes() {
    }

    public Payment_Detailes(int id_details, int id_Client, int Card_Number, String Card_Holder_Name, int CVV, int Exp_Month, int Exp_Year, Timestamp time_Stamp) {
        this.id_details = id_details;
        this.id_Client = id_Client;
        this.Card_Number = Card_Number;
        this.Card_Holder_Name = Card_Holder_Name;
        this.CVV = CVV;
        this.Exp_Month = Exp_Month;
        this.Exp_Year = Exp_Year;
        this.time_Stamp = time_Stamp;
    }

    public int getId_details() {
        return id_details;
    }

    public void setId_details(int id_details) {
        this.id_details = id_details;
    }

    public int getId_Client() {
        return id_Client;
    }

    public void setId_Client(int id_Client) {
        this.id_Client = id_Client;
    }

    public int getCard_Number() {
        return Card_Number;
    }

    public void setCard_Number(int Card_Number) {
        this.Card_Number = Card_Number;
    }

    public String getCard_Holder_Name() {
        return Card_Holder_Name;
    }

    public void setCard_Holder_Name(String Card_Holder_Name) {
        this.Card_Holder_Name = Card_Holder_Name;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public int getExp_Month() {
        return Exp_Month;
    }

    public void setExp_Month(int Exp_Month) {
        this.Exp_Month = Exp_Month;
    }

    public int getExp_Year() {
        return Exp_Year;
    }

    public void setExp_Year(int Exp_Year) {
        this.Exp_Year = Exp_Year;
    }

    public Timestamp getTime_Stamp() {
        return time_Stamp;
    }

    public void setTime_Stamp(Timestamp time_Stamp) {
        this.time_Stamp = time_Stamp;
    }

    @Override
    public String toString() {
        return "Paiement_Detailes{" + "id_details=" + id_details + ", id_Client=" + id_Client + ", Card_Number=" + Card_Number + ", Card_Holder_Name=" + Card_Holder_Name + ", CVV=" + CVV + ", Exp_Month=" + Exp_Month + ", Exp_Year=" + Exp_Year + ", time_Stamp=" + time_Stamp + '}';
    }
    
}
