import java.util.Arrays;

public class LengthOfLastWord {

  public static void main(String[] args) {
    System.out.println(lengthOfLastWord("Hello world"));
  }

  public static int lengthOfLastWord(String s) {
    String[] strings = s.trim().split(" ");
    return strings[strings.length - 1].length();
  }
}
