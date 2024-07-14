package week04;

public class test {

	public static void main(String[] args) {
		String word1 = "Yess!";
		System.out.println(concatenateWord(word1));
	}
		public static String concatenateWord(String word) {
			
			String word1 = "Yess!";
			int number = 2;
			for (int i = 0; i < number; i++) {
				word1 += number;
			}
			System.out.println(concatenateWord(word1));
			 
			return word1;
			
		
	}

}
