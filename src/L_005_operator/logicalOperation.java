package L_005_operator;

public class logicalOperation {

	public static void main(String[] args) {
		int charCode = 'A'; //65
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("�빮�ڱ���");
		}
		
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("�ҹ��ڱ���");
		}
		
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9�����̱���");
		}
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 �Ǵ� 3�ǹ���̱���");
		}
		
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� ����̱���");
		}
		
		if((value==6) ^ (charCode==67)){
			System.out.println("value�� ���� ������ charCode�� �ڵ�� Ʋ�Ƚ��ϴ�.");
		}
	}

}
