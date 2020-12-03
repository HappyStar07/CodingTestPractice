package L_005_operator;

public class increaseDecreaseOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("______________________");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("______________________");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("______________________");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("______________________");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("______________________");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	} 
}
