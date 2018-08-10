
import java.util.Scanner;

public class Challenge {

	public static void main(String []args){
		
		Scanner in= new Scanner(System.in);
	
		//Dimensiones paredes casa
		
		System.out.println("En metros, cual es el largo de la casa?");
		double largoCasa= in.nextDouble();
		System.out.println("En metros, cual es el ancho de la casa?");
		double anchoCasa= in.nextDouble();
		System.out.println("En metros, cual es la altura de la casa?");
		double alturaCasa= in.nextDouble();
		
		double lado1=anchoCasa*alturaCasa;
		double lado2=largoCasa*alturaCasa;
		double totalArea=(lado1+lado2)*2;

		//Dimensiones puerta(s) casa
		double areaPuerta1=0;
		
		System.out.println("Cuantas puertas hay en el exterior de la casa?");
		int numPuertas= in.nextInt();
		
		areaPuerta1=0;	
			
		for(int i=0; i<numPuertas; i++){
					System.out.println("Cual es el alto de la puerta?");
					double largoPuerta= in.nextDouble();
					System.out.println("Cual es el ancho de la puerta?");
					double anchoPuerta= in.nextDouble();
					
					double areaPuerta=anchoPuerta*largoPuerta;
					areaPuerta1=areaPuerta1+areaPuerta;		
			}
		
		//Dimensiones Ventana
		double areaVentana1=0;
		
		System.out.println("Cuantas ventanas hay en el exterior de la casa?");
		int numVentanas= in.nextInt();
		
				
				for(int i=0; i<numVentanas; i++){
					System.out.println("Cual es el alto de la ventana?");
					double largoVentana= in.nextDouble();
					System.out.println("Cual es el ancho de la ventana?");
					double anchoVentana= in.nextDouble();
					
					double areaVentana=anchoVentana*largoVentana;
					areaVentana1=areaVentana1+areaVentana;
				}
			
		
		// Area total a pintar
		
			double areaPintar=totalArea-areaVentana1-areaPuerta1;
			
			System.out.println("Cuanta pintura se necesita por metro cuadrado?");
			double pinturaPorMetro = in.nextDouble();
			System.out.println("Cuanto cuesta el litro de pintura?");
			double precioPintura = in.nextDouble();
			
			double totalPintura= areaPintar*pinturaPorMetro;
			double totalPrecio= totalPintura*precioPintura;
		
		// Respuesta 
			
			System.out.println("");
			System.out.println("La casa con dimensiones de "+largoCasa+" metros de largo,"+anchoCasa+" metros de ancho,"+alturaCasa+" metros de alltura, con "+numVentanas+" ventana(s),"+numPuertas+" número de puerta(s); ocupa un total de "+areaPintar+" metros cuadrados por pintar, y en total costará "+totalPrecio+" pintar toda la casa.");
	}
	
}
