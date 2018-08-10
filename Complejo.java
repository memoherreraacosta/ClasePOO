//Guillermo Herrera Acosta
//A01400835

public class Complejo {
	
	private double real,
				   imaginario;
	public Complejo(){
		this.real=0;
		this.imaginario=0;
	}
	public Complejo(double real, double imaginario){
		this.real=real;
		this.imaginario=imaginario;
	}
	public void establecer(double real, double imaginario){
		this.real=real;
		this.imaginario=imaginario;
	}
	public void imprimir(){
		System.out.println(this.real+","+this.imaginario+"i");
	}
	public void agregar(double real, double imaginario){
		this.real+=real;
		this.imaginario+=imaginario;
	}
	public void agregar(Complejo x){
		this.real+=x.real;
		this.imaginario+=x.imaginario;
	}
	public Complejo suma(Complejo x){
		Complejo c= new Complejo((this.real+x.real),(this.imaginario+x.imaginario));
		return c;
	}
	public Complejo resta(Complejo x){
		Complejo c= new Complejo((this.real-x.real),(this.imaginario-x.imaginario));
		
		return c;
	}
	public Complejo multiplicacion(Complejo x){
		Complejo c= new Complejo((this.real*x.real),(this.imaginario*x.imaginario));
		
		return c;
	}
	public Complejo multiplicacion(double real, double imaginario){
		Complejo c= new Complejo((this.real*real),(this.imaginario*imaginario));
		
		return c;
	}
	public Complejo conjugado(){
		Complejo c= new Complejo((this.real),(this.imaginario));
		
		return c;
	}
	
	public static void main(String[]args){
		
	}
}




