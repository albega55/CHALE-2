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
public class Poster {
    
    public String dueno;
    public int alto;
    public double ancho;
    
    public Poster(){
        dueno = "Desconocido";
        alto = 0;
        ancho = 0;
    }

    
     public Poster(String dueno,
                            int alto, 
                                double ancho){
        this.dueno = dueno;
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
