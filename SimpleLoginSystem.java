package september2024;

import java.util.HashMap;

public class SimpleLoginSystem {

	public static void main(String[] args) {

		HashMap<String, String> loginCredentials = new HashMap<String, String>();
		loginCredentials.put("inputUsername", "john123");
		loginCredentials.put("inputPassword", "asdf123");

		String username = "john123";
		String password = "asdf123";

		if (username.equals(loginCredentials.get("inputUsername"))
				&& password.equals(loginCredentials.get("inputPassword"))) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Login failed!");
		}

	}

}
