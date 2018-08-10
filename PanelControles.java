
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class PanelControles extends JPanel implements ActionListener{

	private JTextField tfNombre;
	private JButton bSaludar, 
					bCambiarColor,
					bCambiarGlobo,
					bSelArchivo;
	private JRadioButton rbRojo,
						 rbVerde,
						 rbAzul;
	private MiPanel panelDibujo;
	private JFileChooser fc;
	private JSlider slider;
	
	public PanelControles(MiPanel panelDibujo){
		super();
		
		this.panelDibujo= new MiPanel();
		this.setPreferredSize(new Dimension(200,600));
		this.tfNombre= new JTextField(14);
		this.add(this.tfNombre);
		
		this.bSaludar= new JButton("Imprime saludar");
		this.bSaludar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Hola estoy en una clase anónima");
				PanelControles.this.panelDibujo.setNombre(PanelControles.this.tfNombre.getText());
			}
		});
		this.add(bSaludar);
		
		this.rbAzul= new JRadioButton("Color azul");
		this.rbAzul.setSelected(true);
		this.rbRojo= new JRadioButton("Color rojo");
		this.rbVerde= new JRadioButton("Color verde");
		ButtonGroup bg= new ButtonGroup();
		this.add(this.rbAzul);
		this.add(this.rbRojo);
		this.add(this.rbVerde);
		
		bg.add(this.rbAzul);
		bg.add(this.rbRojo);
		bg.add(this.rbVerde);
		
		this.bCambiarColor= new JButton("Cambiar");
		this.add(bCambiarColor);
		this.bCambiarColor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(PanelControles.this.rbAzul.isSelected()==true){
					PanelControles.this.setBackground(Color.blue);
				}else if(PanelControles.this.rbRojo.isSelected()==true){
					PanelControles.this.setBackground(Color.red);
				}else if(PanelControles.this.rbVerde.isSelected()==true){
					PanelControles.this.setBackground(Color.green);
				}
				
			}
		});
		
		this.bCambiarGlobo= new JButton("Cambiar color globo");
		this.bCambiarGlobo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color colorGlobo=JColorChooser.showDialog(PanelControles.this.panelDibujo, "Selecciona el color a cambiar",PanelControles.this.panelDibujo.getColor());
				PanelControles.this.panelDibujo.setColorGlobo(colorGlobo);
				
			}
		});
		this.add(this.bCambiarGlobo);
		
		this.bSelArchivo= new JButton("Seleccionar archivo");
		this.bSelArchivo.addActionListener(this);
		this.add(this.bSelArchivo);
		this.fc= new JFileChooser();
		
		this.slider=new JSlider(JSlider.VERTICAL,0,150,0);
		this.slider.setMajorTickSpacing(20);
		this.slider.setMinorTickSpacing(5);
		this.slider.setPaintTicks(true);
		this.slider.setPaintLabels(true);
		//this.slider.add...(this);
		
		//Agregar botón de cambiar color del globo
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*	
		if(e.getSource()==this.bCambiarGlobo){
			Color colorGlobo=JColorChooser.showDialog(this.panelDibujo, "Selecciona el color a cambiar",this.panelDibujo.getColor());
			this.panelDibujo.setColorGlobo(colorGlobo);
		}else{
			int opcion=this.fc.showOpenDialog(this.panelDibujo);
			if(opcion==this.fc.APPROVE_OPTION){
				System.out.println(this.fc.getSelectedFile());
			}
		}
		*/
	}
}
