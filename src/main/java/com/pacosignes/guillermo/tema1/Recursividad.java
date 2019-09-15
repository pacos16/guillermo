package com.pacosignes.guillermo.tema1;
import java.io.*;

public class Recursividad {
    public static void main(String[] args) {
        File path=new File("C:\\Users\\user\\Documents//MODUL");
        //File path=new File("/home/paco");
        recur(path,0);
    }

    public static void recur(File file,int contador){
        String[] list=file.list();
        File file1;
        try {
            for (String s : list) {
                file1 = new File(file, s);
                if (file1.isDirectory()) {
                    contador += 1;
                    System.out.printf("%" + ((contador * 3) + 10) + "s  %s \n", "Directorio", file1.getName());
                    recur(file1, contador);
                    contador -= 1;
                } else {
                    System.out.printf("%" + ((contador * 3) + 10) + "s  %s \n", "Fichero", file1.getName());
                }
            }
        }catch (NullPointerException npe){
            System.out.println("Null pointer aqui");
        }
    }
}
