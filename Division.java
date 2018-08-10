
import javax.swing.JOptionPane;

public class Division {
	
	public int division(int numerador, int denominador){
		return numerador/denominador;
	}
	public static void main(String []args){
		Division div= new Division();
		
		try{
			int numN=Integer.parseInt(JOptionPane.showInputDialog("Introduce el entero numerador"));
			int numD=Integer.parseInt(JOptionPane.showInputDialog("Introduce el entero denominador"));
			JOptionPane.showMessageDialog(null, "La división entera de: "+numN+"/"+numD+" es: "+ div.division(numN,numD));
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Has ingresado un valor diferente a entero");
		}
		catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null,"El valor de la división es indefinido");
		}
		
	}
}
