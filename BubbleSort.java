

public class BubbleSort{
		
		/*
		public void ordenar(int[] arreglo){
			
			int contenedor;
			boolean bandera=true;
			
			while(bandera){
				
				bandera=false;
				for(int i=0;i<arreglo.length-1;i++){
					if(arreglo[i]<arreglo[i+1]){
						contenedor=arreglo[i];
						arreglo[i]=arreglo[i+1];
						arreglo[i+1]=contenedor;
						bandera=true;
					}
				}
			}
			
		}
		*/
		public <E extends Comparable<E>> void bubbleSort(E[] datos){
				
				E contenedor=datos[0];
				boolean bandera=true;
				
				while(bandera){
					
					bandera=false;
					for(int i=0;i<datos.length-1;i++){
						
						if(datos[i].compareTo(datos[i+1])<0){
							contenedor=datos[i];
							datos[i]=datos[i+1];
							datos[i+1]=contenedor;
							bandera=true;
						}
					}
				}
				
			}
		
		public static void main(String[]args){
			
			/*
			BubbleSort o= new BubbleSort();
			Integer[] arreglo={-4,-4,12,4,0,12,-9,23,120};
			String[] arregloS={"Hola","Jus"};
			o.ordenar(arreglo);
			
			for(int i=0;i<arreglo.length;i++){
				System.out.println(arreglo[i]);
			}
		
			o.<Integer>bubbleSort(arreglo);
			
			for(int i=0;i<arreglo.length;i++){
				System.out.println(arreglo[i]);
			}
			
			o.<String>bubbleSort(arregloS);
			
			for(int i=0;i<arregloS.length;i++){
				System.out.println(arregloS[i]);
			}
			*/
		}	
}


