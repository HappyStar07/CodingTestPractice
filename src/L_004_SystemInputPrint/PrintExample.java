package L_004_SystemInputPrint;

public class PrintExample {

	public static void main(String[] args) {
		int firstValue = 2127;
		float secondValue = 12345678.14159265358979f;
		System.out.printf("��³���:%d\n", firstValue);
		System.out.printf("��³���:%5d\n", firstValue);
		System.out.printf("��³���:%-5d\n", firstValue);
		System.out.printf("��³���:%05d\n", firstValue);
		
		System.out.printf("��³���:%5.5f\n", secondValue);
		System.out.printf("��³���:%012.5f\n", secondValue);
	}

}
