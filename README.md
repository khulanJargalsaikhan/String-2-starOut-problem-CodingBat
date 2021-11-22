# String-2-starOut-problem-CodingBat

Return a version of the given string, where for every star (*) in the string 
the star and the chars immediately to its left and right are gone. 
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

	starOut("ab*cd") -- "ad"
  
	starOut("ab**cd") -- "ad"
  
	starOut("sm*eilly") -- "silly"
  
# String-2 XyBalance problem - CodingBat  
  
  We'll say that a String is xy-balanced if for all the 'x' 
  chars in the string, there exists a 'y' char somewhere 
	later in the string. So "xxy" is balanced, but "xyx" is not. 
	One 'y' can balance multiple 'x's. 
	Return true if the given string is xy-balanced.

	xyBalance("aaxbby") - true
  
	xyBalance("aaxbb") - false
	
  xyBalance("yaaxbb") - false
  
  
