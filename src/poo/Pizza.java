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
public class Pizza {
    
    public String ingredientes;
    public float costo;
    public double diametro;
    
    public Pizza(){
        ingredientes = "Desconocido";
        costo = 0;
        diametro = 0;
    }

    
     public Pizza(String ingredientes,
                            float costo, 
                                double ancho){
        this.ingredientes = ingredientes;
        this.costo = costo;
        this.diametro = diametro; 
    }
    
    public float getCosto(){
        return this.costo;
    }
    public void setCosto(float costo){
        this.costo= costo;
        
    }
    
}
