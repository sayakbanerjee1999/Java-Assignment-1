package firstClass;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check Leap Year
		
		int year = 2016;
		
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.print(year + " is a leap year");
		else
			System.out.print(year + " is not a leap year");
	}
}
