package g_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	// Source -> Generate Getter and Setter...
	// get = 값을 얻기 위함 , set = 값을 저장하기 위함
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		if(hour < 0){
			this.hour = 0;
		}else if(23 < hour){
//			this.hour = 23;
			this.hour = hour % 60;
//			this.hour = 0;
		}else{
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
		if(minute < 0){
			this.minute = 0;
		}else if(59 < minute){
//			this.minute = 59;
			this.minute = minute % 60;
			setHour(this.hour + minute / 60);
//			this.minute = 0;
//			setHour(this.hour + 1);

		}else{
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
		
	}

	public void setSecond(int second) {
		this.second = second;
		if(second < 0){
			this.second = 0;
		}else if(59 < second){
//			this.second = 59;
			this.second = second % 60;
			setMinute(this.minute + second / 60);
//			this.second = 0;
//			setMinute(this.minute + 1);
		}else{
			this.second = second;
		}
		
	}

	String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	
	
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second + 1);
		
			
		}
	}
	
	private void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}


















