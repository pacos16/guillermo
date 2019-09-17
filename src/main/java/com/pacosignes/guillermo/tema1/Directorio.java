package com.pacosignes.guillermo.tema1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Directorio {
    private File file;
    private File[] lista;
    private Queue<File> cola=new LinkedList<>();


    public Directorio(File file) {
        this.file = file;
        try {
            lista = new File[file.list().length];
            for (int i = 0; i < file.list().length; i++) {
                lista[i] = new File(file, file.list()[i]);
                cola.add(new File(file, lista[i].getName()));
            }


        } catch (NullPointerException npe) {
            lista = null;
        }
    }

    public File getFile(){
        return cola.poll();
    }




    public String getCanonicalPath(){
        try {
            return file.getCanonicalPath();
        }catch (IOException ioe){
            return "no canonical";

        }
    }
}
