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
public class Regadera {
    
    public String color;
    public int alto;
    public double ancho;
    
    public Regadera(){
        color = "Desconocido";
        alto = 0;
        ancho = 0;
    }

    
     public Regadera(String color,
                            int alto, 
                                double ancho){
        this.color = color;
        this.alto = alto;
        this.ancho = ancho; 
    }
    
    public int getAlto(){
        return this.alto;
    }
    public void setAlto(int alto){
        this.alto= alto;
        
    }
    
}
