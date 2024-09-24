package Source;

import java.util.Stack;

public class MinStack {


    private Stack<Integer> stack;
    public MinStack()
    {
        stack = new Stack<>();
    }

    public int size()
    {
        return stack.size();
    }
    private int min = stack.pop();
    public void push(int val)
    {
        stack.push(val);
        if(val< min)
        {
            min = val;
        }

    }
    public int getMin()
    {
        return min;
    }
    public int  pop()
    {
        return stack.pop();
    }


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(3);
        System.out.println(minStack.getMin());
    }

}