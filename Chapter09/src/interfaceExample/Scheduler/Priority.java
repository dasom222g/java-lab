package interfaceExample.Scheduler;

public class Priority implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("������� ���� ���� �����ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("�������õ��� ���� �������� ���� �Ҵ��մϴ�.");
	}
}
