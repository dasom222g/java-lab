package exeption.custom;

public class IDFormat {
	private String userId;
	
	IDFormat(String userId) throws IDFormatException {
		if(userId == null) {
			throw new IDFormatException("ID���� null�Դϴ�.");
		} else if(userId.length() < 8 || userId.length() > 20) {
			// id���̴� 8~20����
			throw new IDFormatException("ID���� 8���̻� 20�� ���Ϸ� �ۼ��ϼ���");
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
