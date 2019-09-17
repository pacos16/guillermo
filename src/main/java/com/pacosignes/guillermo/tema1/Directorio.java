package com.pacosignes.guillermo.tema1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Directorio {
    private File file;

    private Queue<File> cola=new LinkedList<>();


    public Directorio(File file) {
        this.file = file;
        try {

            for (int i = 0; i < file.list().length; i++) {

                cola.add(new File(file, file.list()[i]));
            }


        } catch (NullPointerException npe) {

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
