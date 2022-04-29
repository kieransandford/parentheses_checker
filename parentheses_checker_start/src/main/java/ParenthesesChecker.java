import java.util.Stack;

public class ParenthesesChecker {

//    public boolean checkParentheses(String testString) {

//        if (testString.isEmpty()) {
//            return true;
//        } else {
//            Stack<Character> stack = new Stack<>();
//
//            for (int i = 0; i < testString.length(); i++) {
//                char stringChar = testString.charAt(i);
//                if (stringChar == '(') {
//                    stack.push(stringChar);
//                } else {
//                        if (stack.isEmpty()) {
//                            return false;
//                        }
//                        char checkChar = stack.peek();
//                        if (stringChar == ')' && checkChar != '(') {
//                            return false;
//                        } else {
//                            stack.pop();
//                        }
//
//                    }
//                    }
//                    return true;
//                }
//


    public boolean checkParentheses(String testString) {
        Stack<Character> stack = new Stack<>();
        for(int i =0; i < testString.length(); i++){
            Character currentChar = testString.charAt(i);
            if (currentChar == '(') {
                stack.push(currentChar);
            } else if(!stack.isEmpty()){
                if (currentChar == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    }

