package generic;

public class Plastic extends MeterialWrap {
	@Override
	public String toString() {
		return "재료는 Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic을 프린트 합니다");
	}
}
