package abstractExample.templatePattern;

public class CarTest {

	public static void main(String[] args) {
		Car aiCar = new CarAI();
		Car manualCar = new CarManual();
		
		aiCar.run();
		System.out.println("==============");
		manualCar.run();
	}

}
