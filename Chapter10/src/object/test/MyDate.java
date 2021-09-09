package object.test;

public class MyDate {
	public int year;
	public int month;
	public int day;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate instance = (MyDate)obj;
			return this.year == instance.year && this.month == instance.month && this.day == instance.day;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return day*11 + month*101 + year*1001;
	}
	
}
