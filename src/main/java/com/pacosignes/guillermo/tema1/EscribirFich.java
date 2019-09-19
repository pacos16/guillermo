package com.pacosignes.guillermo.tema1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirFich {
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter=new PrintWriter(new FileWriter("Fichero.txt"));
        char c='w';
        while(c!='\\') {
            System.out.print("Dime un char \n");
            c=lector.nextLine().charAt(0);
            printWriter.println(c);

        }
        printWriter.close();
    }
}
