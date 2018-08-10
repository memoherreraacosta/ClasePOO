
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CalculaNomina {
	public static void main(String[]args){
		try{
			StringTokenizer st;
			BufferedReader br=new BufferedReader(new FileReader("horasTrabajadas.txt"));
			PrintWriter pw= new PrintWriter(new FileWriter("nominaSemanal.csv"));
			//PrintWriter pw= new PrintWriter(new FileWriter("Ejem.txt"));
			pw.println("Nombre Completo,Pago");
			
			String linea,
				   nombre,
				   apellido;
			int hrs;
			double tabulador;
	
			br.readLine();
			
			while((linea=br.readLine())!= null){
				st=new StringTokenizer(linea);
				nombre=st.nextToken();
				apellido=st.nextToken();
				hrs=Integer.parseInt(st.nextToken());
				tabulador=Double.parseDouble(st.nextToken());
				pw.println(nombre+" "+apellido+","+hrs*tabulador);
			}
			
			pw.close();
			br.close();
		
			String a="1,26,7,5,4,3,3";
			st=new StringTokenizer(a,",");
			while(st.hasMoreTokens()){
				System.out.println(st.nextToken());
			}	
			
		}catch(FileNotFoundException ex){
			System.out.println(ex);
		}catch(IOException ex){
			System.out.println(ex);
		}
	}

}
