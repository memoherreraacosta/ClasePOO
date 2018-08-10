/*	Guillermo Herrera Acosta 	A01400835 */
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;	
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.JOptionPane;

public class Copy{

	public void copear(){
		try{
			JFileChooser buscador=new JFileChooser();
			buscador.setDialogTitle("Escoge el archivo a copiar");
			buscador.showOpenDialog(buscador);
			String rutaLector=buscador.getSelectedFile().getAbsolutePath();

			BufferedReader bf= new BufferedReader(new FileReader(rutaLector));

			JFileChooser rutaGuardar=new JFileChooser();
			rutaGuardar.setDialogTitle("Escoge el nombre del archivo a copiar");
			rutaGuardar.showSaveDialog(null);
			File archivo= new File(rutaGuardar.getSelectedFile()+".txt");
			PrintWriter pw=new PrintWriter(new FileWriter (archivo));

			String linea=bf.readLine();

		while(linea!=null){
				pw.println(linea);
				linea=bf.readLine();
		}
		pw.close();
		bf.close();

		}catch(FileNotFoundException f){

			JOptionPane.showMessageDialog(null,"No se encontró archivo para leer");
		
		}catch(IOException e){
		
			JOptionPane.showMessageDialog(null,"Ocurrio un error al leer el archivo");		
		
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null,"Se ha cerrado la ventana sin escoger archivo a guardar o copiar");
		}

	}

	public static void main(String[] args){

		Copy copia=new Copy();
		copia.copear();

	}
}