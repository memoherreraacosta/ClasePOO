
import java.util.Arrays;

public class Arreglos {
	
	public static void main(String []args){

		int[] num= new int [4];
		int x=0;
		for(int i=0; i<num.length; i++){
			num[i]=x;
			x++;
		}
		System.out.println(Arrays.toString(num));
	}

}
