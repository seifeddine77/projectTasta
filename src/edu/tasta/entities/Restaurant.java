/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tasta.entities;

/**
 *
 * @author hp
 */
public class Restaurant {
   private int restaurant_id;
   private String password;
   private String first_name;
   private String last_name;
   private String designation;

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Restaurant(int restaurant_id, String password, String first_name, String last_name, String designation) {
        this.restaurant_id = restaurant_id;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.designation = designation;
    }

    public Restaurant() {
    }
}
