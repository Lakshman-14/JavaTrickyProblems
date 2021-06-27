package trickyProblems;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Meen@k$hi";
		reverseString(str);
		reverseStringWithoutSpecialChar(str);
		
	}


	public static void reverseString (String str) {

		char letters[] = str.toCharArray();

		char reverse[] = new char[letters.length];

		for(int j=0; j<letters.length; j++) 
		{
			reverse[j] = letters[letters.length-j-1];
		}
		System.out.println(new String(reverse));	
	}


	public static void reverseStringWithoutSpecialChar (String str) {

		char charArray[] = str.toCharArray(); 
		int Start = 0;
		int End = str.length()-1;
		System.out.println("The End value of the String str = " +End);

		while (Start<End)
		{
			if (!Character.isAlphabetic(charArray[End]))
				Start ++;
			else if (!Character.isAlphabetic(charArray[Start]))
				End -- ; 
			else 
			{
				char temp = charArray[Start]; 	
				charArray[Start] = charArray[End];
				charArray[End] =  temp; 
				Start ++; 
				End --;  
			}		
		}
	

		String FinalOutput = new String (charArray); 
		System.out.println(FinalOutput);
	}


}
