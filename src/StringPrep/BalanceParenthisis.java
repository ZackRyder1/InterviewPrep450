package StringPrep;

import java.util.Stack;

public class BalanceParenthisis {

    public static void main(String[] args) {
        String a = "{{}}{{{{";
        int result = findReversal(a);
        System.out.println("Number of reversals required to balance the parenthesis is "+result);

    }

    private static int findReversal(String a) {

        Stack<Character> stack = new Stack<>();

        for(int i =0;i<a.length();i++)
        {
            char charValue = a.charAt(i);
            if(charValue == '}' && !stack.empty())
            {
                if(stack.peek() == '{')
                    stack.pop();
                else
                    stack.push(charValue);
            }
            else
                stack.push(charValue);
        }

        int lenUnbalanced = stack.size();

        int m=0,n=0;

        while(!stack.empty())
        {
            char charValue = stack.pop();
            if(charValue == '{')
                m++;
            else
                n++;
        }

        return m/2 + n/2;

    }
}
