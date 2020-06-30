package Leetcode.topic.stack;

import java.util.Stack;

public class LC946_ValidateStackSequences {
    public static void main(String[] args) {
        /*
        Given two sequences pushed and popped with distinct values,
        return true if and only if this could have been the result of a
        sequence of push and pop operations on an initially empty stack.

        Example 1:

        Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
        Output: true
        Explanation: We might do the following sequence:
        push(1), push(2), push(3), push(4), pop() -> 4,
        push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
        Example 2:

        Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
        Output: false
        Explanation: 1 cannot be popped before 2.


        */
        System.out.println(new LC946_ValidateStackSequences().validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1}));
    }
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i =0;

        for(int num : pushed){
            stack.push(num);

            while((!stack.isEmpty()) && (stack.peek() == popped[i])){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty() && (i == pushed.length);
    }
}
