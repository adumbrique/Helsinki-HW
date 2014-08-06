import java.util.Scanner;


public class leapYear {

	public static void main(String[] args) {
		
		Scanner year = new Scanner(System.in);
		//Request year to be checked
		System.out.println("Give me a year: ");
		//year inputted by user is assigned "yearCheck" variable
		int yearCheck = year.nextInt();
		//remainder function is applied to yearCheck and the function is assigned the leapCheck variable.
		int leapCheck = (yearCheck % 4);
		//if function produces a remainder, then the year is NOT a leap year.
		if(leapCheck >= 1){
			System.out.println("nah");
			// no remainder = leap year.
		} else {
			System.out.println("yah");
		}
		
	}

}
