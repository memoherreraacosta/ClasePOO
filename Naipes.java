
//import javax.swing.*;
import java.util.Scanner;

public class Naipes{


	public static void main(String[] args){

		String naipe; 

		//naipe= JOptionPane.showInputDialog("Introduzca la notación de la carta"); 
		Scanner in= new Scanner(System.in);
		
		System.out.println("Introduzca el código de la carta");
		naipe= in.nextLine();
		
		String num = naipe.substring(0,1);
		String palo= naipe.substring(1,2);
		String diez= naipe.substring(2);

			 if (num.equals("2")){
	
				num="Dos de ";
	
			} else if (num.equals("3")){
	
				num="Tres de ";
	
			} else if (num.equals("4")){
	
				num="Cuatro de ";
	
			} else if (num.equals("5")){
	
				num="Cinco de ";
	
			} else if (num.equals("6")){
	
				num="Seis de ";
	
			} else if (num.equals("7")){
	
				num="Siete de ";
	
			} else if (num.equals("8")){
	
				num="Ocho de ";
	
			} else if (num.equals("9")){
	
				num="Nueve de ";
	
			} else if (num.equals("J")){
	
				num="Joto de ";
	
			} else if (num.equals("j")){
	
				num="Joto de ";
	
			} else if (num.equals("q")){
	
				num="Reina de ";
	
			} else if (num.equals("Q")){
	
				num="Reina de ";
	
			} else if (num.equals("K")){
	
				num="Rey de ";
	
			} else if (num.equals("k")){
	
				num="Rey de ";
				
			} else if (num.equals("a")){
				
				num="As de ";
			
			} else if (num.equals("A")){
				
				num="As de ";
				
			}else if (num.equals("1")){
				
				num= "Diez de ";
				palo=diez;
				
			}
			 ///////////////////////////
			 // Palo //
			 
			if (palo.equals("d")){
				palo="Diamantes";
			} else 
			if (palo.equals("D")){
				palo="Diamantes";
	        } else 
			if (palo.equals("C")){
				palo="Corazones";
			} else 
			if (palo.equals("c")){
				palo="Corazones";
	        } else 
			if (palo.equals("E")){
				palo="Espadas";
	        } else 
			if (palo.equals("e")){
				palo="Espadas";
	        } else 
			if (palo.equals("T")){
				palo="Tréboles";
	        } else 
			if (palo.equals("t")){
				palo="Tréboles";
	        }
	    /////////////
			// Imprime la carta //
			System.out.println("Tu carta es: "+ num + palo);	
			//System.out.println(naipe.length());
	}
}
