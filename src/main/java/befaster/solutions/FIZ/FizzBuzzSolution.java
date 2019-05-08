package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	
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

}
