
public class EjemploExcepcion {

	public void metodoA(){
		metodoB();
	}
	public void metodoB(){
		metodoC();
	}
	public void metodoC(){
		metodoD();
	}
	public void metodoD(){
		throw new MyException("Ocurrio un error");
	}
	
	public static void main(String []args){
		
		try{
			EjemploExcepcion a= new EjemploExcepcion();
			a.metodoA();
		}catch(MyException e){
			System.out.println("Voy a Finalizar el programa "+ e);
		}
		
	}
	
}
