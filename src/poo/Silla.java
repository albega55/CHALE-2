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
public class Silla {
    
    public String dueno;
    public int alto;
    public double peso;
    
    public Silla(){
        dueno = "Desconocido";
        alto = 0;
        peso = 0;
    }

    
     public Silla(String dueno,
                            int alto, 
                                double peso){
        this.dueno = dueno;
        this.alto = alto;
        this.peso = peso; 
    }
    
    public int getAlto(){
        return this.alto;
    }
    public void setAlto(int alto){
        this.alto= alto;
        
    }
    
}
