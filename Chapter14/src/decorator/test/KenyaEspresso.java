package decorator.test;

// ���Ŭ����
public class KenyaEspresso extends Coffee {
	
	@Override
	protected void brewing() {
		System.out.print("KenyaEspresso ");
	}

}
