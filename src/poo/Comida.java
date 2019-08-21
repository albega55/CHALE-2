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
public class Comida {
    
    public String dueno;
    public int costo;
    public double calorias;
    
    public Comida(){
        dueno = "Desconocido";
        costo = 0;
        calorias = 0;
    }

    
     public Comida(String dueno,
                            int costo, 
                                double calorias){
        this.dueno = dueno;
        this.costo = costo;
        this.calorias = calorias; 
    }
    
    public int getCosto(){
        return this.costo;
    }
    public void setCosto(int costo){
        this.costo= costo;
        
    }
    
}
