/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chale;

import poo.Arbol;
import poo.Avion;
import poo.Baraja;
import poo.Caja;
import poo.Cama;
import poo.Comida;
import poo.Guante;
import poo.Mascota;
import poo.Pais;
import poo.Persona;
import poo.Pintarron;
import poo.Pizza;
import poo.Plato;
import poo.Pop;
import poo.Poster;
import poo.Programa;
import poo.Puerta;
import poo.Regadera;
import poo.Silla;
import poo.Tupper;

/**
 *
 * @author esoj_
 */
public class Chale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x = "Yolo";
        Arbol pino = new Arbol("pino", 5, 7);
        Avion boing5 = new Avion("xair", 15, 350);
        Baraja oficioal = new Baraja("Javier", 54, 67);
        Caja regalo = new Caja("Nur", 35, 70);
        Cama principal = new Cama("Alberto",(float) .50, 2);
        Comida fuerte = new Comida("Pablo", 54, 178.9);
        Guante thanos = new Guante("Thanos", 99999, .5);
        Mascota gember = new Mascota("Alberto", "Gember", 9);
        Pais holanda = new Pais("Holanda", 5200000, 4224.23);
        Persona beto = new Persona("Juan Alberto",
                18, 1.9, 2.1, "Prefiero no decirlo");
        Pintarron salon = new Pintarron("Plastico", 132, 450);
        Pizza peperoni = new Pizza("Peperoni", 123, 58);
        Plato ads = new Plato("Laura", "Profundo", 25);
        Pop spoderman = new Pop("Albert", 55, "Iron spider");
        Poster endgame = new Poster("Alberto", 60, 30);
        Programa namnam = new Programa("Richie", 50, 60);
        Puerta alcoba = new Puerta("Alcoba", 120, 58);
        Regadera princip = new Regadera("Azul", 98, 89);
        Silla comedor = new Silla("Prof", 115, 155);
        Tupper favorito = new Tupper("Nur", 22, 2.5);
       
        
        
        System.out.println(beto.getNombre());
        System.out.println(pino.getNombre());
        System.out.println(boing5.getMdv());
        System.out.println(oficioal.getDueno());
        System.out.println(regalo.getAlto());
        System.out.println(principal.getAlto());
        System.out.println(fuerte.getCosto());
        System.out.println(thanos.getCosto());
        System.out.println(gember.getEdad());
        System.out.println(holanda.getPoblacion());
        System.out.println(salon.getAlto());
        System.out.println(peperoni.getCosto());
        System.out.println(ads.getAncho());
        System.out.println(spoderman.getPersonaje());
        System.out.println(endgame.getAlto());
        System.out.println(namnam.getCapitulos());
        System.out.println(alcoba.getAlto());
        System.out.println(princip.getAlto());
        System.out.println(comedor.getAlto());
        System.out.println(favorito.getAlto());
        
        beto.setNombre(x);
        System.out.println(beto.getNombre());

    }
}
