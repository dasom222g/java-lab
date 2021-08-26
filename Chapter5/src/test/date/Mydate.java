package test.date;

public class Mydate {
	private int day;
	private int month;
	private int year;
	private boolean isValid;
	private boolean isYoon;
	
	public Mydate(int day, int month, int year) {
		isValid = true;
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (day <= 0 || day > 31) this.isValid = false;
				else this.day = day;
				break;
			case 4: case 6: case 9: case 11:
				if (day <= 0 || day > 30) this.isValid = false;
				else this.day = day;
				break;
			case 2: 
				// 윤달은 29일까지 아닌경우 28일까지
				isYoon = this.year % 4 == 0; // true면 윤달
				if (day <= 0 || (isYoon && day > 29) || (!isYoon && day > 28)) this.isValid = false;
				else this.day = day;
				break;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month <= 0 || month > 12) isValid = false;
		else this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year <= 0) isValid = false;
		else this.year = year;
	}
	
	public String getDate() {
		return isValid ? "유효한 값 입니다. " + year + "년 " + month + "월 " + day + "일" : "유효하지 않습니다.";
	}
	
}
