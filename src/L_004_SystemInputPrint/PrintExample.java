package L_004_SystemInputPrint;

public class PrintExample {

	public static void main(String[] args) {
		int firstValue = 2127;
		float secondValue = 12345678.14159265358979f;
		System.out.printf("출력내용:%d\n", firstValue);
		System.out.printf("출력내용:%5d\n", firstValue);
		System.out.printf("출력내용:%-5d\n", firstValue);
		System.out.printf("출력내용:%05d\n", firstValue);
		
		System.out.printf("출력내용:%5.5f\n", secondValue);
		System.out.printf("출력내용:%012.5f\n", secondValue);
	}

}
