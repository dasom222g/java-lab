package collection.treeMap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(90, "Park");
		Member memberPark2 = new Member(90, "Park2");
		
		MemberTreeMap manager = new MemberTreeMap();
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
//		manager.removeMember(100);
		
		manager.showMember();
	}

}
