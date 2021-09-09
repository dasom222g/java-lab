package generic;

public class Powder extends MeterialWrap {
	@Override
	public String toString() {
		return "재료는 Powder 입니다.";
	}
	
	@Override
	public void doPrinting() {
		System.out.println("Plastic을 프린트 합니다");
	}
}
