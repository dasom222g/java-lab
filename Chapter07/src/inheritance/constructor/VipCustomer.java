package inheritance.constructor;

public class VipCustomer extends Customer {
//	private int agentID;
	double salesRatio;
	
	public VipCustomer(String cusomerName, int bonusPoint) {
		super(cusomerName, bonusPoint); // �Ű����� �ִ� �θ������ ȣ��
		// ���� Ŭ���� �������
		customerGrade = "VIP";
		bonusRatio = 0.05;
		// �ش� Ŭ���� �������
		salesRatio = 0.1;
	}
}
