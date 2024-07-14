package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String? String cannot be changed
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i ++) {
			sb.append(i);
			if(i != 9) {
				sb.append("-");
			} 				
			}
		System.out.println(sb.toString());
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> strings = new ArrayList<String>();
		strings.add("Hello"); 
		strings.add("Lisa"); 
		strings.add("vacation"); 
		strings.add("i"); 
		strings.add("homework time"); 
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println("--- 2 ---" + findShortestString(strings));
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		List<String> swapped = swapFirstAndLast(strings);
		for (String str : swapped) {
			System.out.println(str);
		}
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println(newListSameStrings(swapped)); 
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		System.out.println("--- 6 ---");
		List<String> searchResults = search(strings, "a");
		for (String result : searchResults) {
			System.out.println(result);
			System.out.println();
		}
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 7, 8, 9, 10, 12, 15, 20, 29, 30, 33, 35, 37);
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		for (List<Integer> list : sortedNumbers) {
			for (Integer number :list) {
				System.out.println(number);
			}
			System.out.println("Next list -----");
		}
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		List<Integer> stringsLengths = calculateLengthOfString(strings);
		for (Integer list : stringsLengths) {
			System.out.println(list);			
		}
		// 9. Create a set of strings and add 5 values
		Set<String> set= new HashSet<String>();
		set.add("yesterday");
		set.add("Today");
		set.add("Tommorrow");
		set.add("Here");
		set.add("Now");
		
		// *10. Write and test a method that a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		Set<String> startsWithH = findAllThatStartWith(set, 'H');
		for(String word : startsWithH) {
			System.out.println(word);
		}		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		List<String> resultList = convertSetToList(set);
		
		for (String listString : resultList) {
			System.out.println(listString);
		}
		// 12. Write and test a method that takes a set of integers and returns a new set of integers 
		//		containing only even numbers from the original set
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(22);
		integerSet.add(44);
		integerSet.add(65);
		integerSet.add(109);
		integerSet.add(174);
		integerSet.add(13);
		
		Set<Integer> extractedNumbers = extractEven(integerSet);
		for (Integer number : extractedNumbers) {
			System.out.println(number);
		}
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Apple", "Fruit of apple tree");
		dictionary.put("Banana", "Fruit of banana tree");
		dictionary.put("Java", "A programing language created in 1995");
				
		// 14. Write and test a method that takes a Map<String, String> and a string and returns the value 
		// 		for a key in the map that matches the string parameter (i.e. like a language dictionary lookup)
		String value = lookupValue(dictionary, "Apple");
		System.out.println(value);
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		Map<Character, Integer> counts = countStartingLetters(resultList);
		for (Character character : counts.keySet()) {
			System.out.println(character + " - " + counts.get(character));
					
		}
		
	}
	// Method 15:
	public static Map<Character, Integer> countStartingLetters(List<String> list) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		for (String string : list) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c, 1);
			} else {
				results.put(c, results.get(c) + 1);
			}
		}
		
		return results;
	}
	
	
	// Method 14:
	public static String lookupValue(Map<String, String> map, String string) {
		for (String key : map.keySet() ) {
			if (key.equals(string)) {
				return map.get(key);
			}
		}
		return " ";
	}
	
	
	// Method 12:
	public static Set<Integer> extractEven(Set<Integer> set) {
		Set<Integer> result = new HashSet<Integer>();
		for (Integer number : set) {
			if (number % 2 == 0) {
				result.add(number);				
			}			
		}
		return result;
	}
	
	// Method 11:
	public static List<String> convertSetToList(Set<String> set) {
		List<String> results = new ArrayList<String>();
		
		for (String string: set) {
			results.add(string);
		}
		
		return results;
	}
	
	// Method 10:
	public static Set<String> findAllThatStartWith(Set<String> set, char c) {
		Set<String> results = new HashSet<String>();
		for (String string : set) {
			if (string.charAt(0) == c) {
				results.add(string);
			}
		}
		
		return results;
	}
	
	
	// Method 8:8. Write and test a method that takes a list of strings 
	//			and returns a list of integers that contains the length of each string
	public static List<Integer> calculateLengthOfString(List<String> list) {
		List<Integer> lengths = new ArrayList<Integer>();
		for (String string : list) {
			lengths.add(string.length());			
		}		
		return lengths;		
	}
	// Method 7:
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer number : list) {
			if (number % 2 == 0) {
				results.get(0).add(number) ;
			} 
			if (number % 3 == 0) {
				results.get(1).add(number) ;
			} 
			if (number % 5 == 0) {
				results.get(2).add(number) ;
			} 
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 ) {
				results.get(3).add(number) ;				
			}			
		}
		return results;
		
	}
	
	// Method 6:
	public static List<String> search(List<String> list, String query) {
		List<String> results = new ArrayList<String>();
		for (String word : list) {
			if (word.contains(query)) {
				results.add(word);
			}
		}
		return results;
	}
	// Method 5:
	public static String newListSameStrings(List<String> list) {
		StringBuilder result = new StringBuilder();
		for (String string : list) {
			result.append(string + ", ");
			
		}
		return result.toString();
	}
	
	
	
	// Method 4
	public static List<String> swapFirstAndLast(List<String> list){
		String position1 = list.get(0);
		list.set(0, list.get(list.size() -1 ));
		list.set(list.size()-1, position1) ;
		return list;
		
	}
	
	// Method 3:
	public static String findShortestString(List<String>list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
			
		}
		return shortest;
	}
	
	
}
