package L_006_conditional;

public class stringSwitchExample {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
			case "부장":
				System.out.println("월급은 500만원 입니다.");
				break;
			case "과장":
				System.out.println("월급은 300만원 입니다.");
				break;
			default:
				System.out.println("월급은 200만원 입니다.");
		}
	}

}
