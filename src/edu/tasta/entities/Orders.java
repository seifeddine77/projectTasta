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
public class Orders {
    private int order_id;
    private int customer_id;
    private int menu_id;
    private int quantity;
    private String order_status;
    private Timestamp time_stamp;

    @Override
    public String toString() {
        return "Orders{" + "order_id=" + order_id + ", customer_id=" + customer_id + ", menu_id=" + menu_id + ", quantity=" + quantity + ", order_status=" + order_status + ", time_stamp=" + time_stamp + '}';
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public Timestamp getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(Timestamp time_stamp) {
        this.time_stamp = time_stamp;
    }

    public Orders() {
    }

    public Orders(int order_id, int customer_id, int menu_id, int quantity, String order_status, Timestamp time_stamp) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.menu_id = menu_id;
        this.quantity = quantity;
        this.order_status = order_status;
        this.time_stamp = time_stamp;
    }
}
