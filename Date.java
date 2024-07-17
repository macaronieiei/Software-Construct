package Lap4;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setterDay(int day) {
		if(day>=1 && day<=31)
			this.day = day;
	}
	public int getterDay() {
		//System.out.println(day);
		return day;
		}
	public void setterMonth(int month) {
		if(month>=1 && month<=12)
			this.month = month;
	}
	public int getterMonth() {
		//System.out.println(month);
		return month;
		}
	public void setterYear(int year) {
		this.year = year;
	}
	public int getterYear() {
		//System.out.println(year);
		return year+543;
		}
	/*public void print() {
		System.out.println(day+","+month+","+year);
	}*/
}
	
