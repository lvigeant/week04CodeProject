package week04;

import java.util.ArrayList;
import java.util.List;

public class practice04 {

	public static void main(String[] args) {
		
		int endNum = 17;
		List<Integer> newList = new ArrayList<Integer>();
		
			for(int i = 1; i<= endNum; i++ ){
		    	newList.add(i); 
			}
		    System.out.println("The first number in the List is " + newList.get(0));
		    System.out.println("The Last number in the List is " + newList.get(newList.size()-1));
	
		  
		    
		   int num1 = 10;
		   int num2 = 10;
		   int num3 = 10;
		      
		    if (0 < num1 && num1 < 9 || 0 < num2 && num2 < 9 || 0 < num3 && num3 < 9) {
		    	System.out.println("Help Me!");
		       
		        
		    } else {
		      System.out.println("Sorry, there was an error getting a number you requested.");
		    }
		
		    List<Character> alphabet = new ArrayList<>();
		    for(int i = 97; i < (97 + 26); i++){
		        alphabet.add((char)i);
		    }

		    alphabet.remove(0);
		    System.out.println(alphabet);	
	}  	

	//public static List<String> halfTheList(List<String> listOfNames) {
	//	List<String> resultList = new ArrayList<>();
	//	listOfNames.add("Lisa");
	//	listOfNames.add("Jill");
	//	listOfNames.add("Mike");
	//	for(int index = 0; index < listOfNames.size(); index ++) {
	//		if(!(index % 2 == 0)) {
	//			resultList.get(listOfNames.add(listOfNames.size()));
	//			return resultList;
	//				}
	//	System.out.println(listOfNames);
	//	}
	//}
		static void halfList(List<String> words) {
			 List<String> newList = new ArrayList<String>();
			    for (int index = 0; index < words.size(); index ++) {
			        if(!(index % 2 == 0)) {
			            newList.get(index);
			            return;
			     }	
			        System.out.println("The old List is: " + words);
					System.out.println("The new List is: " + newList);			    
			    }
		String word1 = "java";
		String word2 = "javascript";
		String word3 = "mySQL";
		String word4 = "lisa";
		String word5 = "amy";
		
		List<String>Words = new ArrayList<>();
		words.add(word1);
		words.add(word2);
		words.add(word3);
		words.add(word4);
		words.add(word5);
		
		halfList(words);
	
	}
}
