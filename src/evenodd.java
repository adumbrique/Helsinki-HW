import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		//scanner object created and assigned "number"
		Scanner number = new Scanner(System.in);
		//scanner object created and assigned "reader"
		Scanner reader = new Scanner(System.in);
		
	//while (true) {
		System.out.println("Give me a number: ");
		int value = number.nextInt();
		int evenCheck = (value % 2);

		if (evenCheck >= 1) {
			System.out.println("That number is odd.");
		} else {
			System.out.println("That number is even.");
		}
		
		//System.out.println("again?");
		//String command = reader.nextLine();
		//if (command.equals("no")){
			//break;
		//} else if (command.equals("yes")){
			
		//}
		
		}

		

		
		

	}


