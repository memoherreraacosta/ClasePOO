//Nombre del autor: 		Guillermo Herrera Acosta.
//Matricula del autor: 		A01400835.

//Esta clase pregunta por un año y determina si es bisiesto o no. 

import javax.swing.*;

public class Bisiesto{

	public static void main(String []args){

		imprimirAno();
	}

	public static void imprimirAno(){
		int ano=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el año que deseas saber si es bisiesto")); 

		if (calcularBisiesto(ano)){
			JOptionPane.showMessageDialog(null,"El año "+ano+" es bisiesto");
		}else{
			JOptionPane.showMessageDialog(null,"El año "+ano+" no es bisiesto");
		}
	}

	public static boolean calcularBisiesto(int anoB){
			if(anoB%4 ==0){
				return true;
			}else{
				return false;
			}
	}
}