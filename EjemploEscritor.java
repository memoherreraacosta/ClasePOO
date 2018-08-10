
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class EjemploEscritor {
	public static void main(String []args){
		try{
			FileWriter fw=new FileWriter("Ejem.txt");
			PrintWriter pw=new PrintWriter(fw);
			pw.println("hola bebe");
			pw.println("hola bebe");
			pw.flush();
			pw.println(1/0);
			pw.println("hola bebe");
			pw.close();
		}catch(Exception e){
			System.out.println("Error");
		}
		
		 StringTokenizer st = new StringTokenizer("this is a test");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	}

}
