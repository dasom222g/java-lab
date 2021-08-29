package hiding;

public class Mydate {
	private int day;
	private int month;
	private int year;
	private boolean isValid;
	
	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		if (day < 1 || day > 32) isValid = false;
		else {
			isValid = true;
			this.day = day;
		}
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) isValid = false;
		else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		System.out.println(year + " 년 " + month + " 월 " + day + "일 입니다.");
		if (isValid) System.out.println(year + " 년 " + month + " 월 " + day + "일 입니다.");
		else System.out.println("유효하지 않은 값 입니다");
	}
}
