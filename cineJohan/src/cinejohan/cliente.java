/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinejohan;

/**
 *
 * @author SENA
 */
public class cliente {
    private int id_user;
    private String nameClient;
    private String lastname;
    public cliente() {
        
    }

    public cliente(int id_user, String nameClient, String lastname) {
        this.id_user = id_user;
        this.nameClient = nameClient;
        this.lastname = lastname;
    }

    public int getIduser() {
        return id_user;
    }

    public void setDocument(int document) {
        this.id_user = id_user;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String name) {
        this.nameClient = nameClient;
    }
    
    public String getLastname(){
        return lastname;
    }
    
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

}

