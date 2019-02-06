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
		return new Complejo((this.real+x.real),(this.imaginario+x.imaginario));
	}
	public Complejo resta(Complejo x){
		return new Complejo((this.real-x.real),(this.imaginario-x.imaginario));
	}
	public Complejo multiplicacion(Complejo x){
		return new Complejo((this.real*x.real),(this.imaginario*x.imaginario));

	}
	public Complejo multiplicacion(double real, double imaginario){
		return new Complejo((this.real*real),(this.imaginario*imaginario));
	}
	public Complejo conjugado(){
		return new Complejo((this.real),(this.imaginario));
	}
}
