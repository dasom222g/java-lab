package inheritance.test;

public class Customer {
	private static int serialNumber = 10000;
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer(String customerName) {
		init(customerName);
	}
	
	private void init(String customerName) {
		customerID = ++serialNumber;
		setCustomerName(customerName);
		setGrade();
	}
	
	protected void setGrade() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	protected String getInfo() {
		return customerName + " " + customerID + " ���� ����� " + customerGrade + "�̸� ���ʽ�����Ʈ�� " + bonusPoint + "�� �Դϴ�.";
	}
	
	public int pay(int price) {
		bonusPoint = (int)(price * bonusRatio);
		return price;
	}
	
	// getter, setter
	private void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getName() {
		return customerName;
	}
	
	public String getGrade() {
		return customerGrade;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
}
