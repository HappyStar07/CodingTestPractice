package L_004_SystemInputPrint;

public class InfinityInputKeyCode {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println(keyCode);
			
			if(keyCode == 113) {
				break;
			}
		}
		System.out.println("종료합니다");
	}

}
