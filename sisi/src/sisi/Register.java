package sisi;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * Register number checker
 * @author Tegshee
 *
 */
public class Register {
	
	
	public static void main( String[] args)
	{
		String regex = "([\\u0410-\\u045f\\u04af\\u0451\\u04e9]{2})[0-9]{2}(0[1-9]|[12][0-9]|3[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{2}";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Регистэрийн дугаарыг оруул : ");
		String ID = in.nextLine();
		
		ID = ID.toLowerCase();
		
		if(ID.matches(regex))
		{
			System.out.println("Зөв байна.");
		}
		else{
			System.out.println("Буруу байна.");
		}
	}
}