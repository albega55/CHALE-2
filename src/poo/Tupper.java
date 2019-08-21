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
public class Tupper {
    
    public String dueno;
    public int alto;
    public double capacidad;
    
    public Tupper(){
        dueno = "Desconocido";
        alto = 0;
        capacidad = 0;
    }

    
     public Tupper(String dueno,
                            int alto, 
                                double capacidad){
        this.dueno = dueno;
        this.alto = alto;
        this.capacidad = capacidad; 
    }
    
    public int getAlto(){
        return this.alto;
    }
    public void setAlto(int alto){
        this.alto= alto;
        
    }
    
}
