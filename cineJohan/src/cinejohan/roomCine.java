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
        this.idPrincipal = idPrincipal ;
        this.capacity = capacity = 500;
        this.seatBusy = seatBusy = 0;
        this.titleMovie = titleMovie = "";
        this.entryPrice = entryPrice= 5.0;
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
    //Método setLibres
    public void setFree(int free) {
    int ocu;
    ocu = capacity - free;
    seatBusy = ocu;
    }
    public int getFree() {
    int free;
    free = (capacity - seatBusy);
    return free;
    }
    
    public double getPorcentaje(){
    double por;
    por = (double) seatBusy / (double) capacity * 100.0;
    return por;
    }
    
    public double getIncomes(){
    double incomes; 
    incomes = capacity * entryPrice;
    return incomes;
    }
    
    public void vaciar(){
    seatBusy = 0;
    titleMovie = "";
    }
    
    public void entraUno() {
       seatBusy++;
    }

}
