
import java.util.Scanner;

public class Hospital {
	
	//Método que pregunta si es de noche o día
	public static String getHorario(){
		Scanner in= new Scanner(System.in);
		System.out.println("¿Es paciente internado?");
		String preguntaHorario= in.nextLine();
		return preguntaHorario;
	}
	
	//Método que pregunta precio de medicamentos 
	public static double getPrecioMed(){
		Scanner in= new Scanner(System.in);
		System.out.println("¿Cual fue el precio total de los medicamentos?");
		double precioTotalMed= in.nextDouble();
		return precioTotalMed;
	}
	
	//Método que pregunta sobre precio de laboratorio 
	public static double getPrecioLab(){
		Scanner in= new Scanner(System.in);
		System.out.println("¿Cual fue el precio total de los estudios de laboratorio?");
		double precioTotalLab= in.nextDouble();
		return precioTotalLab;
	}
	
	//Suma de lab y med 
	public static double getPrecioTotal(double precioTotalMed, double precioTotalLab){
		return precioTotalMed+precioTotalLab;
	}
	
	public static void main(String []args){
		
		Scanner in= new Scanner(System.in);
		System.out.println("¿Quiere hacer el calculo del monto total de algún paciente?");
		String respuestaLoop= in.nextLine();
		
		while(respuestaLoop.equals("Si")){
			
			String horario= getHorario();
			double precioMed= getPrecioMed();
			double precioLab= getPrecioLab();
			double precioT= getPrecioTotal(precioMed,precioLab);
			
			if(horario.equals("Si")){
				System.out.printf("El gasto total del paciente internado es de $%5.2f",precioT);
				System.out.println("");
			}else{
				System.out.printf("El gasto total del paciente es de $%5.2f",precioT);
				System.out.println("");
			}
			
			System.out.println("¿Quiere hacer el calculo del monto total de algún paciente?");
			respuestaLoop= in.nextLine();
			
		}
		
	}

}
