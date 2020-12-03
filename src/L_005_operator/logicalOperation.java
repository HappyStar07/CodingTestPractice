package L_005_operator;

public class logicalOperation {

	public static void main(String[] args) {
		int charCode = 'A'; //65
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자군요");
		}
		
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자군요");
		}
		
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9숫자이군요");
		}
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의배수이군요");
		}
		
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요");
		}
		
		if((value==6) ^ (charCode==67)){
			System.out.println("value의 값은 맞지만 charCode의 코드는 틀렸습니다.");
		}
	}

}
