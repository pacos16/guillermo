package com.pacosignes.guillermo.tema1;
import java.io.*;
public class Recursividad {
    public static void main(String[] args) {
        File path=new File("C:\\Users\\user\\Documents\\MODUL");

        recur(path,1);


    }

    public static void recur(File file,int contador){
        String[] list=file.list();
       File file1;

        for (String s:list
             ) {

            file1=new File(file,s);
            if (file1.isDirectory()){

                System.out.printf("%"+((contador*3)+10)+"s \t %s \n","Directorio",file1.getName());

                recur(file1,contador+1);
                contador-=1;
            }else{
                System.out.printf("%"+((contador*3)+10)+"s \t %s \n","Fichero",file1.getName());
            }

        }
    }
}
