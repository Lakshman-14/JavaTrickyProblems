package trickyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String arr [] =  {"Android" , "Android", "iOS", "Windows mobile"};
	
		//ArrayList with duplicates String
		 List<String> duplicateList = Arrays.asList(arr);
		 
		System.out.println("size of Arraylist with duplicates: " + duplicateList.size()); //should print 4 
		System.out.println(duplicateList);
		
		
		//Converting ArrayList to HashSet to remove duplicates
		HashSet<String> listToSet = new HashSet<String>(duplicateList);
		System.out.println("size of Hashset without duplicates: " + listToSet.size());
		System.out.println(listToSet);

		
		//Creating Arraylist without duplicate values
		List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);
		listWithoutDuplicates.get(2);
		System.out.println("size of ArrayList without duplicates: " + listWithoutDuplicates.size()); //should print 3 

		System.out.println(listWithoutDuplicates);

	}

}
