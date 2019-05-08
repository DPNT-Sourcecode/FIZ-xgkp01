package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	
	public String fizzBuzz(Integer number) {
		
		String result = "";
		
		StringBuffer singleValResult = new StringBuffer();
		StringBuffer deluxeResult = new StringBuffer();
		
		String numVal = number.toString();
		
		boolean isSingleVal = false;
		
		boolean isDeluxe = false;
		
		
		boolean containsThree = containsThreeOrFive(numVal, '3');
		boolean containsFive = containsThreeOrFive(numVal, '5');
		
		
		//Deluxe logic to check if the number is greater than 10 and all have identical values
		
		if (number > 10 && isIdentical(numVal)) {
			
			
			if (number % 2 != 0) {
				
				deluxeResult.append(" fake deluxe");
			} 
			else {
				
				deluxeResult.append(" deluxe");
			}
			
			singleValResult = deluxeResult;
			
			isDeluxe = true;
			isSingleVal = true;
		}
		
		
        if ((number % 3 == 0) || (containsThree)) {
    		
        	singleValResult.append("fizz");
        	singleValResult.append(deluxeResult);
        	
    		isSingleVal = true;
    	
        }
        
        else if ((number % 5 == 0) || (containsFive)) {
    		
        	singleValResult.append("buzz");
        	singleValResult.append(deluxeResult);
        	
        	isSingleVal = true;
    	
        }
        
        result = getDlxFizzBuzzResult(number, deluxeResult, isDeluxe, containsThree, containsFive);
        
        //To return the number itself
        if (!isSingleVal) {
			
			result = number.toString();
		}
       
		return result;
	}
	
	//Method to return the result for deluxe fizz buzz
	private StringBuffer getDlxFizzBuzzResult(Integer number, StringBuffer valResult,
			                                  boolean containsThree, boolean containsFive) {
		
		StringBuffer result = valResult; 
		
		if (number % 3 == 0 && number % 5 == 0) {
	        	
        	result = getResult(valResult);
	    }
	        
        if (number % 3 == 0 && containsFive) {
        	
        	result = getResult(valResult);
        }
        
        	
        if (number % 5 == 0 && containsThree) {
        	
        	result = getResult(valResult);
        }	
        
        
        if (containsThree && containsFive) {
    		
        	result = getResult(valResult);
    		
    	}
	     
        return result;
	        
	}
	
	//Method to return "fizz buzz" or "fizz buzz deluxe"
	private StringBuffer getResult(StringBuffer valResult) {
		
		StringBuffer result = new StringBuffer("fizz buzz");
		
		result.append(valResult);
		
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

