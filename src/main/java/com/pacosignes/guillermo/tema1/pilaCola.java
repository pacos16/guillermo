package com.pacosignes.guillermo.tema1;

import java.io.File;
import java.util.Stack;

public class pilaCola {

    public static void main(String[] args) {
        File path=new File("C:\\Users\\user\\Documents\\MODUL");
        Stack<Directorio> pila=new Stack<>();
        File file;
        pila.add(new Directorio(path));

        while(!pila.empty()){
            file=pila.peek().getFile();
            if(file!=null){
                if(file.isDirectory()){
                    System.out.println(file.getPath());
                    pila.add(new Directorio(file));
                }else{
                    System.out.println(file.getPath());
                }
            }else{
                pila.pop();
            }
        }
    }
}
