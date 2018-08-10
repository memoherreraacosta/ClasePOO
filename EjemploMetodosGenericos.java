
public class EjemploMetodosGenericos {
	
	public <T> void imprimeArray(T[] arreglo){
		for(int i=0;i<arreglo.length-1;i++){
			System.out.print(arreglo[i]+", ");
		}
		System.out.println(arreglo[arreglo.length-1]);
	}
	/*
	public void imprimeArray(double[] arreglo){
		for(int i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);
		}
	}
	
	public void imprimeArray(String[] arreglo){
		for(int i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);
		}
	}
	*/
	public static void main(String []args){
		EjemploMetodosGenericos eje= new EjemploMetodosGenericos();
		
		Integer [] numeros={6,5,4,3,2,5};
		eje.imprimeArray(numeros);
	
		Double [] decimales={1.2,13.4,2345.2,24.445};
		eje.imprimeArray(decimales);
		
		String [] arr={"los","maleantes","recibirán","su","castigo"};
		eje.imprimeArray(arr);
	}
}
