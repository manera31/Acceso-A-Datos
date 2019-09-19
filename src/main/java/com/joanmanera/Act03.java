package com.joanmanera;

import java.io.File;
import java.io.IOException;

public class Act03 {
    public static void main(String[] args) {
        File aux = new File(".", "Curs 2DAM");
        if(aux.mkdir()){
            System.out.println("Directorio '"+aux.getName()+"' creado");
            File av1 = new File(aux, "1AVAL");
            if(av1.mkdir()){
                System.out.println("Directorio '"+av1.getName()+"' creado");
                try {
                    File ex1 = new File(av1, "Examen Mio");
                    if(ex1.createNewFile()){
                        System.out.println("Fichero '"+ex1.getName()+"' creado");
                    } else {
                        System.out.println("El fichero '"+ex1.getName()+"' ya existe");
                    }
                } catch (IOException ioe){
                    System.out.println("ERROR ex1");
                }
                try {
                    File ex2 = new File(av1, "Examen Tuyo");
                    if(ex2.createNewFile()){
                        System.out.println("Fichero '"+ex2.getName()+"' creado");
                    } else {
                        System.out.println("El fichero '"+ex2.getName()+"' ya existe");
                    }
                } catch (IOException ioe){
                    System.out.println("ERROR ex1");
                }
            } else {
                System.out.println("El directorio '"+av1.getName()+"' ya existe");
            }
            File av2 = new File(aux, "2AVAL");
            if(av2.mkdir()){
                System.out.println("Directorio '"+av2.getName()+"' creado");
            } else {
                System.out.println("El directorio '"+av2.getName()+"' ya existe");
            }
            File av3 = new File(aux, "3AVAL");
            if(av3.mkdir()){
                System.out.println("Directorio '"+av3.getName()+"' creado");
            } else {
                System.out.println("El directorio '"+av3.getName()+"' ya existe");
            }
        } else {
            System.out.println("El directorio '"+aux.getName()+"' ya existe");
        }
    }
}
