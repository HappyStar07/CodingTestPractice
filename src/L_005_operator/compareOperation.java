package L_005_operator;

public class compareOperation {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println((v4 == v5));
		System.out.println((float)v4==v5);
		
		String strVar1 = "Hello!";
		String strVar2 = "Wolrd!";
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar2.equals(strVar1));
	}

}
