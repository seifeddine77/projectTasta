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
public class Menu {
    private int Id_Menu;
    private String menu_name;
    private int price;

    @Override
    public String toString() {
        return "Menu{" + "Id_Menu=" + Id_Menu + ", menu_name=" + menu_name + ", price=" + price + '}';
    }

    public int getId_Menu() {
        return Id_Menu;
    }

    public void setId_Menu(int Id_Menu) {
        this.Id_Menu = Id_Menu;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Menu(String menu_name, int price) {
        this.menu_name = menu_name;
        this.price = price;
    }

    public Menu(int Id_Menu, String menu_name, int price) {
        this.Id_Menu = Id_Menu;
        this.menu_name = menu_name;
        this.price = price;
    }
}
