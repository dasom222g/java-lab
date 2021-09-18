package decorator.test;

// 기반클래스
public class KenyaEspresso extends Coffee {
	
	@Override
	protected void brewing() {
		System.out.print("KenyaEspresso ");
	}

}
