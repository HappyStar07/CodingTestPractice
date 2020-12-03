package L_006_conditional;

public class randomDice {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		
		if(num==1)
			System.out.println("1이 출력되었습니다.");
		else if(num==2)
			System.out.println("2가 출력되었습니다.");
		else if(num==3)
			System.out.println("3이 출력되었습니다.");
		else if(num==4)
			System.out.println("4가 출력되었습니다.");
		else if(num==5)
			System.out.println("5가 출력되었습니다.");
		else if(num==6)
			System.out.println("6이 출력되었습니다.");
	}

}
