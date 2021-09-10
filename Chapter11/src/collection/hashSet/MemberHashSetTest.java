package collection.hashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {
		Member memberLee= new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark= new Member(300, "Park");
		Member memberPark2 = new Member(300, "ppp");
		MemberHashSet manager = new MemberHashSet();
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.removeMember(200);
		
		manager.addMember(memberPark2);
		manager.showMember();
	}

}
