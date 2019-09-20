package com.joanmanera;

import java.io.*;

public class EscribirFilePrintWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter bf = new PrintWriter(new FileWriter("/home/joan/IdeaProjects/Acceso a datos/hola.txt", true));
        for(int i = 1 ; i < 11 ; i++){
            bf.println("Fila numero: "+i);
        }
        bf.close();
    }
}
