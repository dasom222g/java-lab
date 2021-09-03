package interfaceExample.Scheduler;

public class Priority implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 상담전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무숙련도가 높은 상담원에게 먼저 할당합니다.");
	}
}
