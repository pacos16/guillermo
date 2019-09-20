package com.pacosignes.guillermo.tema1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream  {
    public static void main(String[] args) throws IOException {
        File fichero=new File("Ficherito.dat");
        FileOutputStream fos=new FileOutputStream(fichero);
        FileInputStream fis=new FileInputStream(fichero);
        for(int i =0;i<12;i++){
            fos.write(i);
        }
        int dato;
        while((dato=fis.read())!=-1){

            System.out.println(dato);
        }
        fos.close();
        fis.close();
    }


}
