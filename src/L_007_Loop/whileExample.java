package L_007_Loop;

public class whileExample {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.println(sum);
		//do while�� ����
		int j = 0;
		do {
			System.out.println(j);
			j++;
		}while(j<=10);
		
		int m = 0;
		
		while(true) {
			System.out.println(m);
			m++;
			if(m == 20) {
				System.out.println("20�̶�� ���ڸ� ã�ұ� ������ while���� �����մϴ�.");
				break;
			}
		}
				
		while(true) {
			int randomData = (int) (Math.random() * 6) + 1;
			System.out.println(randomData);
			if(randomData == 2) {
				break;
			}
		}
		System.out.println("while���� �����մϴ�.");
	}

}
