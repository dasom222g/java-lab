package collection.treeMap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>(new IntegerComparator());
	}
	
	public void addMember(Member member) {
		if(!treeMap.containsKey(member.getMemberId())) treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("잘못된 id값 입니다.");
		return false;
	}
	
	public void showMember() {
		Iterator<Integer> iterator = treeMap.keySet().iterator();
		while(iterator.hasNext()) {
			Member member = treeMap.get(iterator.next());
			System.out.println(member);
		}
	}
}
