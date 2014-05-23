package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08extractEmail {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter text with emails:");		
		String text = reader.nextLine();
		
		Pattern emailPatter = Pattern.compile("[a-zA-Z]+[.-_]*[a-zA-Z]+@[a-zA-Z]+[-]*[a-zA-Z]+(\\.[a-zA-Z]{2,10})+");
		Matcher matcher = emailPatter.matcher(text);
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
