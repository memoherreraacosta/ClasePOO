
import java.util.Scanner;

public class AreaCirculo {
	
	public static double area(double radio){
		return radio*Math.PI*radio;
	}
	
	public static void main(String []args){
		Scanner in= new Scanner(System.in);
		
		System.out.println("Ingrese el radio del circulo en centimetros");
		double radio= in.nextDouble();
		System.out.printf("El area del circulo es: %6.2f centimetros",area(radio));
	}

}
