package trickyProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
	
	public static void main(String[] args) {

		printDuplicateCharacters ("ABCCXYZZ is the abbreviation for the test class");
		//printDuplicateCharacters ("S"); 
		//printDuplicateCharacters (""); 

	}

	public static void printDuplicateCharacters (String str) 
	{
		if (str == null) {
			System.out.println("NULL STRING"); 
		}
		
		if (str.isEmpty()) {
			System.out.println("EMPTY STRING");
		}
		
		if (str.length()==1) {
			System.out.println("Single charecter String");
		}
		
		// CONVERTING THE "STRING" into "CHARACTER ARRAY" 
		char words[] = str.toCharArray();
		//System.out.println(words); 
		
		// creating HASHMAP Object
		Map<Character,Integer>  charMap = new HashMap<Character,Integer>();
		
		// Perform FOREACH loop 
		for (Character ch : words) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
				
			} else {
				charMap.put(ch, 1);
			}
			
		}
		
	 Set<Map.Entry<Character,Integer>> entryset = charMap.entrySet();
		
		for(Map.Entry<Character,Integer> entry : entryset) {
			if (entry.getValue()>1) {
				System.out.println("Letter  " + entry.getKey() + "  :" +  "   duplicated   "  + entry.getValue() + "  times" );
			}
		}
			
			
	}
	

}
