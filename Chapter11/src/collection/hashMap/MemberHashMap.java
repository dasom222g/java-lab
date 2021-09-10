package collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	// key값은 memberId이고 value값은 member 인스턴스인 hashMap 구현
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		if(!hashMap.containsKey(member.getMemberId())) hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("잘못된 id값입니다.");
		return false;
	}
	
	public void showMembers() {
//		Iterator<Member> memberIterator = hashMap.values().iterator();
//		while(memberIterator.hasNext()) {
//			System.out.println(memberIterator.next());
//		}
		Iterator<Integer> keyIterator = hashMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			int key = keyIterator.next();
			Member member = hashMap.get(key);
			System.out.println(member.toString());
		}
		System.out.println();
	}
	
}
