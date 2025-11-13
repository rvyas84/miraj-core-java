import java.util.Stack;

public class ValidPara {
    public boolean isValidPara(String input) {

        if (input.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack();

        for(char c : input.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidPara para = new ValidPara();
        System.out.println(para.isValidPara("([({})])")); // True
        System.out.println(para.isValidPara("([({})]")); // False
    }
}

