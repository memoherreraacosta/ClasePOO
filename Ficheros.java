import java.io.*;

public class Ficheros{
	public static void main(String [] args){
        try(BufferedReader br=new BufferedReader(new FileReader("D:\\fichero1.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\fichero1.txt"));){
            //Escribimos en el fichero
            bw.write("Esto es una prueba usando Buffered");
            bw.newLine();
            bw.write("Seguimos usando Buffered");
            //Guardamos los cambios del fichero
            bw.flush();
            //Leemos el fichero y lo mostramos por pantalla
            String linea=br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
	}
}