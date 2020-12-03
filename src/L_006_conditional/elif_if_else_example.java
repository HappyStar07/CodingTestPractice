package L_006_conditional;

public class elif_if_else_example {

	public static void main(String[] args) {
		int score = 100;
		
		if(score <= 50)
			System.out.println("안좋은 점수군요...");
		else if(score <= 70)
			System.out.println("평균점수이군요");
		else if(score <= 80)
			System.out.println("잘했습니다!");
		else if(score <= 90)
			System.out.println("와우!");
		else if(score <= 100)
			System.out.println("엄청나네요!최상위권 학생입니다!");
	}
}
