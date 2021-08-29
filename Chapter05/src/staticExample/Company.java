package staticExample;

public class Company {
	// 유일한 인스턴스
	private static Company instance = new Company();
	
	// 외부에서 인스턴스 생성하지 못하게 private로 막아놓음
	private Company() {}
	
	// 유일한 인스턴스를 제공하는 static메소드 제공
	public static Company getInstance() {
		// if (instance == null) instance = new Company(); // 만에하나 생성 안됐을 경우를 대비
		return instance;
	}
}
