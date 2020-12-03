package L_007_Loop;

public class forExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		for (int m=0; m<=30; m++) {
			System.out.println(m);
		}
		//1~100까지의 합구하기
		int sum = 0;
		
		for (int j=0; j<=100; j++) {
			sum += j;
		}
		System.out.println(sum);
		
		for(float x=0.1f; x<=1; x+=0.1f) {
			System.out.println(x);
		}
		// 중첩 for문
		for (int m=2; m<9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n));
			}
		}
		//중첩for문 break예제
		Label:for(int a=2;a<=10;++a) {
			for(int b=0;b<=5;b++) {
				System.out.println(a + "*" + b + "=" + a*b);
				if(a>=10) {
					break Label;//중첩 반복문에서 break는 가장 가까운 반복문을 종료시키는데 모든 중첩된 반복문을 종료하려면 바깥 반복문에 Label:을 붙이고
								//break를 입력한 곳 뒤에 Label을 입력하면 된다.
				}
			}
		}
		//continue문 예제
		for(int c=1; c<=10; c++) {
			if(c%2!=0) {
				continue;
			}
			System.out.println(c);
		}
	}
}
