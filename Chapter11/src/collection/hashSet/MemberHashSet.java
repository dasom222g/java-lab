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
		// set�� ������ 1�� �̻��� ���
		while(iterator.hasNext()) {
			Member member = iterator.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		// set�� ������ 0���� ���
		System.out.println(memberId + "�� ���� ���̵� �Դϴ�.");
		return false;
	}
	
	public void showMember() {
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
