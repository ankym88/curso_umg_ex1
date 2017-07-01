package com.umg.curso.clases;

/**
 * Created by QTZ_B330 on 1/7/2017.
 */
public class Deportista {

    private String nombre;
    private int edad;


    public Deportista() {
    }

    public Deportista(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
