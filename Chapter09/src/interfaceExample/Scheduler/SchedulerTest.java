package interfaceExample.Scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		Scheduler scheduler;
		
		System.out.println("R : 순서대로 고객전화를 상담원에게 할당");
		System.out.println("L : 고객전화 대기가 가장적은 상담원에 할당");
		System.out.println("P : 고객등급이 높은 고객의 전화를 먼저 숙련된 상담원에게 할당");
		int input = System.in.read(); // 아스키코드로 리턴
		
		if(input == 'R' || input == 'r') {
			scheduler = new RoundRobin();
		}else if(input == 'L' || input == 'l') {
			scheduler = new LeastJop();
		}else if(input == 'P' || input == 'p') {
			scheduler = new Priority();
		} else {
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		System.out.println("input은 " + input);
	}

}
