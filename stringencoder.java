import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class stringencoder {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string to be encoded : ");
			String s = input.readLine();
			String enc = StringChallenge(s);
			System.out.println("Encoded string is " + enc);
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}
	
	public static String StringChallenge(String str) {
		String encStr = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < str.length(); i++) {
			if (alphabet.contains("" + str.charAt(i)))
				encStr += alphabet.indexOf(str.charAt(i)) + 1;
			else
				encStr += str.charAt(i);
		}
		return encStr;
	}
}

