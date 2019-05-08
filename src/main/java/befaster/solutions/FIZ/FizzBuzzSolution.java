package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	
	public String fizzBuzz(Integer number) {
		
		String result = "";
		
		String numVal = number.toString();
		
		boolean isThreeorFive = false;
		
		
		boolean containsThree = containsThreeOrFive(numVal, '3');
		boolean containsFive = containsThreeOrFive(numVal, '5');
		
		
        if ((number % 3 == 0) || (containsThree)) {
    		
    		result = "fizz";
    		isThreeorFive = true;
    	
        }
        
        else if ((number % 5 == 0) || (containsFive)) {
    		
    		result = "buzz";
    		isThreeorFive = true;
    	
        }
        
        
        if (number % 3 == 0 && number % 5 == 0) {
        	
        	result = "fizz buzz";
        }
        
        if (number % 3 == 0 && containsFive) {
        	
        	result = "fizz buzz";
        }
        
        	
        if (number % 5 == 0 && containsThree) {
        	
        	result = "fizz buzz";
        }	
        
        
        if (containsThree && containsFive) {
    		
    		result = "fizz buzz";
    		
    	}
        
        
        if (!isThreeorFive) {
				
			result = number.toString();
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
	
	
	//Method to check if the numbers are identical
	private boolean isIdentical(String numVal) {
		
		boolean isIdentical = false;
		
		char ch = numVal.charAt(0);
		
		for (int j = 1; j < numVal.length(); j++) {
			
			char chr = numVal.charAt(j);
			
			if (ch == chr) {
				
				isIdentical = true;
			} 
			else {
				
				isIdentical = false;
				break;
			}
			
		}
		
		return isIdentical;
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


