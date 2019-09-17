package com.pacosignes.guillermo.tema1;

import java.io.File;
import java.io.IOException;


public class Act03 {

    static File file=new File("/home/paco/DAM");

    public static void main(String[] args) {
            file.delete();
            file.mkdir();
            File file1=file;

                file1=new File(file,"1Aval");
                file1.mkdir();

            if(file1.exists()) {
                try {
                    File file3 = new File(file1, "Examen mio");
                    file3.createNewFile();
                    File file4 = new File(file1, "Examen tuyo");
                    file4.createNewFile();
                }catch(IOException ioe){

                }
            }
        file1=new File(file,"2Aval");
        file1.mkdir();

        file1=new File(file,"3Aval");
        file1.mkdir();

    }


}
