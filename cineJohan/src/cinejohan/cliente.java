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
    private int document;
    private int ocupation;

    public cliente() {
        
    }

    public cliente(int document, int ocupation) {
        this.document = document;
        this.ocupation = ocupation;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public int getOcupation() {
        return ocupation;
    }

    public void setOcupation(int ocupation) {
        this.ocupation = ocupation;
    }

}

