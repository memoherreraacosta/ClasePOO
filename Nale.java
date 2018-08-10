

import javax.swing.JFrame;

public class Nale extends JFrame{
	
		private NalePanel panelD;
		
	public Nale(){
		super("Nombre Ventata");
		this.panelD=new NalePanel();
		this.add(panelD);
		this.pack();
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String []args){
		Nale entana= new Nale();
	}
}
