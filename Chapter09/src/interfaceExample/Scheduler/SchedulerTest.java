package interfaceExample.Scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		Scheduler scheduler;
		
		System.out.println("R : ������� ����ȭ�� �������� �Ҵ�");
		System.out.println("L : ����ȭ ��Ⱑ �������� ������ �Ҵ�");
		System.out.println("P : ������� ���� ���� ��ȭ�� ���� ���õ� �������� �Ҵ�");
		int input = System.in.read(); // �ƽ�Ű�ڵ�� ����
		
		if(input == 'R' || input == 'r') {
			scheduler = new RoundRobin();
		}else if(input == 'L' || input == 'l') {
			scheduler = new LeastJop();
		}else if(input == 'P' || input == 'p') {
			scheduler = new Priority();
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		System.out.println("input�� " + input);
	}

}
