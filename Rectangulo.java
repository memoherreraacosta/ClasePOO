
public class Rectangulo implements Figura{

	protected double largo,
				   	 ancho;
	
	public Rectangulo(){
		this(2.0,3.0);
	}
	
	public Rectangulo(double largo, double ancho){
		this.largo=largo;
		this.ancho=ancho;
	}

	public double perimetro(){
		return 2*(this.largo+this.ancho);
	}
	
	public double area(){
		return this.largo*this.ancho;
	}
	
	public double volumen(){
		return 0.0;
	};
	
	public String toString(){
		return "Rectangulo con largo: "+this.largo+" y ancho: "+this.ancho;
	}
	
	public static void main(String[] args) {
		
		Figura[] figura={new Rectangulo(5,10), new Cuadrado(8.0),new Caja()};
		
		for(int i=0; i<figura.length; i++){
			
			System.out.println(figura[i]);
			System.out.println("Perimetro:"+ figura[i].perimetro());
			System.out.println("Area: "+ figura[i].area());
			System.out.println("Volumen:"+ figura[i].volumen());
			System.out.println();
		}
		((Caja)figura[2]).saluda();

	}

}
