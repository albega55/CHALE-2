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
public class Guante {
    
    public String dueno;
    public int costo;
    public double tamano;
    
    public Guante(){
        dueno = "Desconocido";
        costo = 0;
        tamano = 0;
    }

    
     public Guante(String dueno,
                            int costo, 
                                double tamano){
        this.dueno = dueno;
        this.costo = costo;
        this.tamano = tamano; 
    }
    
    public int getCosto(){
        return this.costo;
    }
    public void setCosto(int costo){
        this.costo= costo;
        
    }
    
}
