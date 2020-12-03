package L_008_Reference_and_ArrangeMent;

public class arrayCreateByNewExample {

	public static void main(String[] args) {
		int[] num = new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("num["+i+"]"+"="+num[i]);
		}
		
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		for(int i=0;i<3;i++) {
			System.out.println("num["+i+"]"+"="+num[i]);
		}
		
		double[] num1 = new double[3];
		for(int i=0;i<3;i++) {
			System.out.println("num1["+i+"]"+"="+num[i]);
		}
		
		num1[0] = 0.1;
		num1[1] = 0.2;
		num1[2] = 0.3;
		
		for(int i=0;i<3;i++) {
			System.out.println("num1["+i+"]"+"="+num1[i]);
		}
		
		String[] str = new String[3];
		for(int i=0;i<3;i++) {
			System.out.println("str["+i+"]"+"="+str[i]);
		}
		
		str[0] = "hello";
		str[1] = "world";
		str[2] = "!";
		for(int i=0;i<3;i++) {
			System.out.println("str["+i+"]"+"="+str[i]);
		}
		
		int length1 = num.length;
		System.out.println("num의 길이는 : " + length1);
	}

}
