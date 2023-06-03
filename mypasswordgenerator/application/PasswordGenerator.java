package application;

public class PasswordGenerator {
	String password; // will be returned to user

	public PasswordGenerator(String input) {
		String options = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~!@#$%^&*()-=+]}[{;:<,>.?/";
		StringBuilder password = new StringBuilder();
		int length = Integer.parseInt(input);
		
		if (length < 3 || length > 50) {
			length = 3;
		}
		while (password.length() < length) {
			double c = Math.random()*85;
			int b = (int)c; // converts double to int
			password.append(options.charAt(b));
		}
		this.password = password.toString();
	}

	public String getter () {
		return	password;
	}

	
}
