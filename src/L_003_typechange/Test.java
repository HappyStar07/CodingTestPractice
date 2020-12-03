package L_003_typechange;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("약수의 개수를 구할 숫자를 입력하세요");
		int input_Number = Integer.parseInt(scanner.nextLine());
		int result = 0;
		
		for(int i=0; i>=input_Number; i++) {
			if(input_Number%i==0) {
				result +=1;
			}
		}
		System.out.println(input_Number + "의 약수의 개수는" + result + "입니다.");
	}
}
