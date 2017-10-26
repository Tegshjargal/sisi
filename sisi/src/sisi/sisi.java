package sisi;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 
 * sisi ID checker
 * @author Tegshee
 *
 */
public class sisi {
	/**
	 * main function
	 * 
	 * @param args
	 * 
	 *  Console input string array 
	 */
	public static void main( String[] args)
	{
		String number = "[0-9]{2}[bdm][1-2]((sas)|(seas)|(sob)|(law))[0-9]{4}"; 
		Scanner in = new Scanner(System.in);
		
		System.out.println("Сиси ID-г оруул : ");
		String ID = in.nextLine();
		
		ID = ID.toLowerCase();
		if(ID.matches(number))
		{
			System.out.println("Зөв байна.");
		}
		else{
			System.out.println("Буруу байна.");
		}
	
	}
}
