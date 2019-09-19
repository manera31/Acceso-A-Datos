package com.joanmanera;

import java.io.*;

public class LeerFile {
    public static void main(String[] args) throws IOException {
        File f = new File("/home/joan/IdeaProjects/Acceso a datos/hola.txt");
        FileReader fr = new FileReader(f);
        int i;
        while ((i = fr.read()) != -1){
            System.out.print((char)i);
        }
    }
}
