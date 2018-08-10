
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class NalePanel extends JPanel{
	
	
	public NalePanel(){
		super();
		this.setPreferredSize(new Dimension(800,600));

	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		
		
	}
}
