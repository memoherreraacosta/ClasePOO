

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MiPanel extends JPanel implements Runnable, MouseListener, MouseMotionListener{	
	
	private int xV,
				yV,
				xLabel,
				yLabel;
	private Image fondo;
	private String nombrePocoyo;
	private boolean moverVamoosh;
	private Color colorGlobo;
	
	public MiPanel(){
		super();
		this.fondo= new ImageIcon("Back.jpg").getImage();
		this.xV=this.yV=0;
		this.xLabel=100;
		this.yLabel=570;
		this.colorGlobo=Color.RED;
		this.nombrePocoyo="Pocoyó";
		this.setPreferredSize(new Dimension(800,600));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.moverVamoosh=false;
		Thread hilo=new Thread(this);
		hilo.start();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(this.fondo,0,0,this.getWidth(),this.getHeight(),this);
		g.setColor(Color.ORANGE);
		g.fillOval(50+this.xV, 500-this.yV, 200, 100);
		g.setColor(Color.black);
		g.drawLine(100+this.xV, 508-this.yV, 100+this.xV, 400-this.yV);
		g.setColor(colorGlobo);
		g.fillOval(50+this.xV, 300-this.yV, 100, 100);
		g.setColor(Color.CYAN);
		g.fillArc(50+this.xV, 500-this.yV, 200, 100, 0, 100);
		g.setColor(Color.black);
		g.drawString("Vamos "+this.nombrePocoyo+"!!", this.xLabel, this.yLabel);
	
	}
	public void setNombre(String nombrePocoyo){
		this.nombrePocoyo=nombrePocoyo;
		this.repaint(); 
	}
	
	public void setColorGlobo(Color color){
		this.colorGlobo=color;
		this.repaint();
	}
	
	public Color getColor(){
		return this.colorGlobo;
	}
	
	public void run() {
		try{
			while(this.xV<550){
				if(this.moverVamoosh){
					this.xV+=2;
					this.yV++;
					this.repaint();
				}
				Thread.sleep(40);
			}
		}catch(InterruptedException ex){
			System.out.println("No se pudo ejecutar");
		}
	}

	//MouseListener
	@Override
	public void mouseClicked(MouseEvent e) {
		this.moverVamoosh= !this.moverVamoosh;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//MouseMotionListener
	@Override
	public void mouseDragged(MouseEvent e) {
		this.xLabel=e.getX();
		this.yLabel=e.getY();
		this.repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}
