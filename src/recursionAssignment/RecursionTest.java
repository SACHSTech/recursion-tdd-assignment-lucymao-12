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
    @Test
    public void Test2(){
        // no seven
        assertEquals(0, Recursion.count7(0));
    }
    @Test
    public void Test3(){
        // all sevens
        assertEquals(3, Recursion.count7(777));
    }
    @Test
    public void Test4(){
        // one seven
        assertEquals(1, Recursion.count7(14217));
    }
    /**
     * Tests for problem set 2
     */
    @Test
    public void Test5(){
        // x at beginning and end
        assertEquals("hixx", Recursion.endX("xhxi"));
    }
    @Test
    public void Test6(){
        // only x
        assertEquals("x", Recursion.endX("x"));
    }
    @Test
    public void Test7(){
        // no x
        assertEquals("fdsdf", Recursion.endX("fdsdf"));
    }
    @Test
    public void Test8(){
        // one x in middle
        assertEquals("fdsdfx", Recursion.endX("fdsdxf"));
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
    @Test
    public void Test10(){
        // no values that match
        int[] intNums = {3, 6, 2};
        assertEquals(false, Recursion.array220(intNums, 0));
    }
    @Test
    public void Test11(){
        // values at the beginning of the array
        int[] intNums = {3, 30, 2};
        assertEquals(true, Recursion.array220(intNums, 0));
    }
    @Test
    public void Test12(){
        // first value seperated from second: should return false
        int[] intNums = {3, 2, 30};
        assertEquals(false, Recursion.array220(intNums, 0));
    }
    @Test
    public void Test13(){
        // longer array
        int[] intNums = {1, 4, 6, 3, 30, 3};
        assertEquals(true, Recursion.array220(intNums, 0));
    }
    @Test
    public void Test14(){
        // only two values
        int[] intNums = {1, 10};
        assertEquals(true, Recursion.array220(intNums, 0));
    }
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
}
