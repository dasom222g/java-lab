package exeption.autoclose;

public class AutoCloseTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AutoCloseObject autoClose = new AutoCloseObject();
		try(autoClose) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e);
		} 
	}

}
