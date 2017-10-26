package sisi;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * Register number checker
 * @author Tegshee
 *
 */
public class Regex {
	public static String token( String iler){
		
		String regex = "(\\d+/\\d+)";
		String iler2 = "";
		iler = iler.replaceAll(regex,"-");
		for(int i = 0; i < iler.length(); i++)
		{
			if(iler.charAt(i) == '*'){
				iler2 += "OP_MUL ";
			}
			if(iler.charAt(i) == '-'){
				iler2 += "NUM ";
			}
			if(iler.charAt(i) == '/'){
				iler2 += "OP_DIV ";
			}
			if(iler.charAt(i) == '+'){
				iler2 += "OP_ADD ";
			}
		}
		return iler2;
	}
	public static void cal(String str){
		String[]nums = str.split("[+*]");
		int[] a = new int[100];
		int[] b = new int[100];
		
		String regex = "(\\d+/\\d+)";
		str = str.replaceAll(regex,"-");
		
		int i = 0;
		for( i = 0; i < nums.length; i++){
			
			String[] num = nums[i].split("[/]");
			
			a[i] = Integer.parseInt(num[0]);  
			b[i] = Integer.parseInt(num[1]); 
			
		}
		
		int l =0;
		for( i = 0; i < str.length(); i++){
			
			if( str.charAt(i) == '*' ){
				a[l + 1] *= a[l];
				b[l + 1] *= b[l];
				b[l] = 0;
				a[l] = 0;
			}
			if( str.charAt(i) == '-'){
				l++;
			}
		}
		
		int k = 0 ,k1 = 0;
		for( i = 0; i < l; i++){
			
			k = k += a[i];
			k1 = k1 += b[i];
		}
		System.out.println(k+"/"+k1);
	}

	public static void main( String[] args)
	{
		String a = "((\\d+/\\d+)[\\*/\\+])*(\\d+/\\d+)";
		String regex = "(([+/,*].*)|(.*[+/,*][+/,*].*)|(.*[+/,*]))";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Регистэрийн дугаарыг оруул : ");
		String ID = in.nextLine();
		
		
		ID = ID.toLowerCase();
		
		if(ID.matches(regex))
		{
			System.out.println("-1");
		}
		else if(ID.matches(a) == false ){
			System.out.println("0");
		}
		else{
			
			System.out.println(token(ID));
			cal(ID);
		}
	}
}
