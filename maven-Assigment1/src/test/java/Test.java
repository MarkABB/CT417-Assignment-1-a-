import java.util.*;
import static org.junit.Assert.assertEquals;

public class Test {
	 


		public void testToUsername(String expectedUsername1 , String Mark1 )
	    {
	        Student Mark = new Student("MarkBurnell", 22, 14, 7, 1998); 
	      
	       
	        assertEquals("MarkBurnell22", Mark.getUsername());
	    }
}

		
             


		