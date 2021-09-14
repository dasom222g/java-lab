package exception.custom;

public class IDFormatException extends Exception {
	
	private static final long serialVersionUID = 1L;

	IDFormatException(String errorMessage) {
		super(errorMessage);
	}
}
