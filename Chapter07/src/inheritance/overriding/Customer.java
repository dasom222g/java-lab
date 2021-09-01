package inheritance.overriding;

public class Customer {
	private static int serialNumber;
	
	private int customerId;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//생성자
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
		return customerName + "님의 등급은 " + customerGrade + "이며 적립된 보너스 포인트는" + bonusPoint + "점 입니다"; 
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
