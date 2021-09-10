package collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	private Iterator<Member> iterator;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		iterator = hashSet.iterator();
		// set의 갯수가 1개 이상일 경우
		while(iterator.hasNext()) {
			Member member = iterator.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		// set의 갯수가 0개일 경우
		System.out.println(memberId + "는 없는 아이디값 입니다.");
		return false;
	}
	
	public void showMember() {
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
