
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraI implements ActionListener{
	
	Panel pN, pb3;
	JPanel pS, pb2;
	JTextField jt1, jt2;
    JButton numeros[], operaciones[];
	String oper[]={":)", "C", "+", "/", "-", "*", "="},  ax="";
    float n1, n2, nr, M;
    int tipOp; 
    boolean t=false;
    
    public CalculadoraI(){
    	JFrame jfMain = new JFrame("Calculadora");
        jfMain.setLayout(new BorderLayout(4, 4));
 
        norte();
        sur();
        
        jfMain.add(this.pN, BorderLayout.NORTH);
        jfMain.add(this.pS, BorderLayout.CENTER);
 
        jfMain.setLocation(500,300);
        jfMain.setResizable(false);
        jfMain.setVisible(true);
        jfMain.setSize(300, 260);
        jfMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void norte(){
    	 this.pN = new Panel(null);        
    	 
         this.jt1 = new JTextField("");
         this.jt2 = new JTextField("0");
  
         this.jt1.setHorizontalAlignment(JTextField.RIGHT); 
         this.jt2.setHorizontalAlignment(JTextField.RIGHT); 
  
         this.jt1.setBorder(BorderFactory.createLineBorder(Color.white));
         this.jt2.setBorder(BorderFactory.createLineBorder(Color.white));
  
         this.jt1.setEditable(false);
         this.jt2.setEditable(false);
  
         this.jt1.setBackground(Color.white);
         this.jt2.setBackground(Color.white);
  
         this.pN.add( this.jt1); 
         this.pN.add( this.jt2);
  
         this.jt1.setBounds(35, 10, 200, 15);
         this.jt2.setBounds(35, 25, 200, 30);
  
         this.pN.setSize(270, 47);
         this.pN.setVisible(true);
  
    }
    
    public void sur(){
    	 this.pS = new JPanel(new BorderLayout(6, 50));
    	 this.pS.setLayout(new BorderLayout(4, 4));
   
          botNum();
          botOpe();
     
          this.pS.add(pb2, BorderLayout.CENTER); 
          this.pS.add(pb3, BorderLayout.EAST); 
   
          this.pS.setSize(270, 330);
    }
    
    
    public void botNum(){
    	 
    	 this.pb2 = new JPanel(null);

        int nx3=121, nx2=121, nx1=121, n3y=0, n2y=43, n1y=86;
        this.numeros = new JButton[12];
 
        
        for (int i=0; i<=10; i++){
 
            if(i<=9){
            	 this.numeros[i] = new JButton(""+i);
            	 this.pb2.add( this.numeros[i]);
            	 this.numeros[i].setMargin(new Insets(1, 1, 1, 1));
            	 this.numeros[i].addActionListener(this);  
            }else{
            	 this.numeros[i] = new JButton(".");
            	 this.numeros[11]= new JButton("i");
            	 this.pb2.add( this.numeros[i]);
            	 this.pb2.add( this.numeros[11]);
            	 this.numeros[i].setMargin(new Insets(1, 1, 1, 1));
            	 this.numeros[i].addActionListener(this);
            	 this.numeros[11].setMargin(new Insets(1, 1, 1, 1));
            	 this.numeros[11].addActionListener(this);
            }
        }
 
        for(int i=10; i>=0; i--){
 
            if(i==10){
            	 this.numeros[i].setBounds(121, 129, 35, 35);
            }
            else{
                if(i<=9 && i>=7){
                	 this.numeros[i].setBounds(nx3, n3y, 35, 35);
                    nx3-=43;
                }
                else if(i<=6 && i>=4){   
                    n3y+=43;                    
                    this.numeros[i].setBounds(nx2, n2y, 35, 35);
                    nx2-=43;
                }
                else if(i<=3 && i>=1){
                    n3y+=43;                    
                    this.numeros[i].setBounds(nx1, n1y, 35, 35);
                    nx1-=43;
                }
                else if(i==0){
                	 this.numeros[i].setBounds(35, 129, 35, 35); 
                	 this.numeros[11].setBounds(78, 129, 35, 35); 
                }
            }                
        }
 
        this.pb2.setSize(170, 150);
        this.pb2.setVisible(true);
    }

    public void botOpe(){
    	 
    	 this.pb3 = new Panel(null);
 
        int c=0, x=0, y=0;
 
        this.operaciones = new JButton[7];
 
        for(int i=0; i<=6; i++){
            if(c<=1){
 
            	 this.operaciones[i] = new JButton(oper[i]);
            	 this.pb3.add( this.operaciones[i]);
 
            	 this.operaciones[i].setBounds(x, y, 30, 35);
 
            	 this.operaciones[i].setMargin(new Insets(1, 1, 1, 1));
            	 this.operaciones[i].addActionListener(this);
                    x+=33;
                    c++;               
            }
            else{
                if(i==6){
                    x=0; y+=43;
                    this.operaciones[i] = new JButton(oper[i]);
                    this.pb3.add( this.operaciones[i]);
 
                    this.operaciones[i].setBounds(x, y, 65, 35);
 
                    this.operaciones[i].setMargin(new Insets(1, 1, 1, 1));
                    this.operaciones[i].addActionListener(this);
                    x+=33;
                    c++;
                }
                else{
                    c=0;
                    x=0; y+=43;
                    this.operaciones[i] = new JButton(oper[i]);
                    this.pb3.add( this.operaciones[i]);
 
                    this.operaciones[i].setBounds(x, y, 30, 35);
 
                    this.operaciones[i].setMargin(new Insets(1, 1, 1, 1));
                    this.operaciones[i].addActionListener(this);
                    x+=33;
                    c++;   
                }                             
            }                
 
        }
        this.pb3.setVisible(true);
        this.pb3.setSize(120, 200);
    }
    
    public boolean isN(String ax){
    	 
        try{
        	int n= Integer.parseInt(ax);
        	return true;
        	
        }catch(NumberFormatException e){
            return false;
        }
 
    }
	@Override
	public void actionPerformed(ActionEvent e) {
	
		try{
			
	        if(isN(e.getActionCommand())){ 
	 
	            if( this.jt1.getText().equals("")){
	            	 this.ax += e.getActionCommand();
	            	 this.jt2.setText(this.ax);
	            }
	            else{
	                if( this.tipOp==0){
	                    if(t){
	                    	 this.ax=""; 
	 
	                    	 this.jt1.setText( this.jt2.getText());                        
	                        this.ax += e.getActionCommand();
	                        this.jt2.setText(this.ax);    
	                        this.t = false;
	                    }
	                    else{
	                    	 this.ax="";
	                    	 this.ax +=  this.jt2.getText()+e.getActionCommand();
	                    	 this.jt2.setText( this.ax);
	                    }                
	                }else{
	                	 this.ax="";
	                	 this.ax +=  this.jt2.getText()+e.getActionCommand();
	                	 this.jt2.setText( this.ax);
	                }
	            }            
	        }
	        else{
	        	if(e.getActionCommand().equals("C") ){ 
	        		this.tipOp=0; 
	        		this.n1 = 0; 
	        		this.n2 =0; 
	        		this.nr=0; 
	        		this.jt1.setText(""); 
	        		this.jt2.setText("0"); 
	        		this.ax="";
	            }  
	        	if(e.getActionCommand().equals(".")){
	                ax="";
	                if(this.numeros[11].isEnabled()){
	                    this.numeros[11].setEnabled(false);
	                    this.ax = this.jt2.getText() +".";
	                    this.jt2.setText(this.ax);
	                }
	            }
	 
	            if(e.getActionCommand().equals(":)") ){
	            	JOptionPane.showMessageDialog(null, "Ha presionado la cartia feliz, te dará buena suerte en el día");
	            }
	            
	            if(e.getActionCommand().equals("+") ){
	            	 this.numeros[11].setEnabled(true);
	            	 this.ax="";
	                if(tipOp==1){
	 
	                }else if(tipOp==0 ){
	                        if( this.jt1.getText().equals("") ){
	                            n1 = Float.parseFloat(jt2.getText());                    
	                            this.ax +=  this.jt1.getText()+ this.jt2.getText();
	                            this.jt1.setText(ax+" + ");
	                            this.jt2.setText("");
	                            this.tipOp = 1;
	                        }
	                        else {
	                            if(t=false){
	                                n1 = Float.parseFloat(jt2.getText());                    
	                                this.ax +=  this.jt2.getText();
	                                this.jt1.setText( this.ax+" + ");
	                                this.jt2.setText("");
	                                this.tipOp = 1;
	                            }
	                            else{
	                                n1 = Float.parseFloat(jt2.getText());                    
	                                this.ax +=  this.jt1.getText();
	                                this.jt1.setText( this.ax+" + ");
	                                this.jt2.setText("");
	                                this.tipOp = 1;
	                            }
	                        }
	                    }                     
	             }
	                if(e.getActionCommand().equals("-") ){
	                	 this.numeros[11].setEnabled(true);
	                	 this.ax="";
	                    if( this.tipOp==2){
	 
	                    }else if( this.tipOp==0){
	                        if( this.jt1.getText().equals("")){
	                            n1 = Float.parseFloat(jt2.getText());                    
	                            this.ax +=  this.jt1.getText()+  this.jt2.getText();
	                            this.jt1.setText( this.ax+" - ");
	                            this.jt2.setText("");
	                            this.tipOp = 2;
	                        }
	                        else{
	                            if(! this.t){
	                            	 this.n1 = Float.parseFloat(jt2.getText());                    
	                                this.ax +=  this.jt2.getText();
	                                this.jt1.setText( this.ax+" - ");
	                                this.jt2.setText("");
	                                this.tipOp = 2;
	                            }
	                            else{
	                            	 this.n1 = Float.parseFloat(jt2.getText());                    
	                                this.ax +=  this.jt1.getText();
	                                this.jt1.setText( this.ax+" - ");
	                                this.jt2.setText("");
	                                this.tipOp = 2;
	                            }
	                        }
	                    }                    
	                }
	                if(e.getActionCommand().equals("*") ){
	                	 this.numeros[11].setEnabled(true);
	                	 this.ax="";
	                    if( this.tipOp==3){
	 
	                    }else if( this.tipOp==0){
	                        if( this.jt1.getText().equals("")){
	                            n1 = Float.parseFloat(jt2.getText());                    
	                            this.ax +=  this.jt1.getText()+ this.jt2.getText();
	                            this.jt1.setText( this.ax+" * ");
	                            this.jt2.setText("");
	                            this.tipOp = 3;
	                        }
	                        else{
	                            if(! this.t){
	                            	 this.n1 = Float.parseFloat( this.jt2.getText());                    
	                                this.ax +=  this.jt2.getText();
	                                this.jt1.setText( this.ax+" * ");
	                                this.jt2.setText("");
	                                this.tipOp = 3;
	                            }
	                            else{
	                            	 this.n1 = Float.parseFloat( this.jt2.getText());                    
	                                this.ax +=  this.jt1.getText();
	                                this.jt1.setText( this.ax+" * ");
	                                this.jt2.setText("");
	                                this.tipOp = 3;
	                            }
	                        }
	                    }                      
	                }
	                if(e.getActionCommand().equals("/") ){
	                	 this.numeros[11].setEnabled(true);
	                	 this.ax="";
	                    if( this.tipOp==4){
	 
	                    }else if( this.tipOp==0){
	                        if( this.jt1.getText().equals("")){
	                        	 this.n1 = Float.parseFloat( this.jt2.getText());                    
	                            this.ax +=  this.jt1.getText()+ this.jt2.getText();
	                            this.jt1.setText( this.ax+" / ");
	                            this.jt2.setText("");
	                            this.tipOp = 4;
	                        }
	                        else{
	                            if(! this.t){
	                            	 this.n1 = Float.parseFloat(jt2.getText());                    
	                                this.ax +=  this.jt2.getText();
	                                this.jt1.setText( this.ax+" / ");
	                                this.jt2.setText("");
	                                this.tipOp = 4;
	                            }
	                            else{
	                            	 this.n1 = Float.parseFloat( this.jt2.getText());                    
	                                this.ax +=  this.jt1.getText();
	                                this.jt1.setText( this.ax+" / ");
	                                this.jt2.setText("");
	                                this.tipOp = 4;
	                            }
	                        }
	                    }                      
	                }
	                if(e.getActionCommand().equals("=") && !  this.jt2.getText().equals("")){
	                	 this.t = true;
	                    if( this.tipOp==1){
	                    	 this.tipOp = 0;
	                    	 this.ax="";
	                    	 this.ax+= this.jt1.getText() +  this.jt2.getText();
	                    	 this.jt1.setText( this.ax);
	                    	 this.n2 = Float.parseFloat( this.jt2.getText());
	                        this.nr= this.n1+ this.n2;
	                        this.jt2.setText(String.valueOf( this.nr));
	                    }
	                    else if( this.tipOp==2){ 
	                    	 this.tipOp = 0;
	                    	 this.ax="";
	                    	 this.ax+= this.jt1.getText()+ this.jt2.getText();
	                    	 this.jt1.setText( this.ax);
	                    	 this.n2 = Float.parseFloat( this.jt2.getText());
	                    	 this.nr= this.n1- this.n2;
	                    	 this.jt2.setText(String.valueOf( this.nr));
	                    }
	                    if( this.tipOp==3){ 
	                    	 this.tipOp = 0;
	                    	 this.ax="";
	                    	 this.ax+= this.jt1.getText()+ this.jt2.getText();
	                    	 this.jt1.setText( this.ax);
	                    	 this.n2 = Float.parseFloat( this.jt2.getText());
	                    	 this.nr= this.n1* this.n2;
	                    	 this.jt2.setText(String.valueOf( this.nr));
	                    }
	                    if( this.tipOp==4){ 
	                        if(Float.parseFloat( this.jt2.getText())!=0){
	                        	 this.tipOp = 0;
	                        	 this.ax="";
	                        	 this.ax+= this.jt1.getText()+ this.jt2.getText();
	                        	 this.jt1.setText( this.ax);
	                        	 this.n2 = Float.parseFloat( this.jt2.getText());
	                        	 this.nr= this.n1/ this.n2;
	                        	 this.jt2.setText(String.valueOf( this.nr));
	                        }
	                        else
	                            JOptionPane.showMessageDialog(null, "No se puede realizar divison entre 0");
	                    }
	                }
	        }   
		}catch(Exception excep){
			JOptionPane.showMessageDialog(null,"Syntax error: \n ( "+jt1.getText()+ " )\nes una operación inválida");
			 this.tipOp=0; 
			 this.n1 = 0; 
			 this.n2 =0; 
			 this.nr=0; 
			 this.jt1.setText(""); 
			 this.jt2.setText("0"); 
			 this.ax="";
		}
	}   
	public static void main(String []args){
		CalculadoraI calcu= new CalculadoraI();
	}
}
