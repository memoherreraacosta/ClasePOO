
public class Clock {
	private int hr,
				min,
				sec;
	
	public Clock(){
		this.hr=12;
		this.min=0;
		this.sec=0;
	}
	public Clock(int hr, int min, int sec){
		this.setTime(hr, min, sec);
	}
	public void setTime(int hr, int min, int sec){
		if(hr>=0 && hr<24){
			this.hr=hr;
		}else{
			this.hr=12;
		}
		
		if(min>=0 && min<60){
			this.min=min;
		}else{
			this.min=0;
		}
		
		if(sec>=0 && sec<60){
			this.sec=sec;
		}else{
			this.sec=0;
		}	
	}
	public int getHours(){
		return this.hr;
	}
	public int getMinutes(){
		return this.min;
	}
	public int getSeconds(){
		return this.sec;
	}
	public void printTime(){
		System.out.println(this.hr+":"+this.min+":"+this.sec);
	}
	
}
