import java.util.*;

public class Baraja{
	private Naipe[] cartas;
	private Random ran;

	public Baraja(){
		this.ran=new Random();
		this.cartas=new Naipe[52];
		int c=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				this.cartas[c++]=new Naipe(j,i);
			}
		}
	}

	public void mezclar(){
		int aleatorio;
		Naipe tmp;
		for(int i=0;i<this.cartas.length;i++){
			aleatorio=this.ran.nextInt(52);
			tmp=this.cartas[i];
			this.cartas[i]=this.cartas[aleatorio];
			this.cartas[aleatorio]=tmp;
		}
	}

	public String toString(){
		String res="";
		for(int i=0;i<this.cartas.length;i++){
			res+=this.cartas[i]+"\n";
		}
		return res;
	}
	public static void main(String []args){
		Naipe jotoDeCorazones= new Naipe(10,1);
		//System.out.println(jotoDeCorazones);

		Baraja cart= new Baraja();
		System.out.println(cart);
		System.out.println();
		cart.mezclar();
		System.out.println(cart);
	}
}