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
public class Pais {
    
    public String nombre;
    public int poblacion;
    public double extencion;
    
    public Pais(){
        nombre = "Desconocido";
        poblacion = 0;
        extencion = 0;
    }

    
     public Pais(String nombre,
                            int poblacion, 
                                double extencion){
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extencion = extencion; 
    }
    
    public int getPoblacion(){
        return this.poblacion;
    }
    public void setPoblacion(int poblacion){
        this.poblacion= poblacion;
        
    }
    
}
