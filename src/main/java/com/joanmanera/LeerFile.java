package com.joanmanera;

import java.io.*;

public class LeerFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\joane\\Desktop\\Joan\\2 DAM\\Acceso a datos\\AccesoADatos\\hola.txt");
        FileReader fr = new FileReader(f);
        int i;
        while ((i = fr.read()) != -1){
            System.out.print((char)i);
        }
    }
}
