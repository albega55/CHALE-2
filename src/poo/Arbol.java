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
public class Arbol {
    
    public String nombre;
    public int edad;
    public double altura;
    
    public Arbol(){
        nombre = "Desconocido";
        edad = 0;
        altura = 0;
    }

    
     public Arbol(String nombre,
                            int edad, 
                                double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura; 
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
        
    }
    
}
