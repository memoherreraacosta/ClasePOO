
//Guillermo Herrera Acosta 
//A01400835
import javax.swing.JOptionPane;


public class AreaTriangulo {
	public static void main(String []args){
		//Anunciar nombre y matricula 
		try{
			JOptionPane.showMessageDialog(null,"Programa realizado por Guillermo Herrera Acosta");
			//Anunciar para que es el programa 
			JOptionPane.showMessageDialog(null,"Este programa calcula el área de un triángulo");
			//Preguntar por base del triangulo
			double base= Double.parseDouble(JOptionPane.showInputDialog("Escribe la base del triángulo"));
			//Preguntar por altura 
			double altura= Double.parseDouble(JOptionPane.showInputDialog("Escribe la altura del triángulo"));
			JOptionPane.showMessageDialog(null, "El área del triangulo de base "+base+" unidades y "+altura+" unidades, tiene un área de "+getArea(base,altura)+" unidades cuadradas");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Ha introducido un valor no numérico no valido");
		}
	}
	//Método que calcule el área del triangulo
	public static double getArea(double base, double altura){
		return (base*altura)/2;
	}

}

