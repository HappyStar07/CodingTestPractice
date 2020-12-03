package L_008_Reference_and_ArrangeMent;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		
		if(str1 == str2) {//"=="연산자는 두 변수가 참조하는 번지를 비교하기 때문에 잘 사용하지 않는다.
			System.out.println("str1과 str2는 참조가 같다.");
		}else {
			System.out.println("str1과 str2는 참조가 같지않다.");
		}
		
		if(str1.equals(str2)) { //equals은 문자열의 값을 비교 할때 쓰는 메서드 이다. 메서드란?클래스의 내부에 있는 함수
			System.out.println("str1과 str2는 문자열의 값이 같음");
		}
		
		String str3 = new String("안녕하세요");
		String str4 = new String("안녕하세요");
		
		if(str3==str4) {
			System.out.println("str3와 str4가 참조가 같다.");//자바는 메모리 영역을 3가지로 나누는데 스택(stack),힙(heap),메소드영역(method area)
			//가 있다. 메소드 영역은 코드에서 사용되는 클래스들을 로더로 읽어 클래스별로 상수와 메소드 코드, 생성자들을 분류해서 저장한다.
			//스택은 메소드를 호출할때 마다 프레임을 추가 하고 메소드가 종료되면 해당 프레임을 제거 하는 동작을 수행한다. 쉽게 말해 변수들을 담는 큰 그릇에 변수명과 그 값이
			//저장되는 곳이다.이곳에서 참조변수는 힙(heap)영역의 객체를 참조한다.힙 영역은 객체와 배열이 생성되는 영역이다. 여기서 생성된 객체와 배열은 스택영역의 변수나
			//다른 객체의 필드에서 참조한다.변수나 필드가 없으면 의미없는 객체가 되기 때문에 JVM이 이것을 쓰레기로 취급하고 쓰레기 수집기를 실행시켜 자동으로 제거 합니다.
		}else {
			System.out.println("str3와 str4는 참조가 같지않다.");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3와 str4의 문자열의 값이 같음.");
		}
	}

}
