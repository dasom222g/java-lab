package collection.treeSet.comparator;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		Member memberLee= new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark= new Member(300, "Park");
		MemberTreeSet manager = new MemberTreeSet();
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showMember();
	}

}
