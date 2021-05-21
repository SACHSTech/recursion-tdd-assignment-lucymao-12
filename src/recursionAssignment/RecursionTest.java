package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /**
     * Tests for problem set one
     */
    @Test
    public void Test1(){
        // test seven in front and back
        assertEquals(2, Recursion.count7(717));
    }
    /**
     * Tests for problem set 2
     */
    @Test
    public void Test5(){
        // x at beginning and end
        assertEquals("hixx", Recursion.endX("xhxi"));
    }
    /** 
     * Problem set 3 --> array
     */
    @Test
    public void Test9(){
        // the values are at the end of the array
        int[] intNums = {1, 2, 20};
        assertEquals(true, Recursion.array220(intNums, 0));
    }
   
    
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
