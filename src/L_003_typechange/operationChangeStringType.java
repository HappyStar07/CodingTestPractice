package L_003_typechange;

public class operationChangeStringType {

	public static void main(String[] args) {
		int firstValue = 10;
		int secondValue = 20;
		char thirdValue = '3';
		int result = firstValue + secondValue + thirdValue;
		System.out.println(result);
		
		int fourthValue = 50;
		String fifthValue = "5";
		String result1 = fourthValue + fifthValue;
		System.out.println(result1);
		
		int sixthValue = 10;
		int seventhValue = 3;
		String eightValue = "53";
		String result2 = (sixthValue + seventhValue) + eightValue;
		System.out.println(result2);
	}

}
