package Validators;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validators {
	
    private static final String EMAIL_PATTERN = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	//private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String FULLNAME_PATTERN = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
    private static final String CONTACT_NUMBER_PATTERN = "^[0-9]{10}$";
    private static final String PIN_CODE_PATTERN = "^[0-9]{6}$";
    private static final String ACCOUNT_NUMBER_PATTERN = "^[0-9]{9,18}$";
    private static final String IFSC_CODE_PATTERN = "^[A-Za-z]{4}0[A-Z0-9]{6}$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidFullName(String fullName) {
        Pattern pattern = Pattern.compile(FULLNAME_PATTERN);
        Matcher matcher = pattern.matcher(fullName);
        return matcher.matches();
    }

    public static boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean isValidContactNumber(String contactNumber) {
        Pattern pattern = Pattern.compile(CONTACT_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(contactNumber);
        return matcher.matches();
    }

    public static boolean isValidPinCode(String pinCode) {
        Pattern pattern = Pattern.compile(PIN_CODE_PATTERN);
        Matcher matcher = pattern.matcher(pinCode);
        return matcher.matches();
    }

    public static boolean isValidAccountNumber(String accountNumber) {
        Pattern pattern = Pattern.compile(ACCOUNT_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(accountNumber);
        return matcher.matches();
    }

    public static boolean isValidIFSCCode(String ifscCode) {
        Pattern pattern = Pattern.compile(IFSC_CODE_PATTERN);
        Matcher matcher = pattern.matcher(ifscCode);
        return matcher.matches();
    }

    public static boolean doPasswordsMatch(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
}





/*
 * 
 * 
 * HOW To Use These Validation  
 * 
 * 
 * public class Main {
    public static void main(String[] args) {
        String email = "test@example.com";
        String fullName = "John Doe";
        String password = "SecurePass@123";
        String contactNumber = "1234567890";
        String address = "123 Main St";
        String city = "New York";
        String state = "NY";
        String pinCode = "123456";
        String accountNumber = "123456789";
        String ifscCode = "ABCD0123456";
        String confirmPassword = "SecurePass@123";

        if (Validators.isValidEmail(email)) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email.");
        }

        if (Validators.isValidFullName(fullName)) {
            System.out.println("Valid full name.");
        } else {
            System.out.println("Invalid full name.");
        }

        if (Validators.isValidPassword(password)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }

        if (Validators.isValidContactNumber(contactNumber)) {
            System.out.println("Valid contact number.");
        } else {
            System.out.println("Invalid contact number.");
        }

        if (Validators.isValidPinCode(pinCode)) {
            System.out.println("Valid pin code.");
        } else {
            System.out.println("Invalid pin code.");
        }

        if (Validators.isValidAccountNumber(accountNumber)) {
            System.out.println("Valid account number.");
        } else {
            System.out.println("Invalid account number.");
        }

        if (Validators.isValidIFSCCode(ifscCode)) {
            System.out.println("Valid IFSC code.");
        } else {
            System.out.println("Invalid IFSC code.");
        }

        if (Validators.doPasswordsMatch(password, confirmPassword)) {
            System.out.println("Passwords match.");
        } else {
            System.out.println("Passwords do not match.");
        }
    }
}
*/
