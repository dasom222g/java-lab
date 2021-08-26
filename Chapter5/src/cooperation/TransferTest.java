package cooperation;

public class TransferTest {

	public static void main(String[] args) {
		Student studentLee = new Student("Lee", 5000);
		Student studentKim = new Student("Kim", 10000);
		Student studentE = new Student("Edward", 50000);
		
		Bus bus2015 = new Bus(2015);
		Bus bus7011 = new Bus(7011);
		Subway greenlineSubway = new Subway(2);
		Subway purplelineSubway = new Subway(5);
		Taxi taxi7777 = new Taxi(7777);
		
		studentLee.takeBus(bus2015); //Lee가 버스를 탔다 를 표현
		studentKim.takeSubway(purplelineSubway); //Kim이 지하철을 탔다 를 표현
		studentKim.takeSubway(greenlineSubway);
		studentKim.takeBus(bus2015);
		studentE.takeTaxi(taxi7777, 27000);
		
		studentLee.showInfo();
		studentKim.showInfo();
		studentE.showInfo();
		
		bus2015.showInfo();
		bus7011.showInfo();
		greenlineSubway.showInfo();
		purplelineSubway.showInfo();
		taxi7777.showInfo();
	}

}
