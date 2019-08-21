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
public class Pop {
    
    public String dueno;
    public int numero;
    public String personaje;
    
    public Pop(){
        dueno = "Desconocido";
        numero = 0;
        personaje = "Desconocido";
    }

    
     public Pop(String dueno,
                            int numero, 
                                String personaje){
        this.dueno = dueno;
        this.numero = numero;
        this.personaje = personaje; 
    }
    
    public String getPersonaje(){
        return this.personaje;
    }
    public void setAlto(String personaje){
        this.personaje= personaje;
        
    }
    
}
