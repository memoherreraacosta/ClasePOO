
import java.util.Scanner;

public class ListaDulces {

	public static void main(String[]args){
		double[] prices= new double[5];
		Scanner in= new Scanner(System.in);
	
		System.out.println("Ingresa 5 precios que deseas sumar");
		prices[0]=in.nextDouble();
		prices[1]=in.nextDouble();
		prices[2]=in.nextDouble();
		prices[3]=in.nextDouble();
		prices[4]=in.nextDouble();
		
		double total= prices[0]+prices[1]+prices[2]+prices[3]+prices[4];
		System.out.printf("El precio total de los 5 artículos es: $%5.2f",total);
	
	}
}
