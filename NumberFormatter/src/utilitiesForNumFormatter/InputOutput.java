package utilitiesForNumFormatter;

/**
 * @author User
 *
 */
public class InputOutput {
	
	
	/**
	 * Takes a String, strips any non-digits and returns the resulting String.
	 */
	public static String pureNumber(String inputSt) {
		String outSt = NumFormatHelpers.stripNonDigits(inputSt);
		return outSt;
	}

}
