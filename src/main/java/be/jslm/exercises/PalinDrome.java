package be.jslm.exercises;

import be.jslm.utils.Utils;

/**
 * This class is an exercise which takes one argument at CLI.  This argument is a string which should be the same when reversed.
 * 
 * example: level reversed = level
 * fault: Jonas reversed = Sanoj
 * 
 * src of the exercise: {@link http://www.programmr.com/challenges/palindrom-string-2}
 * 
 * @version 0.0.1
 * @since 28122016
 * @author JDS
 * 
 * string = reverse string take string a argument from main
 */
public class PalinDrome {

	public void run(String var) {

		System.out.println("Hello user, welcome to the Palindrome program");
		System.out.println("We suppose you started this program with one argument at the CLI, let's check....");
		Utils.pleaseWait2Seconds();
		if (Utils.checkArgument(var)) {
			System.out.println("Sorry, no string was found, please restart the program");
		} else {
			System.out.printf("The string your typed is: %s\n", var);
			reverseString(var);
		}
	}
	
	public char[] reverseCharArray(char[] in){
		
		System.out.format("reverseCharArray input: %s and length %s\n ", in, in.length);		
		char out[] = new char[in.length];  
		int i = 0;
		while (i <= in.length-1) {			
			out[i]=in[in.length-1-i];
			i++;
		}				
		return out; 
	}

	/**
	 * Write a program which takes input as string and check if it is palindrome
	 * or not.If the string and the reverse of string are same then we say
	 * string is palindrome. If string is "level" then the output should be:
	 * palindrome
	 * 
	 * @param var
	 * @return
	 */
	public boolean reverseString(String var) {
		
		System.out.format("reverseString-input: %s\n", var);
		char[] in = var.toCharArray();
		char[] reversed = reverseCharArray(in);
		for (int i = 0; i <= in.length-1; i++) {
			if (in[i] != reversed[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PalinDrome p1 = new PalinDrome();		
		p1.run(args[0]);
	}
}