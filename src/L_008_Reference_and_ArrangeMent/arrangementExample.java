package L_008_Reference_and_ArrangeMent;

public class arrangementExample {

	public static void main(String[] args) {
		int[] scores = {90, 80, 70};
		
		System.out.println("Score[0] : " + scores[0]);
		System.out.println("Score[1] : " + scores[1]);
		System.out.println("Score[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		double avg = (double) (sum / scores.length);
		System.out.println("������� : "+ avg);
		
		//scores������ ���ο� �迭 �����
		scores = new int[] {100, 87, 97, 88};
		System.out.println("scores������ ��� ���ο� ���� : " + scores);
	}

}
