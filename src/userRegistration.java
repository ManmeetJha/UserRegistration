import java.util.Scanner;
import java.util.regex.Pattern;

public class userRegistration {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("User Registration");

		// UC1
		System.out.println("Enter the first name");
		String name = input.next();
		System.out.println(Pattern.matches("^[A-Z](?:[a-zA-Z]+){2}$", name));

		// UC2
		System.out.println("Enter the last name");
		String lname = input.next();
		System.out.println(Pattern.matches("^[A-Z](?:[a-zA-Z]+){2}$", lname));
		input.close();
	}

}
