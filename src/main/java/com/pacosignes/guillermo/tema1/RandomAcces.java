package com.pacosignes.guillermo.tema1;
import java.io.*;
import java.util.Scanner;

public class RandomAcces {

    /*int read()
    boolean readBoolean()
    long getFIlePointer()
    void seek(long pos)
    int skipBytes(int i)
     */
    public static void main(String[] args) throws IOException {
        File fichero=new File("FicheroAleatorio.dat");
        Scanner lector=new Scanner(System.in);
        RandomAccessFile raf=new RandomAccessFile(fichero,"rw");
        System.out.println("Dime un id");
        int ide=lector.nextInt();
        String[] noms= {"Ruben","Toni","Juan","Christian"};
        int[] edad= {22,23,24,25};
        double[] nota={3.5,8.3,6.8,5.4};

        for (int i=0;i<noms.length;i++){
            raf.writeUTF(noms[i]);
            raf.writeInt(edad[i]);
            raf.writeDouble(nota[i]);
        }
        raf.seek(0);
        int id=1;
        boolean encontrado=false;
        while(raf.getFilePointer()<raf.length() && !encontrado){
            String nom=raf.readUTF();
            int edadp=raf.readInt();
            double notat=raf.readDouble();
            if(id==ide) {
                System.out.println(nom);
                System.out.println(edadp);
                System.out.println(notat);
                encontrado=true;
            }
            id++;
        }
        if (!encontrado) System.out.println("No encontrado");
        raf.close();
    }

}
