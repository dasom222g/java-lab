package collection.treeMap;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int id, String name) {
		setMemberId(id);
		setMemberName(name);
	}
	
	@Override
	public String toString() {
		return memberName +  "님의 아이디는 " + memberId + " 입니다";
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
