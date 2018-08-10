
public class EjeClaseG <E extends Comparable<E>>{
	
	private E[] arreglo;
	
	public EjeClaseG(E[] arreglo){
		this.arreglo=arreglo;
	}
	
	public E min(){
		E menor=this.arreglo[0];
		for(int i=0;i<this.arreglo.length;i++){
			if(this.arreglo[i].compareTo(menor)<0){
				menor=this.arreglo[i];
			}
		}
		return menor;
	}
	
	public static void main(String[]args){
		
		Integer [] numeros={6,5,4,3,2,5};
		Double [] decimales={1.2,13.4,2345.2,24.445};
		String [] arr={"los","maleantes","recibirán","su","castigo"};
		
		EjeClaseG<Integer> eje1= new EjeClaseG<>(numeros);
		int a=eje1.min();
		System.out.println("El número menor del arreglo es: "+a);
		
		EjeClaseG<Double> eje2= new EjeClaseG<>(decimales);
		double b=eje2.min();
		System.out.println("El número menor del arreglo es: "+b);
		
		EjeClaseG<String> eje3= new EjeClaseG<>(arr);
		String c= eje3.min();
		System.out.println("El String menor es: "+c);
		
	}

}
