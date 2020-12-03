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
		System.out.println("총합 : " + sum);
		double avg = (double) (sum / scores.length);
		System.out.println("평균점수 : "+ avg);
		
		//scores변수에 새로운 배열 만들기
		scores = new int[] {100, 87, 97, 88};
		System.out.println("scores변수에 담긴 새로운 값들 : " + scores);
	}

}
