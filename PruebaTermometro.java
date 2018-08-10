public class PruebaTermometro{
	public static void main(String[]args){
		Termometro gda= new Termometro(25);
		Termometro isl= new Termometro();

		System.out.println(gda.getTemp());
		System.out.println(isl.getTemp());

		gda.setTemp(20);
		isl.setTemp(-5);

		System.out.println(gda.getTemp());
		System.out.println(isl.getTemp());
	}
}