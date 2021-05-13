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
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        assertEquals(2, Recursion.count7(717));
    }
    @Test
    public void Test2(){
        assertEquals(0, Recursion.count7(0));
    }
    @Test
    public void Test3(){
        assertEquals(3, Recursion.count7(777));
    }
    @Test
    public void Test4(){
        assertEquals(1, Recursion.count7(14217));
    }
    // add more tests
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
