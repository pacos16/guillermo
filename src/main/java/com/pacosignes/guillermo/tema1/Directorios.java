package com.pacosignes.guillermo.tema1;
import java.io.*;
public class Directorios {
    public static void main(String[] args) {
        File path=new File("C:\\Users\\user\\Documents");
        String[] list=path.list();
        while () {

            for (String s : list
            ) {
                File file = new File(path, s);
                if (file.isDirectory()) {
                    try {
                        String[] list1 = file.list();

                    } catch (NullPointerException npe) {
                        System.out.println("Null pointer");
                    }
                } else {
                    System.out.println("Fichero " + file.getName());
                }
            }
        }
    }
}
