import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static boolean isValidPassword(String password)
	{
		String regex =  "^(?=.*[0-9])"+"(?=.*[A-Z])"+"(?=.*[a-z])"+"(?=.*[!@#$%^&*()-+=])"+"(?=\\s+$).{4,20}$";
		
		//compile the regex pattern
		
		Pattern p = Pattern.compile(regex);
		
		//if password is empty
		if(password == null)
			return false;
		
		//Pattern class contains matcher() method. Used to find the matching between the given password and the regular expression.
		
		Matcher m = p.matcher(password);
		
		return m.matches();
	}
	
	//Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		
		System.out.println(isValidPassword(password));
	}
}



//atleast contain 8 char and at most 20 char
//one digit
//one Uppercase
//one lower case
//one special char !@#$%&*()-+=^
//should not contain space

//regex -> "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()-+=])(?=\\s+$).{8,20}$"
