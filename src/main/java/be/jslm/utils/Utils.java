package be.jslm.utils;

public class Utils {

	public static void pleaseWait2Seconds() {		
		System.out.println("\\|/"); // TODO: create turning with whileLoop
	}

	public static boolean checkArgument(String var) {
		System.out.printf("checkArgument input: %s\n", var);
		return var == null;
	}

}
