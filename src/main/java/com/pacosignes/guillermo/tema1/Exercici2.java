package com.pacosignes.guillermo.tema1;

import java.io.*;

public class Exercici2 {


    static File file = new File("./paco/fichero.java");

    public static void main(String[] args) {
        System.out.println(file.getAbsolutePath());
        try {
            System.out.println(file.getCanonicalPath());
        }catch (IOException io){
            System.out.println("ko");
        }
        System.out.println(file.getPath());
    }
}
