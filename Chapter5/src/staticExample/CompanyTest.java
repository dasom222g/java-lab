package staticExample;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println("company1: "+ company1 + " company2: " + company2);
		
		// java에서 제공하는 calendar클래스도 싱글톤 패턴
		Calendar calender = Calendar.getInstance();
		System.out.println(calender);
	}

}
