package week.two;

import java.util.Stack;

public class MinStack {

    Stack<Integer> min;
    Stack<Integer> stack;

    public MinStack() {
        min = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        
        if(!min.isEmpty()){
            if(min.peek()<x)
                min.push(min.peek());
            else
                min.push(x);
        }
    }

    public void pop() {
        if(!min.empty())
            min.pop();
            stack.pop();
    }

    public int top() {
       return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args){
        int[] vals = new int[]{1,2,1,2,3,0};
        MinStack stack = new MinStack();
        for(int i : vals){
            stack.push(i);
            System.out.println("Min after " + stack.top() + " added is " + stack.getMin());
        }
    }
}
