package week04;

import java.util.Arrays;

public class CodingProject {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 		 		//1. Created an array of int called ages with the values listed. 
			System.out.println((ages[ages.length-1]) -ages[0]);	// 	a. Subtract the last element from the first element.
			System.out.println("----");				// I've added this to separate my answers
			
		int[] ages2 = {3, 4, 7, 11, 18, 29, 47, 76, 50};		//	b. Created a second array called ages2.
			System.out.println(ages2.length);					//		i. verified there are nine elements
			System.out.println((ages2[ages2.length-1]) -ages2[0]);	// 	ii. Subtract the last element from the first element.
			System.out.println("----");
			
		int[] numbers = {12};									
			System.out.println((numbers[numbers.length-1]) -numbers[0]);	//iii. Works with an array of any length.
			System.out.println("----");
		
		int sum = 0;					//	c. Use a loop to iterate through the array and calculate the average age. 
		for (int i = 0 ; i < ages.length; i++){	
			sum += ages[i];
		}
			System.out.println("The average age is " + (sum / ages.length));		//Print the result to the console.
	//------------		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};	//2. Created string array with names listed.
		int[] results = new int[names.length];
		int avg = 1;
		for (int i = 0; i <names.length; i++) {		//Loop to calculate the number of letters per name
			results[i] = names[i].length(); 
		//	System.out.println(results[i]);  checking the to see if the code above works
				avg += results[i];
		}
		System.out.println("The average number of letters per name is " + (avg / names.length));	//Print the average number letters per name
			
		for (int i = 0; i < 1; i++) {		// b.	use a loop to go through an array and concatenate the names
			String delimiter = " "; 		// 		together, separated by a space.
			String nam = String.join(delimiter, names);
			System.out.println(nam); 
			}
	// 	3. How do you access the last element of any array?
			// arrayName[arrayName.length - 1] - Use the array name and for the position, use the length and subtract 1.  

	//	4. How do you access the first element of any array?
			// arrayName[0] - Use the array name and position 0 
	//----------	

		int[] nameLengths = new int[names.length];	//	5. Created a new array of int called nameLengths. 
			 
		for (int i = 0; i < names.length; i++) {	// Loop to iterate over the names array
			nameLengths[i] = names[i].length();		// add the length of each name to the namesLength array
		//	cnt += nameLengths[i]; 
		}
		System.out.println(Arrays.toString(nameLengths));
		
		int add = 0;
		for (int i = 0; i < names.length; i++) {	// 6. Loop to iterate over the names array
			nameLengths[i] = names[i].length();		// add the length of each name to the namesLength array
			add += nameLengths[i]; 					// adds the lengths of the names together
		}
		System.out.println(add);	
	
		// 7. This will print Hello four times
		System.out.println(concatenateWords("Hello, ", 4));
			
	}
	// Method 7.
	public static String concatenateWords(String word, int n) {
				
		String result = " ";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	// Method 8. This will return a first name and a last name separated by a space.
	public static String createFullName( String firstName, String lastName) {
		return firstName + " " + firstName;
		
	}
	// Method 9.
	public static boolean verifySum(boolean TF, double[] num) {
		double sum = 0;
		for (double number: num) {
			sum += number;
			if (sum < 100) {
			}
		} return true;
		
	}
	// Method 10. 
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum /numbers.length;
		
	}
	// Method 11.
	public static boolean compareNumbers(double[] firstSet, double[]secondSet) {
		double sum1 = 0;
		double sum2 = 0;
		for (double first : firstSet) {
			sum1 += first;
		}
		for (double second :secondSet) {
			sum2 += second;
		}
		if ((sum1 / firstSet.length) > (sum2 / secondSet.length)) {
			
		}		
		return true;
	}
	// Method 12. 
	public static boolean willBuyDrink(boolean isHot, double money) {
		boolean isHotOutside = true;
		double moneyInPocket = 21.50;
		if ((isHotOutside = true) && (moneyInPocket > 10.50)) {
	}
		return true;
}
	// Method 13. ??
}
