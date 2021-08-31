package inheritance;

public class Customer {
	private int customerId;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//������
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("�θ�Ŭ����(Customer) ����");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸� ������ ���ʽ� ����Ʈ��" + bonusPoint + "�� �Դϴ�"; 
	}
	
	// getter, setter
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}
}
