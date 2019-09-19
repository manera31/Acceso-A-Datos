package com.joanmanera;

import java.io.*;
import java.util.Scanner;

public class EscribirFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\joane\\Desktop\\Joan\\2 DAM\\Acceso a datos\\AccesoADatos\\hola.txt");
        FileWriter fw = new FileWriter(f, true);
        Scanner lector = new Scanner(System.in);
        char c;
        boolean b = true;
        do {
            System.out.print("Escribe letra: ");
            c = lector.nextLine().charAt(0);
            if(c == '\\'){
                b=false;
            } else {
                fw.write((char)c);
            }
        } while (b);
        fw.close();
        FileReader fr = new FileReader(f);
        int i;
        while ((i = fr.read()) != -1){
            System.out.print((char)i);
        }

    }
}
