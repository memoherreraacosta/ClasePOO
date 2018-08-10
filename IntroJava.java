//Guillermo Herrera Acosta 
//A01400835
//10 Agosto 2017


import javax.swing.*;

public class IntroJava{
	
	//Método main
	public static void main(String []args){
		calificacion();
		numeros1al100();
		serie(7);
		mayor(9,10,10);
		int totalCalorias= calorias();
		JOptionPane.showMessageDialog(null, "El total de calorías en el día de hoy son: "+totalCalorias);
	}

	//Este método es para conocer el estatus de una calificación
	public static void calificacion(){
		String sNota=JOptionPane.showInputDialog("Escribe una nota");

		int nota= Integer.parseInt(sNota);

		if(nota>=70){
			//System.out.println("Aprobado");
			JOptionPane.showMessageDialog(null,"La nota "+nota+" es aprobatoria");
		}else{
			//System.out.println("Reprobado");
			JOptionPane.showMessageDialog(null,"La nota "+nota+" es reprobatoria");
		}
	}

	//Este método imprime los números del 1 al 100
	public static void numeros1al100(){

		for(int i=0; i<100; i++){
			System.out.println(i+1);
		}
	}
	//Este método imprime los primeros 50 números con base en algún número n establecido en el main
	public static void serie(int base){
		for(int i=0;i<50;i++){
			System.out.println(base*(i+1));
		}
	}
	
	//Este método imprime el número de calorías consumidas en un número n de comidas en un día
	public static int calorias(){
		int numComidas= Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de comidas en el día"));
		int totalCalorias=0;

		for(int i=0; i<numComidas;i++){
			totalCalorias=totalCalorias+Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de calorías en la comida: "+(i+1)));
		}
		return totalCalorias;
	}

	//Este método evalúa e imprime si algún número es el más grande, si hay dos o más iguales entonces imprime que hay algunos números repetidos
	public static void mayor(int a, int b, int c){

		if(a>b && a>c){
			System.out.println("El número a: "+a+" es el mayor");
		}else if(b>a && b>c){
			System.out.println("El número b: "+b+" es el mayor");
		}else if(c>a && c>b){
			System.out.println("El número c: "+c+" es el mayor");
		}else if(a==b|| a==c || b==c){
			System.out.println("No hay algún número que sea mayor porque hay mínimo dos números iguales");
		}
	}
}
