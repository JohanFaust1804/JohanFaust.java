/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinejohan;


public class roomCine {
    private int idPrincipal;
    private int capacity;
    private int seatBusy; 
    private String titleMovie; 
    private double entryPrice;

    public roomCine() {
        
    }

   

    public roomCine(int idPrincipal, int capacity, int seatBusy, String titleMovie, double entryPrice) {
        this.idPrincipal = idPrincipal;
        this.capacity = capacity;
        this.seatBusy = seatBusy;
        this.titleMovie = titleMovie;
        this.entryPrice = entryPrice;
    }

    public double getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(double entryPrice) {
        this.entryPrice = entryPrice;
    }

    public int getIdPrincipal() {
        return idPrincipal;
    }

    public void setIdPrincipal(int idPrincipal) {
        this.idPrincipal = idPrincipal;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSeatBusy() {
        return seatBusy;
    }

    public void setSeatBusy(int seatBusy) {
        this.seatBusy = seatBusy;
    }

    public String getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public void entraUno() {
       
    }

}
