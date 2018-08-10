//Guillermo Herrera Acosta 
//A01400835

public class EjemplosArreglos{
	
	public static void main(String[]args){
		
		EjemplosArreglos am= new EjemplosArreglos();

		int [] valores={1,2,4,3};
		String [][] valoresString= {{"cat","dog","lizard"},{"bear","shark","snake"}};

		System.out.println("La suma de todos los valores del arreglo es: "+am.suma(valores)); 
		System.out.println("El número más grande dentro del arreglo es: "+am.maximo(valores));
		System.out.println("El número más pequeño dentro del arreglo es: "+am.minimo(valores));
		System.out.println("El promedio de todos los números dentro del arreglo es: "+am.promedio(valores));
		System.out.println();
		am.imprime(valoresString);
		System.out.println();
		System.out.println();

		
		int filas= Integer.parseInt(args[0]);
		int columnas= Integer.parseInt(args[1]);
		
		String [][] arreglo= new String[filas][columnas]; 
		
		int contador=2;
		
		for(int i=0; i<filas; i++){
			for(int j=0; j<columnas; j++){	
				arreglo[i][j]=args[contador++];
				System.out.print(arreglo[i][j]+" ");
			}
			System.out.println();
		}		
	
	}

	public int suma(int[] arreglo){
		int x=0;
		for(int i=0; i<arreglo.length;i++){
			x+=arreglo[i];
		}
		return x;
	}
	public int maximo(int[] arreglo){
		int x=arreglo[0];
		for(int i=0; i<arreglo.length;i++){
			if(arreglo[i]>x){
				x=arreglo[i];
			}
		}
		return x;
	}
	
	public int minimo(int[] arreglo){
		int x=arreglo[0];
		for(int i=0; i<arreglo.length;i++){
			if(arreglo[i]<x){
				x=arreglo[i];
			}
		}
		return x;
	}
	public double promedio(int[] arreglo){
		int x=0;
		for(int i=0; i<arreglo.length;i++){
			x+=arreglo[i];
		}
		return (x/arreglo.length);
	}	

	public void imprime(String [][] arreglo){
		
		for(int i=0; i<arreglo.length; i++){

			for(int j=0 ; j<arreglo[i].length;j++){
				
				if(arreglo[0][2]==arreglo[i][j]){
					System.out.print(arreglo[0][2]+"\n");
				}else{
					System.out.print(arreglo[i][j]+" ");
				}
				
			}
		}
	}
}