package trickyProblems;

public class OccurancesOfLetters {

	public static void main(String[] args) {
		
		String input = "Meenakshi Lakshman" ;
		OccuranceCount(input,'M');
		OccuranceCount(input,'L');

	}
	
	
	public static void OccuranceCount (String input, char ch)
	{
		//counting occurrence of character with loop
        int charCount = 0;
        for(int i =0 ; i<input.length(); i++){
            if(input.charAt(i) == ch){
                charCount++;
            }
        }
        System.out.println("count of character" +ch+ "on String: "  +input+  "  " + charCount);

	}

}
