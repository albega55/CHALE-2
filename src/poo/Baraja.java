/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 * Crear objetos
 * @author CRUZLEIJA
 */
public class Baraja {
    
    public String dueno;
    public int numcartas;
    public double juegoshechos;
    
    public Baraja(){
        dueno = "Desconocido";
        numcartas = 0;
        juegoshechos = 0;
    }    
     public Baraja(String dueno,
                            int numcartas, 
                                double juegoshechos){
        this.dueno = dueno;
        this.numcartas = numcartas;
        this.juegoshechos = juegoshechos; 
    }
    
    public String getDueno(){
        return this.dueno;
    }
    public void setMdv(String dueno){
        this.dueno= dueno;
        
    }
    
}
