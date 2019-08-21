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
public class Profesor {
    private String nombre;
    private int edad;
    private String materia;
    private String carrera;
    private boolean buenprofe;

    public Profesor() {
        this.nombre = "";
        this.edad = 0;
        this.materia = "";
        this.carrera = "";
        this.buenprofe = false;
    }

    public Profesor(String nombre, int edad, String materia, String carrera, boolean buenprofe) {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
        this.carrera = carrera;
        this.buenprofe = buenprofe;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
