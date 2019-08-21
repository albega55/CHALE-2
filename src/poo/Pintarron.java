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
public class Pintarron {
    
    public String material;
    public int alto;
    public double ancho;
    
    public Pintarron(){
        material = "Desconocido";
        alto = 0;
        ancho = 0;
    }

    
     public Pintarron(String material,
                            int alto, 
                                double ancho){
        this.material = material;
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
