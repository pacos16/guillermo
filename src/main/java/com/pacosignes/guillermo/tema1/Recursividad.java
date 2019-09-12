package com.pacosignes.guillermo.tema1;
import java.io.*;
public class Recursividad {
    public static void main(String[] args) {
        File path=new File("/home/paco/");

        recur(path);


    }

    public static void recur(File file){
        String[] list=file.list();
       File file1;
        for (String s:list
             ) {

            file1=new File(file,s);
            if (file1.isDirectory()){

                System.out.println("Directorio"+file1.getName());
                recur(file1);
            }else if(file.isFile()){
                System.out.println("fichero"+file1.getName());
            }else{
                System.out.println("No se puede leer");
            }

        }
    }
}
