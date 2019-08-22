/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Alumno jnsadhjnsa
 */
public class Alumno extends Persona{
    private int edad;
    private String carrera;
    private int boleta;
    private boolean regular;

    public Alumno() {
        this.edad = 0;
        this.carrera = "";
        this.boleta = 0;
        this.regular = false;
    }

    public Alumno(String nombre, int edad, String carrera, int boleta, boolean regular) {
        this.edad = edad;
        this.carrera = carrera;
        this.boleta = boleta;
        this.regular = regular;
    }


    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the buenprofe
     */
    public boolean isBuenprofe() {
        return buenprofe;
    }

    /**
     * @param buenprofe the buenprofe to set
     */
    public void setBuenprofe(boolean buenprofe) {
        this.buenprofe = buenprofe;
    }
    
    
    
}
