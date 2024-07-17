package lap4;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDay(int day) {
		if(day>=1 && day<=31)
			this.day = day;
	}
	public int getDay() {
		//System.out.println(day);
		return day;
		}
	public void setMonth(int month) {
		if(month>=1 && month<=12)
			this.month = month;
	}
	public int getMonth() {
		//System.out.println(month);
		return month;
		}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		//System.out.println(year);
		return year+543;
		}
	/*public void print() {
		System.out.println(day+","+month+","+year);
	}*/
}
