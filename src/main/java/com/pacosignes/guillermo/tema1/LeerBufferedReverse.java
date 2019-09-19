package com.pacosignes.guillermo.tema1;

import java.io.*;

public class LeerBufferedReverse {

    public static void main(String[] args) {
        try {
            File file = new File("Fichero.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(reverse(linea));
            }
        }catch (FileNotFoundException fnfe){
            System.out.println("FNFE");
        }catch (IOException ioe){
            System.out.println("IOE");
        }
    }

    public static String reverse(String s){
        StringBuilder s1=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}
