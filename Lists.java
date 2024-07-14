package week04;
import java.util.*;

public class Lists {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
		
		System.out.println("Question 3");
		int indexVal = 1;
		List<String> productList = new ArrayList<>(); 
		
		productList.add("Macbook");
		productList.add("HP Notebook");
		productList.add("iPhone 14");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S23");
		
		if (indexVal >= 0 && indexVal < productList.size() ) {
		        System.out.println(productList.get(indexVal));
		    } else {
		        System.out.println("No product can be found with that product number.");
		    }
	}

	
	

	
	}


