import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Main {

/*  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

  An input string is valid if:

  Open brackets must be closed by the same type of brackets.
  Open brackets must be closed in the correct order.
  */

  public static void main(String[] args) {
    System.out.println(isValid("(){}"));
  }

  public static boolean isValid(String s) {
    List<Character> order = new LinkedList<>();
    for (char c : s.toCharArray()) {
      if (c =='(' |
          c =='[' |
          c =='{') {
        order.add(c);
      } else {
        if (order.size() == 0) {
          return false;
        }
        for (int j = order.size(); j > 0; j--) {
          if (c ==')' & order.get(j - 1) == '(') {
            break;
          }
          if (c ==']' & order.get(j - 1) == '[') {
            break;
          }
          if (c =='}' & order.get(j - 1) == '{') {
            break;
          }
          return false;
        }
        order.remove(order.size() - 1);
      }
    }
    return order.size() == 0;
  }

}



