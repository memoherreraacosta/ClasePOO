//Nombre del autor: 		Guillermo Herrera Acosta.
//Matricula del autor: 		A01400835.

//Esta clase calcula la desviación estandar  

import javax.swing.*;

public class DesviacionEstandar{

	public static void main(String []args){
		
		JOptionPane.showMessageDialog(null, "La desviación estandar es:"+calculaDesviacion());
	}

	public static double calculaDesviacion(){

		double totalXSuma=0;
		double numRecibido=0;
		double totalXCuadrado=0;
		double desviacion=0;

		for(int i=0;i<10;i++){

			numRecibido=Double.parseDouble(JOptionPane.showInputDialog("Escribe el número de x"+(i+1)));
			totalXSuma=totalXSuma+numRecibido;
			totalXCuadrado=totalXCuadrado+Math.pow(numRecibido,2);
		
		}
		totalXSuma=(Math.pow(totalXSuma,2))/10;
		desviacion=Math.sqrt((totalXCuadrado-totalXSuma)/9);

		return desviacion;
	}
}
