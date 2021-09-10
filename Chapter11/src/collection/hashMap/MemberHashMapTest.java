package collection.hashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(90, "Park");
		Member memberPark2 = new Member(90, "Park2");
		
		MemberHashMap manager = new MemberHashMap();
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showMembers();
	}

}
