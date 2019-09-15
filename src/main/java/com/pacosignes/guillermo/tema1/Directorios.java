package com.pacosignes.guillermo.tema1;
import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Directorios {
    public static void main(String[] args) {
        File path=new File("C:\\Users\\user\\Documents\\MODUL");

        boolean condicion=true;
        Stack<Directorio> pila=new Stack<>();
        File file=path;
        int profundidad=0;
        pila.add(new Directorio(path));

        while (condicion) {
            String[] list=file.list();
            if (list!=null) {
                for (int i = 0; i < list.length; i++) {
                    file = new File(path, list[i]);
                    if (file.isDirectory()) {
                        pila.add(new Directorio(file));
                        try {
                            profundidad++;
                            System.out.printf("%" +((profundidad*3)+10)+ "s  %s \n", "Directorio", file.getName());
                            list = file.list();
                            i = 0;

                        } catch (NullPointerException npe) {
                            System.out.printf("%" +((profundidad*3)+10)+ "s \n", "Directorio vacio");
                        }
                    } else {
                        System.out.println("Fichero " + file.getName());
                    }
                }
            }
            profundidad--;
            file=file.getParentFile().getParentFile();
            if(file.getPath().equals(path.getParentFile().getParentFile().getPath())){
                condicion=false;
            }
        }
    }
}
