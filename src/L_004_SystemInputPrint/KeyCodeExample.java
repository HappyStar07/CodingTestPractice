package L_004_SystemInputPrint;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("KeyCode:" + keyCode);
		
		keyCode = System.in.read();
		System.out.println("KeyCode:" + keyCode);
		
		keyCode = System.in.read();
		System.out.println("KeyCode:" + keyCode);
	}

}