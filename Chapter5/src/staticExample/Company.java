package staticExample;

public class Company {
	// ������ �ν��Ͻ�
	private static Company instance = new Company();
	
	// �ܺο��� �ν��Ͻ� �������� ���ϰ� private�� ���Ƴ���
	private Company() {}
	
	// ������ �ν��Ͻ��� �����ϴ� static�޼ҵ� ����
	public static Company getInstance() {
		// if (instance == null) instance = new Company(); // �����ϳ� ���� �ȵ��� ��츦 ���
		return instance;
	}
}
