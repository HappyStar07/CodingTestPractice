package L_008_Reference_and_ArrangeMent;
import java.util.Scanner;

public class JustTest {

	public static void main(String[] args) throws Exception{
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		Label : while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택>");
			
			String user_select = scanner.nextLine();
			int save = 0;
			int add_money = 0;
			int out_money = 0;
			switch(user_select) {
				case "1":
					System.out.print("예금액>");
					add_money = Integer.parseInt(scanner.nextLine());
					System.out.println(add_money);
					save += add_money;
					break;
				case "2":
					System.out.print("출금액>");
					out_money = Integer.parseInt(scanner.nextLine());
					System.out.println(out_money);
					save -= out_money;
					break;
				case "3":
					System.out.print("잔고>");
					System.out.println(save);
					break;
				case "4":
					System.out.println("프로그램 종료");
					break Label;
			}
		}
	}
}
