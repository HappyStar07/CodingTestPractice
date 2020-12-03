package L_004_SystemInputPrint;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input_data;
		
		while(true) {
			input_data = scanner.nextLine();
			System.out.println("당신은 " + input_data + "을/를 입력하였습니다.");
			
			if(input_data.equals('q')) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
