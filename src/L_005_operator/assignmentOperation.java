package L_005_operator;

public class assignmentOperation {

	public static void main(String[] args) {
		int result = 0;
		int result1 = 10;
		
		result += 10;
		System.out.println("result=" + result);
		result -= 5;
		System.out.println("result=" + result);
		result *= 3;
		System.out.println("result=" + result);
		result /= 5;
		System.out.println("result=" + result);
		result %= 3;
		System.out.println("result=" + result);
		result &= result & result1;
		System.out.println("result=" + result);
		result |= result | result1;
		System.out.println("result=" + result);
		result ^= result ^ result;
		System.out.println("result");
		
		//Three Condition Operation | �������� ������
		
		int score = 90;
		String result2 = (score >= 90) ? "�� ���߾��!" : "�ƽ�����Ф�";
		System.out.println(result2);
	}

}
