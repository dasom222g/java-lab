package generic;

public class PrintMeterialTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		PrintMeterial<Powder> printPowder = new PrintMeterial<Powder>(powder);
		PrintMeterial<Plastic> printPlastic = new PrintMeterial<Plastic>(plastic);

		System.out.println(printPowder);
		System.out.println(printPlastic);
		
//		Water water = new Water();
//		PrintMeterial<Water> printWater = new PrintMeterial<Water>(water); // ¿¡·¯
//		System.out.println(printWater);
	}

}
