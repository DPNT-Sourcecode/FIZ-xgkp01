package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	
	/*
	  - A number is "fizz" if it is divisible by 3 or if it has a 3 in it
	  - A number is "buzz" if it is divisible by 5 or if it has a 5 in it
	  - A number can be both "fizz" and "buzz" at the same time. If this happens then write "fizz buzz"
	  */
	
	public String fizzBuzz(Integer number) {
		
		String result = "";
		
		String numVal = number.toString();
		
		
		boolean containsThree = containsThreeOrFive(numVal, '3');
		boolean containsFive = containsThreeOrFive(numVal, '5');
		
		
        if ((number % 3 == 0) || (containsThree)) {
    		
    		result = "fizz";
    	
        }
        
        else if ((number % 5 == 0) || (containsFive)) {
    		
    		result = "buzz";
    	
        }
        
        if ((number % 3 == 0 && number % 5 == 0) ||
        	 (containsThree && containsFive)) {
    		
    		result = "fizz buzz";
    		
    	}
		
		
		return result;
		
		
	}
	
	//Method to check if the string value contains the number 3 or 5
	private boolean containsThreeOrFive(String numVal, char chDigit) {
		
		boolean containsVal = false;
		
		for (int i = 0; i < numVal.length(); i++) {
			
			char ch = numVal.charAt(i);
			
			if (ch == chDigit) {
				
				containsVal= true;
				break;
			}
			
		}
		
		return containsVal;
	}
	
	
	
	
	/*
	 public String fizzBuzz(Integer number) {
    	
    	String result = "";
    	boolean divThreeorFive = false;
    	
    	if (number % 3 == 0) {
    		
    		result = "fizz";
    		divThreeorFive = true;
    		
    	}
    	else if (number % 5 == 0) {
    		
    		result = "buzz";
    		divThreeorFive = true;
    		
    	}
    	
    	if ((number % 3 == 0) && (number % 5 == 0)) {
    		
    		result = "fizz buzz";
    		
    	}
    	else {
    		
    		if (!divThreeorFive) {
    			
    			result = number.toString();
    		}
    		
    	}
    		
    	return result;
    	
    }
    */

}

