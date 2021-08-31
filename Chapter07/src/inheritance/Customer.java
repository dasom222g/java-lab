package inheritance;

public class Customer {
	private int customerId;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//생성자
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("부모클래스(Customer) 생성");
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
