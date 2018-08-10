
import javax.swing.JOptionPane;

public class Split {
	
	public static void main(String[] args){
		

		String x= JOptionPane.showInputDialog(null, "Ingresa una frase");
		String[] wordSplited= x.split("\\s+");
		
		for(int i=0;i<wordSplited.length;i++){
			JOptionPane.showMessageDialog(null, wordSplited[i]);
		}
	}
}
