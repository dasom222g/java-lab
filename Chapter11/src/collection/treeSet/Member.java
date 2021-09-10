package collection.treeSet;

public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	public Member(int id, String name) {
		setMemberId(id);
		setMemberName(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return this.memberId == member.memberId;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId*1000;
	}
	
	@Override
	public String toString() {
		return memberName + "남의 아이디는 " + memberId + "입니다.";
	}
	
	@Override
	public int compareTo(Member member) {
		// 양수를 리턴하면 오름차순, 음수를 리턴하면 내림차순
		// return (this.memberId - member.memberId) * -1; // 숫자로 정렬
		return this.memberName.compareTo(member.memberName) * -1; // 이름으로 정렬
	}
	
	// getter, setter
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}
