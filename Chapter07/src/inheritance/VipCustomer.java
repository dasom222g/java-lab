package inheritance;

public class VipCustomer extends Customer {
//	private int agentID;
	double salesRatio;
	
	public VipCustomer() {
		System.out.println("����Ŭ����(VipCustomer) ����");
		// ���� Ŭ���� �������
		customerGrade = "VIP";
		bonusRatio = 0.05;
		// �ش� Ŭ���� �������
		salesRatio = 0.1;
	}
}
