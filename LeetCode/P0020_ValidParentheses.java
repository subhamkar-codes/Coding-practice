
import java.util.Scanner;
import java.util.Stack;

class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (st.isEmpty()) {
                    valid = false;
                    break;
                }
                else if (s.charAt(i) == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
                else if (s.charAt(i) == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
                else if (s.charAt(i) == ']') {
                    if (st.peek() == '[') {
                        st.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
            }
        }

        if (!st.isEmpty()) {
            valid = false;
        }

        return valid;
    }
}

public class P0020_ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();

        String s = sc.nextLine();
        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (st.isEmpty()) {
                    valid = false;
                    break;
                }
                else if (s.charAt(i) == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
                else if (s.charAt(i) == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
                else if (s.charAt(i) == ']') {
                    if (st.peek() == '[') {
                        st.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
            }
        }

        if (!st.isEmpty()) {
            valid = false;
        }

        System.out.println(valid ? "VALID" : "INVALID");

        Solution20 sol = new Solution20();
      boolean result =  sol.isValid(s);
        System.out.println(result);

    }
}
