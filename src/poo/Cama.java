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
public class Cama {
    
    public String dueno;
    public float alto;
    public double ancho;
    
    public Cama(){
        dueno = "Desconocido";
        alto = 0;
        ancho = 0;
    }

    
     public Cama(String dueno,
                            float alto, 
                                double ancho){
        this.dueno = dueno;
        this.alto = alto;
        this.ancho = ancho; 
    }
    
    public float getAlto(){
        return this.alto;
    }
    public void setAlto(float alto){
        this.alto= alto;
        
    }
    
}
