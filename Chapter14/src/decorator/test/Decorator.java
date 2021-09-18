package decorator.test;

// 보조 클래스의 최상위 클래스
// 이 클래스는 생성되지 않고 하위클래스의 정의를 위한것이므로 abstract 키워드로 생성을 금지함
public abstract class Decorator extends Coffee {
	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		// 기반 클래스 받아옴
		this.coffee = coffee;
	}

	@Override
	protected void brewing() {
		this.coffee.brewing();
	}

}
