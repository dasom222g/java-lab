package lamda.variabletype;

@FunctionalInterface
interface PrintString {
	public void showString(String text);
}

public class LamdaTest {
	public static void showMyString (PrintString printFn, String text) {
		printFn.showString(text);
	}
	
	public static PrintString getLamda() {
		return text -> System.out.println(text);
	}
	
	public static void main(String[] args) {
		// ��������
		PrintString lamdaString = text -> System.out.println(text);
		lamdaString.showString("���� ������ ���ٽ�");
		
		// �Ű������� ����
		showMyString(text -> System.out.println(text), "�Ű������� ���ٽ�");
		
		// ��ȯ��
		PrintString getLamda = getLamda();
		getLamda.showString("��ȯ�� ���ٽ�");
		
	}
}
