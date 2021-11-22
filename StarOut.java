package string_practice;

public class StarOut {

	public static void main(String[] args) {
		System.out.println(starOut("ab*cd"));
		System.out.println(starOut("ab**cd"));
		System.out.println(starOut("sm*eilly"));

	}

	/*
	 * Return a version of the given string, where for every star (*) in the string 
	 * the star and the chars immediately to its left and right are gone. 
	 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


	starOut("ab*cd") -- "ad"
	starOut("ab**cd") -- "ad"
	starOut("sm*eilly") -- "silly"
	 */

	public static String starOut(String str) {

		String result = "";

		if (str.length() < 2 && !str.equals("*"))
			return str;

		for (int i=0; i < str.length(); i++){


			if ( i == 0 && i < str.length()-1 && str.charAt(i) != '*' && str.charAt(i+1) != '*' )
				result = result + str.charAt(i);

			if (i > 0 && i < str.length()-1 && str.charAt(i-1) != '*' && str.charAt(i) != '*' && str.charAt(i+1) != '*') 
				result = result + str.charAt(i);

			if (i > 0 && i == str.length()-1 && str.charAt(i) != '*' && str.charAt(i-1) != '*') 
				result = result + str.charAt(i);


		}

		return result;

	}



	// different solution
//	public static String starOut(String str) {
//
//		int len = str.length();
//
//		String finalString = "";
//
//		for (int i = 0; i < len; i++) {
//
//			if (i == 0 && str.charAt(i) != '*')
//				finalString += str.charAt(i);
//
//
//			if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
//				finalString += str.charAt(i);
//
//
//			if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
//				finalString = finalString.substring(0,finalString.length()-1);
//
//		}
//
//		return finalString;
//
//	}

}
