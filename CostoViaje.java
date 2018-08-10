
import java.util.Scanner;

public class CostoViaje{
	
	public static void main(String[] args){
		double distancia,kpl,precioLitro,costoTotal;
		@SuppressWarnings("resource")
		Scanner in= new Scanner(System.in);
		
		System.out.println("Introduzca la distancia en Km");
		distancia= in.nextDouble();
		System.out.println("Introduzca los Km por litro de su auto");
		kpl= in.nextDouble();
		System.out.println("Introduzca el precio de la gasolina");
		precioLitro= in.nextDouble();
		
		costoTotal= (distancia/kpl)*precioLitro;
		System.out.printf("El costo total del viaje es de $%5.2f",costoTotal);
	}
}