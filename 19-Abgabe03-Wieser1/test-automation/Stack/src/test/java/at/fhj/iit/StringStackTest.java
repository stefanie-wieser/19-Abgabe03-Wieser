package at.fhj.iit;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception
    {
        s = new StringStack(5); // keep size of 5 !!
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
        assertTrue(s.isEmpty());
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception
    {
        s.push("1");
        assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
        s.push("t1");
        assertFalse(s.isEmpty());
        s.push("t2");
        assertFalse(s.isEmpty());
        s.push("t3");
        assertFalse(s.isEmpty());

        s.pop();
        assertFalse(s.isEmpty());
        s.pop();
        assertFalse(s.isEmpty());
        s.pop();
        assertTrue(s.isEmpty());

        s.isEmpty();
        assertTrue(s.isEmpty());
    }


    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */
    @Test
    public void testStackWithDifferentPushPop() throws Exception
    {
        s.push("t");
        s.push("e");
        s.pop();
        s.push("s");
        s.pop();
        s.push("t");
        s.push("!");
        s.pop();

        assertFalse(s.isEmpty());
    }

}
