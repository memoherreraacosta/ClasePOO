
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Boton extends JFrame implements ActionListener{
	private JLabel ingresaNombre;
	private JTextField nombre;
	private JButton click;
	private String guardaNombre="";
	
	public Boton(){
		this.setLayout(null);
		this.setSize(300,270);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.ingresaNombre=new JLabel("Ingresa tu nombre");
		//this.ingresaNombre.setSize(200, 100);
		this.ingresaNombre.setBounds(90,30,120,30);
		this.click= new JButton("Guardar");
		this.nombre= new JTextField();
		this.nombre.setBounds(80,60,130,30);
		this.click.setBounds(100,190,80,30);
		click.addActionListener(this);
		this.add(click);
		this.add(nombre);
		this.add(ingresaNombre);	
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==click){
			this.guardaNombre=this.nombre.getText();
			JOptionPane.showMessageDialog(null, "Hola "+this.guardaNombre);
			System.exit(0);
		}
	}
	public static void main(String []args){
		Boton b= new Boton();
		b.setVisible(true);
	}
}
