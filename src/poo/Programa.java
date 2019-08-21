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
public class Programa {
    
    public String host;
    public int ncapitulos;
    public double duracion;
    
    public Programa(){
        host = "Desconocido";
        ncapitulos = 0;
        duracion = 0;
    }

    
     public Programa(String host,
                            int ncapitulos, 
                                double duracion){
        this.host = host;
        this.ncapitulos = ncapitulos;
        this.duracion = duracion; 
    }
    
    public int getCapitulos(){
        return this.ncapitulos;
    }
    public void setCapitulos(int ncapitulos){
        this.ncapitulos= ncapitulos;
        
    }
    
}
