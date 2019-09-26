
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
        final int REGISTRO=19; //tamaño de mi registro
        Scanner lector=new Scanner(System.in);
        RandomAccessFile raf=new RandomAccessFile(fichero,"rw");
        System.out.println("Dime un id");
        int ide=lector.nextInt();
        String[] noms= {"Ruben","Toni","Juan","Christian"};
        int[] edad= {22,23,24,25};
        double[] nota={3.5,8.3,6.8,5.4};
        //introduccion de datos
        for (int i=0;i<noms.length;i++){
            raf.writeUTF(noms[i]);
            raf.writeInt(edad[i]);
            raf.writeDouble(nota[i]);
        }
        raf.seek(0);//se inicializa el puntero a 0
        int id=1;
        boolean encontrado=false;
        //condicion de busqueda, que el puntero no este mas lejos que el tamaño y no encontrado
        while(raf.getFilePointer()<raf.length() && !encontrado){
            //leemos datos y los guardamos
            String nom=raf.readUTF();
            int edadp=raf.readInt();
            double notat=raf.readDouble();
            //si coincide imprimimos
            if(id==ide) {
                System.out.println(nom);
                System.out.println(edadp);
                System.out.println(notat);
                encontrado=true;
            }
            id++;
        }
        if (!encontrado) System.out.println("No encontrado");


        System.out.println("dime la id");
        id= lector.nextInt();
        raf.seek(0);
        // comprobamos que id+registro es menor que el tamaño
        if((id*REGISTRO)<raf.length()){
            //ponemos el puntero en la posicion de inicio
            raf.seek((id-1)*REGISTRO);
            System.out.println(raf.readUTF());
            System.out.println(raf.readInt());
            System.out.println(raf.readDouble());
        }else {
            System.out.println("lol");
        }
        raf.close();
    }

}
