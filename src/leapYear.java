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
		//remainder function dividing by 100 is applied to yearCheck and the function is assigned the leapCheck2 variable.
		int leapCheck2 = (yearCheck % 100);
		//remainder function dividing by 400 is applied to yearCheck and the function is assigned the leapCheck3 variable.
		int leapCheck3 = (yearCheck % 400);
		//if any of the leapCheck functions produces a remainder, then the year is NOT a leap year.
		if(leapCheck >= 1){
			System.out.println("Not a leap year.");
		} else if(leapCheck2 >=1) {
			System.out.println("Failed the 100. Still not a leap year.");
		} else if(leapCheck3 >=1) {
			System.out.println("Failed the 400. Also not a leap year.");
		} else {
			System.out.println("Yahtzee!");
		}
		
	}

}
