package object.test;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(2021, 9, 9);
		MyDate date2 = new MyDate(2021, 9, 9);
		
		System.out.println("equals: " + date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}
}
