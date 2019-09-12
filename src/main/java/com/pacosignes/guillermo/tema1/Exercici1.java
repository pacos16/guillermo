package com.pacosignes.guillermo.tema1;
import java.io.*;

public class Exercici1 {
    public static void main(String[] args) {
        File file=new File("/home/paco");

        String [] archivos=file.list();
        if (file.isDirectory()){
            System.out.println("Directorio");
        }
        for (String a:archivos
             ) {
            System.out.println(a+"  "+a.length());
        }
    }

}
