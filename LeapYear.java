package september2024;

public class LeapYear {

	
	
	//A year is a leap year if:
	//	It is divisible by 4 and not divisible by 100, or
	//	It is divisible by 400.
		
		
	public static void main(String[] args) {
		int year1 = 2000;
		boolean isLeapYear1 = (year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0);
		System.out.println(isLeapYear1);

		int year2 = 1900;
		boolean isLeapYear2 = (year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0);
		System.out.println(isLeapYear2);
	}

}
