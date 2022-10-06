package com.ufv.ejemplo02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona();
        Perritos perro = new Perritos();
      //  p.setEdad(-1);

        Scanner sc = new Scanner(System.in);


        System.out.printf("Escribe la raza del perro");
        perro.setRaza(sc.nextLine());

        //---------------------------------------------------------------------------------------------------------------

        System.out.printf("Escribe tu nombre:");
        p.setNombre(sc.nextLine());
        System.out.printf("tu nombre es " + p.getNombre());

        System.out.printf("\n Escribe tu apellido:");
        p.setApellido(sc.nextLine());
        System.out.printf("tu apellido es " + p.getApellido());

        System.out.printf("\n Escribe tu edad:");
        p.setEdad(sc.nextInt());
        System.out.printf("tu edad es " + p.getEdad());

        System.out.printf("\n Escribe tu dni:");
        p.setDnisinletra(sc.nextInt());
        System.out.printf("tu dni es " + p.getDnisinletra());


        System.out.printf("Buenos dias: " + p.getNombre());
        System.out.printf(" " + p.getApellido() + "con dni: " + p.getDnisinletra());
        System.out.printf(" y edad: " + p.getEdad());
    }
}
