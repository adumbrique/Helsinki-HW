import java.util.Scanner;


public class PasswordCheck {

	public static void main(String[] args) {
		Scanner password = new Scanner(System.in);
		while (true) {
		System.out.println("Please enter Password: ");
		String passwordCheck = password.nextLine();
		if (passwordCheck.equals("ducks")) {
			System.out.println("Password accepted.");
			break;
		} else {
			System.out.println("quack");
		}
	}

	}

}
