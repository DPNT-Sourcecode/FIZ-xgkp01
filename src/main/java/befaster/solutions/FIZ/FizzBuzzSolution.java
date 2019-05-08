package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	
	public String fizzBuzz(Integer number) {
		
		String result = "";
		
		String numVal = number.toString();
		
		boolean isSingleVal = false;
		
		boolean isDeluxe = false;
		
		
		boolean containsThree = containsThreeOrFive(numVal, '3');
		boolean containsFive = containsThreeOrFive(numVal, '5');
		
		
		//Deluxe logic to check if the number is greater than 10 and all have identical values
		if (number > 10 && isIdentical(numVal)) {
			
			isDeluxe = true;
			isSingleVal = true;
		}
		
		
		
        if ((number % 3 == 0) || (containsThree)) {
    		
    		result = "fizz";
    		isSingleVal = true;
    	
        }
        
        else if ((number % 5 == 0) || (containsFive)) {
    		
    		result = "buzz";
    		isSingleVal = true;
    	
        }
        
        result = getDlxFizzBuzzResult(number, isDeluxe, containsThree, containsFive);
        
        //To return the number itself
        if (!isSingleVal) {
			
			result = number.toString();
		}
       
		return result;
	}
	
	//Method to return the result for deluxe fizz buzz
	private String getDlxFizzBuzzResult(Integer number, boolean isDeluxe, 
			                            boolean containsThree, boolean containsFive) {
		
		String result = ""; 
		
		if (number % 3 == 0 && number % 5 == 0) {
	        	
        	result = getResult(isDeluxe);
	    }
	        
        if (number % 3 == 0 && containsFive) {
        	
        	result = getResult(isDeluxe);
        }
        
        	
        if (number % 5 == 0 && containsThree) {
        	
        	result = getResult(isDeluxe);
        }	
        
        
        if (containsThree && containsFive) {
    		
        	result = getResult(isDeluxe);
    		
    	}
	     
        return result;
	        
	}
	
	//Method to return "fizz buzz" or "fizz buzz deluxe"
	private String getResult(boolean isDeluxe) {
		
		String result = "";
		
		if (isDeluxe) {
			
			result = "fizz buzz deluxe";
		} 
		else {
			
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
