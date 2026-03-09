package StackBasedProblems.Easy;

import java.util.Stack;

public class ValidParanthesis {

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
                continue;
            }

            else if (!stack.isEmpty()) {
                switch (c) {
                    case ')':
                        if (stack.peek() == '(') stack.pop();
                        else return false;
                        break;
                    case ']':
                        if (stack.peek() == '[') stack.pop();
                        else return false;
                        break;
                    case '}':
                        if (stack.peek() == '{') stack.pop();
                        else return false;
                        break;

                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solution("[][]()([{}])"));
        System.out.println(solution("[)]"));
        System.out.println(solution("[][]()([{}]-"));
    }
}
