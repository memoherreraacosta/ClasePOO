public class Termometro{

	private int temp;

	public Termometro(){					//Constructor por default
		temp=0;
	}
	public Termometro(int temperatura){		//Constructor inicializador
		temp=temperatura;
	}

	public void setTemp(int temperatura){	//Setter 
		temp=temperatura;
	}
	public int getTemp(){					//Getter
		return temp;
	}
}