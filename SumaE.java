public class SumaE{
	public static int sum(int...rf){
		int suma=0;

		for(int num:rf){
			suma+=num;
		}
		return suma;
	} 
	public static void main(String[]args){
		System.out.println(sum(2,5,54,9,3,12));
	}
}