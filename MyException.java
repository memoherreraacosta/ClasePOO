
public class MyException extends RuntimeException{

	public MyException(){
		super("Ocurrio una excepción");
	}
	public MyException(String msj){
		super(msj);
	}

}
