package L_008_Reference_and_ArrangeMent;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws Exception{
		boolean run =true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ  | 4.�м� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.println("����>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("�л���>");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("Scores["+i+"]");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("Scores["+i+"]>"+scores[i]);
				}
			}else if(selectNo == 4) {
				int max =0;
				int sum =0;
				for(int i=0;i<scores.length;i++) {
					if(scores[i]>max) 
						max = scores[i];
				}
				System.out.println("�ְ����� :"+max);
				for(int j=0;j<scores.length;j++) {
					sum += scores[j];
				}
				System.out.println("������� :"+(double)sum/scores.length);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
