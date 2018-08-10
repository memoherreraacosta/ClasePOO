
public class Naipe {
	
	private int valor;
	private int palo;
	private static final String [] valores={"As","Dos","Tres","Cuatro",
							"Cinco","Seis","Siete","Ocho",
							"Nueve","Diez","Joto",
							"Reina","Rey"};

	private static final String [] palos={"Espadas","Corazones","Treboles",
							"Diamantes"};

	public Naipe(int valor, int palo){
		this.valor=valor;
		this.palo=palo;
	}

	public String toString(){
		String carta=Naipe.valores[this.valor]+" de "+Naipe.palos[this.palo];
		return carta;
	}

	public static void main(String []args){
		Naipe carta= new Naipe(11,2);
		System.out.println(carta);
	}
}
