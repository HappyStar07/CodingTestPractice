package L_003_typechange;

public class StringToBasicType {

	public static void main(String[] args) {
		String firstValue = "20";
		byte result = Byte.parseByte(firstValue);
		System.out.println(result);
		
		String secondValue = "2.5";
		float result1 = Float.parseFloat(secondValue);
		System.out.println(result1);
		
		String thirdValue = "30";
		short result2 = Short.parseShort(thirdValue);
		System.out.println(result2);
		
		String fourthValue = "40";
		int result3 = Integer.parseInt(fourthValue);
		System.out.println(result3);
		
		String fifthValue = "50.55";
		double result4 = Double.parseDouble(fifthValue);
		System.out.println(result4);
		
		String sixthValue = "false";
		String seventhValue = "true";
		boolean result5 = Boolean.parseBoolean(sixthValue);
		boolean result6 = Boolean.parseBoolean(seventhValue);
		System.out.println(result5);
		System.out.println(result6);
		
		int eightValue = 200;
		//value of는 기본타입(int, byte, char, short, long, float, double, boolean)의 값을 문자열로 변환할때 사용하는 메서드
		String result7 = String.valueOf(eightValue);
		System.out.println(result7);
	}

}
