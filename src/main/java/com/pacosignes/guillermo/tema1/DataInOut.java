package com.pacosignes.guillermo.tema1;

import java.io.*;

public class DataInOut {

    public static void main(String[] args) throws IOException {
        File fich= new File("FicheroTipoData");
        FileOutputStream fos=new FileOutputStream(fich);
        FileInputStream fis=new FileInputStream(fich);
        DataOutputStream dos=new DataOutputStream(fos);
        DataInputStream dis=new DataInputStream(fis);

        String[] noms= {"Ruben","Toni","Juan","Christian"};
        int[] edad= {22,23,24,25};

        for (int i =0;i<edad.length;i++){

            dos.writeUTF(noms[i]);
            dos.writeInt(edad[i]);
        }

        while(dis.available()>0){
            System.out.print(dis.readUTF() +"\t");
            System.out.println(dis.readInt());
        }
    }
}
