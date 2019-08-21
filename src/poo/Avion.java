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
public class Avion {
    
    public String dueno;
    public int meses_de_vuelo;
    public double asientos;
    
    public Avion(){
        dueno = "Desconocido";
        meses_de_vuelo = 0;
        asientos = 0;
    }

    
     public Avion(String dueno,
                            int meses_de_vuelo, 
                                double asientos){
        this.dueno = dueno;
        this.meses_de_vuelo = meses_de_vuelo;
        this.asientos = asientos; 
    }
    
    public int getMdv(){
        return this.meses_de_vuelo;
    }
    public void setMdv(int meses_de_vuelo){
        this.meses_de_vuelo= meses_de_vuelo;
        
    }
    
}
