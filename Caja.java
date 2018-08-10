
public class Caja extends Rectangulo{
	
		protected double alto;
		
		public Caja(){
			this(2,3,5);
		}
		
		public Caja(double largo, double ancho, double alto){
			super(largo,ancho);
			this.alto=alto;
		}
		public double volumen(){
			return super.area()*this.alto;
			
		}
		public double area(){
			return 2*(super.area()+
					this.largo*this.alto+
					this.ancho*this.alto);
		}
		public double perimetro(){
			return 2*(this.largo*2+this.ancho+this.alto*4);
		}
		
		public String toString(){
			return "Caja con largo: "+this.largo+", ancho de: "+this.ancho+" y alto: "+this.alto;
		}
		public void saluda(){
			
		}
}
