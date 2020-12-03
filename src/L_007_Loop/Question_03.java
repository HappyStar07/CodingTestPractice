package L_007_Loop;

public class Question_03 {

	public static void main(String[] args) {
		while(true) {
			int dice = (int) (Math.random() * 6) +1;
			int dice1 = (int) (Math.random() *6) +1;
			System.out.println("("+dice+","+dice1+")");
			if(dice+dice1==5){
				break;
			}
		}
	}
}
