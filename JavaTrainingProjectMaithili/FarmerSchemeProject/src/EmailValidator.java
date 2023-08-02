import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

  public static void main(String[] args) {
	
}
  public static boolean validateEmail(String inputStr) {
		 String emailRegex= "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		 Pattern emailPat=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		 Matcher matcher=emailPat.matcher(inputStr);
		
		  
		  return matcher.find();
		  
		  
	 }
 
}