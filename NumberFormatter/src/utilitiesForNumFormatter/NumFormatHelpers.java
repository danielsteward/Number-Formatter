package utilitiesForNumFormatter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class NumFormatHelpers {
	
	/**
	 * Takes out any character that is not a numerical character and returns a String of the remaining characters.
	 * @param input
	 * @return
	 */
	public static String stripNonDigits(String input) {
        String num = new String();//use StringBuilder here?
        String regex = "(\\d+)";//search for digits only.
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {//while there are numbers to find.
            num += matcher.group();
        }
        return num;
    }
	
	/**
	 * Takes a String and t out any character that is not a numerical character and returns a String of the remaining characters for a defined
	 * number of characters.
	 * @param input
	 * @return
	 */
	public static String stripNonDigitsLengthLimit(String input, int lengthOfInput) {
        String num = new String();//use StringBuilder here?
        String regex = "(\\d+)";//search for digits only.
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()&&num.length()<lengthOfInput) {//while there are numbers to find and the number is the defined length digits or less....
            num += matcher.group();
        }
        /*if(num.length() == 12){//if num doesn't include seconds field then add it.
            num = num + "00";
        }*/
        return num;
    }
	
	

}
