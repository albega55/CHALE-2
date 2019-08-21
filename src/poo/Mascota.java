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
public class Mascota {
    
    public String dueno;
    public String nombre;
    public double edad;
    
    public Mascota(){
        dueno = "Desconocido";
        nombre = "Descconocido";
        edad = 0;
    }

    
     public Mascota(String dueno,
                            String nombre, 
                                double edad){
        this.dueno = dueno;
        this.nombre = nombre;
        this.edad = edad; 
    }
    
    public double getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad= edad;
        
    }
    
}
