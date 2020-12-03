package L_003_typechange;

public class floatToInt {

	public static void main(String[] args) {
		float firstFloat = 1.1f;
		float secondFloat = 2.2f;
		int firstInt = 10;
		int secondInt = (int) firstFloat; 
		double firstDouble = secondFloat;
		
		System.out.println("Result is : " + secondInt);
		System.out.println("Result is : " + firstDouble);
	}

}
