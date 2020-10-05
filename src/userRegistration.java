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

		// UC3
		System.out.println("Enter valid e-mail ID");
		String email = input.next();
		System.out.println(Pattern.matches("^[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+$", email));

		// UC4
		System.out.println("Enter valid Phone number");
		String phone = input.next();
		System.out.println(Pattern.matches("(0|91)?[7-9][0-9]{9}", phone));

	}

}
