package befaster.solutions.SUM;

import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    
	private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    //Test to check if the sum of two Integers are equal
    @Test
    public void testSum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }
    
    //Negative Testing to check if the Integers are not equal
    @Test
    public void testNegativeSum() {
       
    	assertNotEquals(sum.compute(1, 2), String.valueOf(2));
    	
    }
    
    //Checking if the values are not null 
    @Test
    public void testSumNull() {
       
    	assertNull(sum.compute(1, null))
    	
    }
    
    
    
}



