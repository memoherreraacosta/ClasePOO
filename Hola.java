public class Hola{
	public static void main(String []args){


		String a= new String("HOla tbebe, como has estado?");
		String d= new String("   fierro morro t  ");

		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(d.trim());
		System.out.println(a.substring(7));
		System.out.println(a.substring(2,5));
		System.out.println(a.charAt(11));
		System.out.println(a.indexOf('t'));
		System.out.println(a.indexOf('t',8));
		System.out.println(a.lastIndexOf('t'));
;	}
}