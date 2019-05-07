package befaster.solutions.HLO;


public class HelloSolution {
   
	//This function takes a String[] parameter and returns the friend name passed to the function.
	public String hello(String friendName) {
        
		String greeting = "Hello, ";
	    String friendNameStr = greeting.concat(friendName);
		String concatStr = friendNameStr.concat("!");
				
	    
		return concatStr;
	    
	    
    	
	}
	
	public static void main(String args[])
	{
		String greeting = "Hello, ";
	    String friendNameStr = greeting.concat("John");
		String concatStr = friendNameStr.concat("!");
		System.out.println(concatStr);
		
	}
	
	
	
}
