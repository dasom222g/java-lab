package inheritance.polymorphism;

public class VipCustomer extends Customer {
	private double salesRatio;
	
	public VipCustomer(String cusomerName, int bonusPoint) {
		super(cusomerName, bonusPoint); // �Ű����� �ִ� �θ������ ȣ��
		// ���� Ŭ���� �������
		customerGrade = "VIP";
		bonusRatio = 0.05;
		// �ش� Ŭ���� �������
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		return price - (int)(price * salesRatio);
	}
}
