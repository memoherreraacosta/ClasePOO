
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	public Ventana(){
		super("Vamoosh de Pocoyo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MiPanel panelDibujo= new MiPanel();
		this.add(panelDibujo);
		this.add(new PanelControles(panelDibujo),BorderLayout.WEST);
		this.setVisible(true);
		this.pack();//Hace que se ajuste a lo que manda JPanel
		//this.setSize(800, 600); //Tiene más jerarquía que setPreferedSize
		this.setResizable(false);
	}
	
	public static void main(String[] args){
		Ventana ventana= new Ventana();	
	}
}
