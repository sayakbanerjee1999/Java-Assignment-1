package firstClass;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 Operators
		
		int n = 10;
		// Shift
		System.out.println(n >> 1);				// Signed Right Shift by 1
		System.out.println(n << 1);				// Signed Left Shift by 1
		System.out.println(n >>> 1);			// Unsigned Shift
		
		int a = 1;
		int b = 2;
		int c = 8;
		// Bitwise Operators;
		System.out.println(a | b);				// Bitwise OR
		System.out.println(a & b);				// Bitwise AND
		System.out.println(a ^ b);				// Bitwise XOR
		System.out.println(~c);					// Bitwise Compliment
		
		// Relational Operators;
		int d = 10;
		int e = 11;
		int f = 10;
		System.out.println(d==f);
		System.out.println(d!=e);
		System.out.println(d>e);
		System.out.println(d>=f);
	}
}
