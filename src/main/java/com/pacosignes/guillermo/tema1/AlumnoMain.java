package com.pacosignes.guillermo.tema1;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoMain {


    public static void main(String[] args) throws IOException {
        String nombre;
        double nota;
        File file= new File("ObjectOuputStream");
        //ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
        ArrayList<Alumno> alumnos=new ArrayList<>(5);
        Scanner lector=new Scanner(System.in);
        /*
        for(int i=1;i<=5;i++){

            System.out.println("Dime el nombre del alumno "+i);
            nombre= lector.nextLine();
            System.out.println("Dime la nota");
            nota= lector.nextDouble();
            lector.nextLine();
            alumnos.add(new Alumno(i,nombre,nota));

        }
        for (Alumno a:alumnos
             ) {
            objectOutputStream.writeObject(a);
        }

        */

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
        try {
            Alumno alumno = (Alumno) objectInputStream.readObject();
            System.out.println(alumno.getNom());
            System.out.println(alumno.getExp());
            System.out.println(alumno.getNota());
        }catch (ClassNotFoundException cnfe){
            System.out.println("lol");
        }catch(EOFException eof){
            System.out.println("LOLOLOLO");
        }
    }
}
