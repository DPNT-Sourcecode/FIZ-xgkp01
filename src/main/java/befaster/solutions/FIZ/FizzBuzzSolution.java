package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	
    public String fizzBuzz(Integer number) {
        
    	String result = "";
    	
    	if (number % 3 == 0) {
    		
    		result = "fizz";
    		
    	}
    	else if (number % 5 == 0) {
    		
    		result = "buzz";
    		
    	}
    	
    	if ((number % 3 == 0) && (number % 5 == 0)) {
    		
    		result = "fizz buzz";
    		
    	}
    	else {
    		
    		result = number.toString();
    	}
    		
    	return result;
    	
    }

}

