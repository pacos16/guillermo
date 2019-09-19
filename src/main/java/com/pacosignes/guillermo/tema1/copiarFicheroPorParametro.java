package com.pacosignes.guillermo.tema1;

import java.io.*;

public class copiarFicheroPorParametro {

    public static void main(String[] args) {
        String fuente=args[0];
        String destino=args[1];
        try {
            File fileFuente = new File(fuente);
            File fileDestino=new File(destino);
            FileReader fileReader=new FileReader(fileFuente);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            FileWriter fileWriter=new FileWriter(fileDestino);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String linea;
            while((linea=bufferedReader.readLine())!= null){
                bufferedWriter.write(linea);
                bufferedWriter.newLine();

            }

        }catch(FileNotFoundException fnfe){

        }catch(IOException ioe){

        }

    }
}
