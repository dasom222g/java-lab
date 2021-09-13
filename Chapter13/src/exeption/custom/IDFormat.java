package exeption.custom;

public class IDFormat {
	private String userId;
	
	IDFormat(String userId) throws IDFormatException {
		if(userId == null) {
			throw new IDFormatException("ID값이 null입니다.");
		} else if(userId.length() < 8 || userId.length() > 20) {
			// id길이는 8~20가능
			throw new IDFormatException("ID값은 8자이상 20자 이하로 작성하세요");
		}
		setUserId(userId);
	}

	// getter, setter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
