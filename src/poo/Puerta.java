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
public class Puerta {
    
    public String habitacion;
    public int alto;
    public double ancho;
    
    public Puerta(){
        habitacion = "Desconocido";
        alto = 0;
        ancho = 0;
    }

    
     public Puerta(String habitacion,
                            int alto, 
                                double ancho){
        this.habitacion = habitacion;
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
