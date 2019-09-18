package com.pacosignes.guillermo.tema1;

import java.io.IOException;
import java.util.Scanner;

public class EscribirFich {
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        char c='w';
        while(c!='\\') {
            System.out.println("DIme un char");
            c=lector.nextLine().charAt(0);

        }

    }
}
