package Validators;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllValidators {

//	public static boolean validateEmail(String inputStr) {
//		  if(inputStr==null || inputStr=="") {
//			  return false;
//		  }
//			 String emailRegex= "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
//				        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
//			 Pattern emailPat=Pattern.compile(emailRegex);
//			 Matcher matcher=emailPat.matcher(inputStr);
//			
//			  
//			  return matcher.find();
//			  
//			  
//		 }
	 
	 private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
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
	    public static boolean isValidCityName(String fullName) {
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


