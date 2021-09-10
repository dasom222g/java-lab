package collection.treeSet.comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	private Iterator<Member> iterator;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		iterator = treeSet.iterator();
		// set�� ������ 1�� �̻��� ���
		while(iterator.hasNext()) {
			Member member = iterator.next();
			if(member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		// set�� ������ 0���� ���
		System.out.println(memberId + "�� ���� ���̵� �Դϴ�.");
		return false;
	}
	
	public void showMember() {
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
