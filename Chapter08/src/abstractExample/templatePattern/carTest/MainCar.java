package abstractExample.templatePattern.carTest;

import java.util.ArrayList;

public class MainCar {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
//		Car avante = new CarAvante();
//		Car genesis = new CarGenesis();
//		Car grandeur = new CarGrandeur();
//		Car sonata = new CarSonata();
		
		carList.add(new CarAvante());
		carList.add(new CarGenesis());
		carList.add(new CarGrandeur());
		carList.add(new CarSonata());
		
		for(Car car: carList) {
			car.run();
			System.out.println("==================================");
		}
	}

}
