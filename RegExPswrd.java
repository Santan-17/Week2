package programs;

public class RegExPswrd {
	public static boolean checkPasswordValidity(String password) {
		String regex="^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[!@#$%&*_])"+"(?=.*\\S+$).{8,20}$";
		if(password.matches(regex))
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String password = "P@$sW0rd";
		 System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));

	}

}
