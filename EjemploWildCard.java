
import java.util.ArrayList;

public class EjemploWildCard {
	
	
	public double suma(ArrayList<? extends Number> valores){
		double contenedor=0;
		/*
		for(int i=0;i<valores.size();i++){
			contenedor+=valores.get(i).doubleValue();	
		}
		*/
		for(Number valor:valores){
			contenedor+=valor.doubleValue();
		}
		return contenedor;
	}
	
	public static void imprime(ArrayList<?> lista){  //public static void imprime(ArrayList<Object> lista){
		/* for(int i=0;i<lista.size();i++){
				System.out.println(lista.get(i));
		}
		*/
		
		for(Object valor: lista){
			System.out.println(valor);
		}
	}
	public void ejemploSwitch(String calif){
		switch(calif){
			case "A+":
				System.out.println(100);
				break;
			case "A":
				System.out.println(95);
				break;
			case "A-":
				System.out.println(90);
				break;
			case "B+":
				System.out.println(85);
				break;
			case "B":
				System.out.println(80);
				break;
			case "B-":
				System.out.println(70);
				break;
			case "C+":
				System.out.println(69);
				break;
			case "C":
				System.out.println(65);
				break;
			case "C-":
				System.out.println(60);
				break;
			case "F":
				System.out.println(49);
				break;
				
		}
	}
	public static int suma(int...valores){
		int suma=0;
		for(int valor:valores){
			suma+=valor;
		}
		return suma;
	}
	
	public static void main(String []args){
		
		ArrayList<Number> arreglo= new ArrayList<>();
		arreglo.add(34);
		arreglo.add(43.5);
		arreglo.add(22.5);
		
		ArrayList<Integer> arregloInt= new ArrayList<>();
		arregloInt.add(34);
		arregloInt.add(45);
		arregloInt.add(21);
		
		EjemploWildCard eje= new EjemploWildCard();
		System.out.println(eje.suma(arreglo));
		System.out.println(eje.suma(arregloInt));
		imprime(arreglo);
		eje.ejemploSwitch("A+");
		
	}
}
