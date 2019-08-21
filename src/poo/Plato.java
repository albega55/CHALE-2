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
public class Plato {
    
    public String dueno;
    public String tipo;
    public double ancho;
    
    public Plato(){
        dueno = "Desconocido";
        tipo = "Desconocido";
        ancho = 0;
    }

    
     public Plato(String dueno,
                            String tipo, 
                                double ancho){
        this.dueno = dueno;
        this.tipo = tipo;
        this.ancho = ancho; 
    }
    
    public double getAncho(){
        return this.ancho;
    }
    public void setAncho(double ancho){
        this.ancho= ancho;
        
    }
    
}
