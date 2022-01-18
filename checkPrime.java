package firstClass;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 37;				// Check Prime
		int flag = 0;
		
		for(int i = 2; i*i <= n; i++) {
			if(n % i == 0) {				// Not a Prime Number
				flag = 1;
				break;
			}
		}
		
		if(flag == 0)
			System.out.println(n + " is a prime number");
		else if(flag == 1)
			System.out.println(n + " is not a prime number");
	}

}
