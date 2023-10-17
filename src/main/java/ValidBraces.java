import java.util.Arrays;
import java.util.Stack;

public class ValidBraces {
    public static void main(String[] args) {
        System.out.println(isValid("[({})](]"));
    }

    public static boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        for (char brace : braces.toCharArray()) {
            System.out.println(brace + "***");
            if (brace == '(' || brace == '{' || brace == '[') {
                stack.push(brace);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                System.out.println(stack + "stack");

                char top = stack.pop();
                System.out.println(top + "top");

                if (brace == ')' && top != '(') {
                    return false;
                } else if (brace == '}' && top != '{') {
                    return false;
                } else if (brace == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
