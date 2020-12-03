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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트  | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수>");
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
				System.out.println("최고점수 :"+max);
				for(int j=0;j<scores.length;j++) {
					sum += scores[j];
				}
				System.out.println("평균점수 :"+(double)sum/scores.length);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
