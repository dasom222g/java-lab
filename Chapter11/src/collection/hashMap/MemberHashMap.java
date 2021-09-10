package collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	// key���� memberId�̰� value���� member �ν��Ͻ��� hashMap ����
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
		System.out.println("�߸��� id���Դϴ�.");
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
