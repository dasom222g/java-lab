package test.date;

public class MydateTest {

	public static void main(String[] args) {
		Mydate today = new Mydate(26, 8, 2021);
		Mydate testDate = new Mydate(29, 2, 2016); //����üũ
		
		System.out.println(today.getDate());
		System.out.println(testDate.getDate());
	}

}
