import java.util.Scanner;

//import static java.lang.System.*; 

public class Ageapp {

	public static void main(String[] args) {

		Scanner name = new Scanner(System.in);
		Scanner age = new Scanner(System.in);
		Scanner name2 = new Scanner(System.in);
		Scanner age2 = new Scanner(System.in);
		Scanner total = new Scanner(System.in);
		int value;
		int value2;

		System.out.println("What is your name?:  ");
		name.nextLine();

		System.out.println("How old are you?: ");
		value = age.nextInt();

		System.out.println("What's your homies' name?:  ");
		name.nextLine();

		System.out.println("How old's your homie?: ");
		value2 = age.nextInt();

		System.out
				.println("You and your homie's ages are: " + (value + value2));

	}
}
