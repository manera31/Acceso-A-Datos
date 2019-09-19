package com.joanmanera;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String directorio = "/home/joan";
        File home = new File(directorio);
        String[] ficheros = home.list();
        for (int i = 0 ; i < ficheros.length ; i++){
            File f2 = new File(directorio, ficheros[i]);
            //System.out.println(f2.getPath()+"---"+f2.getAbsolutePath()+"---"+f2.getCanonicalPath());
            if(f2.isDirectory()){
                if(f2.canWrite() && f2.canRead()){
                    System.out.println(" d WR/RE "+f2.toString()+" \t"+ f2.length()+" Bytes");
                }else if(f2.canRead()){
                    System.out.println(" d RE "+f2.toString()+" \t"+ f2.length()+" Bytes");
                }else if(f2.canWrite()){
                    System.out.println(" d WR"+f2.toString()+" \t"+ f2.length()+" Bytes");
                }

            } else {
                if(f2.canWrite() && f2.canRead()){
                    System.out.println(" - WR/RE "+f2.toString()+" \t"+ f2.length()+" Bytes");
                }else if(f2.canRead()){
                    System.out.println(" - RE "+f2.toString()+" \t"+ f2.length()+" Bytes");
                }else if(f2.canWrite()){
                    System.out.println(" - WR"+f2.toString()+" \t"+ f2.length()+" Bytes");
                }
            }

        }
    }
}
