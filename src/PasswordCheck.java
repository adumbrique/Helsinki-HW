import java.util.Scanner;


public class PasswordCheck {

	public static void main(String[] args) {
		Scanner password = new Scanner(System.in);
		
		System.out.println("Please enter Password: ");
		String passwordCheck = password.nextLine();
		if (passwordCheck.equals("ducks")) {
			System.out.println("Weener!");
		} else {
			System.out.println("fail");
		}

	}

}
