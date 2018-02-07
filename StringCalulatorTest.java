import org.junit.Test;

public class StringCalulatorTest {

	@test 
	 public final void whenMoreThan2() {
       
		
		StringCalculator.add("1,2,3");
    }
    @Test
    public final void when2NumbersGood() {
        
    	
    	StringCalculator.add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void whenNonNumber() {
        
    	
    	
    	
    	StringCalculator.add("1,X");
    }
	
}
