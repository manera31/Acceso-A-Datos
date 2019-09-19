package com.joanmanera;

import java.io.*;

public class CarpetaRecursiva {
    private static final String CARPETA = "/home/joan/Escritorio/Carpeta prueba 1";
    public static void main(String[] args) throws IOException {
        File carpetaPrincipal = new File(CARPETA);
        mostrarCarpeta(carpetaPrincipal);
    }

    public static void mostrarCarpeta(File carpeta) throws IOException {
        String[] ficheros = carpeta.list();
        for(int i = 0 ; i < ficheros.length ; i++){
            File fichero = new File(carpeta, ficheros[i]);
            System.out.println(fichero.toString());
            if(fichero.isDirectory()){
                mostrarCarpeta(fichero);
            }
        }
    }
}
