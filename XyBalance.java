package string_practice;

public class XyBalance {
	/*
	 * We'll say that a String is xy-balanced if for all the 'x' 
	 * chars in the string, there exists a 'y' char somewhere 
	 * later in the string. So "xxy" is balanced, but "xyx" is not. 
	 * One 'y' can balance multiple 'x's. 
	 * Return true if the given string is xy-balanced.


	xyBalance("aaxbby") - true
	xyBalance("aaxbb") - false
	xyBalance("yaaxbb") - false
	 */

	//	public static boolean xyBalance(String str) {
	//
	//		if(str.length() < 1 || !str.contains("x"))
	//			return true;
	//
	//		for(int i=str.length()-1; i>=0; i--){
	//			if(str.charAt(i) != 'x' && str.charAt(i) == 'y')
	//				return true;
	//			else if(str.charAt(i) == 'x')
	//				return false;
	//		}
	//
	//		return false;
	//	}




	public static boolean xyBalance(String str) {

		Boolean x = false;
		Boolean y = false;

		int len = str.length();

		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'x' && y == true){
				x = true;
				y = false;
			} else if (str.charAt(i) == 'x') {
				x = true;
			}

			if (str.charAt(i) == 'y' && x == true)
				y = true;
		}

		if (x == false)
			y = true;
		return y;
	}


	public static void main(String[] args) {
		System.out.println(xyBalance("aaxbby"));
		System.out.println(xyBalance("aaxbb"));
		System.out.println(xyBalance("yaaxbb"));

		System.out.println(xyBalance("bxyb"));



	}

}
