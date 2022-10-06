package com.ufv.ejemplo02;

public class Persona {

//los gets y sets se hacen para poder usar los atributos en el main pq son privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDnisinletra() {
        return dnisinletra;
    }

    public void setDnisinletra(int dnisinletra) {
        this.dnisinletra = dnisinletra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 18){
            System.out.printf("estas hecho un chaval");

        }
        else{
            System.out.printf("ok boomer");

        }
        this.edad = edad;
    }
    private String nombre;
    private String apellido;
    private int dnisinletra;
    private int edad;


}
