package codechef;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class piglatin {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter a string : ");
			String str = input.readLine().toLowerCase();

			StringTokenizer stringTokenizer = new StringTokenizer(str);

			String output = "";
			piglatin obj = new piglatin();

			while (stringTokenizer.hasMoreTokens()) {
				String temp = stringTokenizer.nextToken();

				if (!(obj.isVowel(temp.charAt(0))) & (obj.isVowel(temp.charAt(1)))) {
					for (int j = 1; j < temp.length(); j++)
						output += temp.charAt(j);
					output += temp.charAt(0) + "ay ";
				} else if (!(obj.isVowel(temp.charAt(0))) & !(obj.isVowel(temp.charAt(1)))) {
					for (int j = 2; j < temp.length(); j++)
						output += temp.charAt(j);
					output += temp.charAt(0) + temp.charAt(1) + "ay ";
				} else if (obj.isVowel(temp.charAt(0))) {
					output += "way ";
				}
			}

			System.out.println("Converted piglatin is : \n" + output);
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}

	public boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		return false;
	}
}
