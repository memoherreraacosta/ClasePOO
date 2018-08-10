
/*	Guillermo Herrera Acosta 	A01400835
*/
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;	

public class CopiarArchivo{

	public static void main(String[] args){
		try{
			JFileChooser buscador=new JFileChooser();
			buscador.showOpenDialog(buscador);
			String ruta=buscador.getSelectedFile().getAbsolutePath();
			
			BufferedReader bf= new BufferedReader(new FileReader(ruta));
			
			PrintWriter pw=new PrintWriter(new FileWriter ("/Users/Memo_Acosta/desktop/Holka.txt"));

			String linea=bf.readLine();

		while(linea !=null){
				pw.write(linea);
				linea=bf.readLine();
		}
		pw.close();
		bf.close();

		}catch(FileNotFoundException f){

			System.out.println("No se encontró archivo para leer");
		
		}catch(IOException e){
		
			System.out.println("Ocurrio un error al leer el archivo");
		
		}catch(NullPointerException e){
			
		}
	}
}