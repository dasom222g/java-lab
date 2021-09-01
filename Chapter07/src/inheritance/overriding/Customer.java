package inheritance.overriding;

public class Customer {
	private static int serialNumber;
	
	private int customerId;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//������
	public Customer(String cusomerName, int bonusPoint) {
		setCustomerName(cusomerName);
		serialNumber = 10000;
		this.customerId = serialNumber++;
		
		this.bonusPoint = bonusPoint;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}
}
