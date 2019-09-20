package com.joanmanera.Actividades1;

import java.io.*;
import java.util.ArrayList;

public class Actividad1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("hola.txt"));
        StringBuilder sb;
        do {

            sb = new StringBuilder(bufferedReader.readLine());
            if(sb != null){
                System.out.println(sb.reverse());

            }
        } while (sb != null);
    }
}
