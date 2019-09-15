package com.pacosignes.guillermo.tema1;

import java.io.*;
import java.util.ArrayList;

public class Directorio {
    private File file;
    private int profundidad;
    private ArrayList<File> lista;

    public Directorio(File file, int profundidad) {
        this.file = file;
        this.profundidad = profundidad;
        for (String s: file.list()
             ) {
            lista.add(new File(file,s));
        }
    }

    public boolean remove(File file){
        return lista.remove(file);
    }
    public String getCanonicalPath(){
        try {
            return file.getCanonicalPath();
        }catch (IOException ioe){
            return "no canonical";

        }
    }
}
