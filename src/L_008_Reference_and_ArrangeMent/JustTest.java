package L_008_Reference_and_ArrangeMent;
import java.util.Scanner;

public class JustTest {

	public static void main(String[] args) throws Exception{
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		Label : while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.���� | 2. ��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------------------");
			System.out.println("����>");
			
			String user_select = scanner.nextLine();
			int save = 0;
			int add_money = 0;
			int out_money = 0;
			switch(user_select) {
				case "1":
					System.out.print("���ݾ�>");
					add_money = Integer.parseInt(scanner.nextLine());
					System.out.println(add_money);
					save += add_money;
					break;
				case "2":
					System.out.print("��ݾ�>");
					out_money = Integer.parseInt(scanner.nextLine());
					System.out.println(out_money);
					save -= out_money;
					break;
				case "3":
					System.out.print("�ܰ�>");
					System.out.println(save);
					break;
				case "4":
					System.out.println("���α׷� ����");
					break Label;
			}
		}
	}
}
