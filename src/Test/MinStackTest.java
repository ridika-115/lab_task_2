package Test;

import static org.junit.jupiter.api.Assertions.*;

import Source.MinStack;
import org.junit.jupiter.api.Test;

class MinStackTest {

    @Test
    public void minStackTest()
    {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(3);
        minStack.push(-3);
        minStack.push((-1));
        assertEquals(-3, minStack.getMin());
    }
}