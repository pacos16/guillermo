import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAcces2 {

    public static void main(String[] args) throws IOException {
        File fichero = new File("FicheroAleatorio2.dat");
        final int REGISTRO = 32; //tamaño de mi registro
        Scanner lector = new Scanner(System.in);
        RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
        String[] noms = {"Ruben", "Toni", "Juan", "Christian"};
        int[] edad = {22, 23, 24, 25};
        double[] nota = {3.5, 8.3, 6.8, 5.4};
        //introduccion de datos


        for(int i=0;i<noms.length;i++){
            for (int j=0;j<10;j++){
                try {
                    raf.writeChar(noms[i].charAt(j));
                }catch (IndexOutOfBoundsException ioob){
                    raf.writeChar(' ');
                }
            }
            raf.writeInt(edad[i]);
            raf.writeDouble(nota[i]);

        }
        int id;
        System.out.println("dime la id");
        id= lector.nextInt();
        raf.seek(0);
        // comprobamos que id+registro es menor que el tamaño
        if(((id-1)*REGISTRO)<raf.length()){
            //ponemos el puntero en la posicion de inicio
            raf.seek((id-1)*REGISTRO);
            for (int i =0;i<10;i++){
                System.out.print(raf.readChar());
            }
            System.out.print("\t");
            System.out.print(raf.readInt()+"\t");
            System.out.println(raf.readDouble());
        }else {
            System.out.println("lol");
        }
        raf.close();

    }

}
