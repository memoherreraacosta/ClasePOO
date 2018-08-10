
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLector {
	public static void main(String[]args){
		try{
			BufferedReader br=new BufferedReader(new FileReader("Ejm.txt"));
			String lectura=br.readLine();
			br.close();
			System.out.println(lectura);
			
		}catch(FileNotFoundException ex){
			System.out.println("No se encuentra el archivo");
		}catch(IOException e){
			System.out.println("No se pudo leer");
		}finally{
			System.out.println("Finally");
		}
	}
}
