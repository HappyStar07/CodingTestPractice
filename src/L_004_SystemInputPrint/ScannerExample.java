package L_004_SystemInputPrint;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input_data;
		
		while(true) {
			input_data = scanner.nextLine();
			System.out.println("����� " + input_data + "��/�� �Է��Ͽ����ϴ�.");
			
			if(input_data.equals('q')) {
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
