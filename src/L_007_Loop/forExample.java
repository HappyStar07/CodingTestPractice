package L_007_Loop;

public class forExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		for (int m=0; m<=30; m++) {
			System.out.println(m);
		}
		//1~100������ �ձ��ϱ�
		int sum = 0;
		
		for (int j=0; j<=100; j++) {
			sum += j;
		}
		System.out.println(sum);
		
		for(float x=0.1f; x<=1; x+=0.1f) {
			System.out.println(x);
		}
		// ��ø for��
		for (int m=2; m<9; m++) {
			System.out.println("***" + m + "�� ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n));
			}
		}
		//��øfor�� break����
		Label:for(int a=2;a<=10;++a) {
			for(int b=0;b<=5;b++) {
				System.out.println(a + "*" + b + "=" + a*b);
				if(a>=10) {
					break Label;//��ø �ݺ������� break�� ���� ����� �ݺ����� �����Ű�µ� ��� ��ø�� �ݺ����� �����Ϸ��� �ٱ� �ݺ����� Label:�� ���̰�
								//break�� �Է��� �� �ڿ� Label�� �Է��ϸ� �ȴ�.
				}
			}
		}
		//continue�� ����
		for(int c=1; c<=10; c++) {
			if(c%2!=0) {
				continue;
			}
			System.out.println(c);
		}
	}
}
