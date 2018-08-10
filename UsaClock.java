
public class UsaClock {
	public static void main(String []args){
		
		Clock gdl =new Clock();
		Clock tij =new Clock(7,12,30);
		
		Clock tkt=new Clock(332,454,60);
		gdl.setTime(9, 12, 30);
		//tkt.setTime(234, 0, 92);
		
		gdl.printTime();
		tij.printTime();
		tkt.printTime();
	}

}
