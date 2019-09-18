package com.pacosignes.guillermo.tema1;
import java.io.*;

public class LeerFichero {
    public static void main(String[] args) throws IOException{
        File file = new File("/home/paco/ficherito.txt");
        try {
            FileReader reader = new FileReader(file);
            int i;
            while (( i=reader.read())!=-1){
                System.out.print((char)i);
            }
        }catch (FileNotFoundException fnfe){
            System.out.println("lol");
        }
    }


}
