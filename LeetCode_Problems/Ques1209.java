import java.util.Stack;
import java.util.stream.Collectors;

class Ques1209 {
  public String removeDuplicates(String s, int k) {
      StringBuilder sb = new StringBuilder();
      Stack<Integer> countStack = new Stack<>();

      for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
          sb.append(c);

          int lastIndex = sb.length() - 1;

          if (lastIndex > 0 && sb.charAt(lastIndex) == sb.charAt(lastIndex - 1)) {
              countStack.push(countStack.pop() + 1);
          } else {
              countStack.push(1);
          }

          if (countStack.peek() == k) {
              sb.delete(sb.length() - k, sb.length());
              countStack.pop();
          }
      }

      return sb.toString();
  }
  public static void main(String[] args) {
      Ques1209 obj = new Ques1209();
      String result = obj.removeDuplicates("deeedbbcccbdaa", 3);
      System.out.println(result); // Output: "aa"
      result = obj.removeDuplicates("pbbcggttciiippooaais", 2);
      System.out.println(result); // Output: "ps"
      result = obj.removeDuplicates("abcd", 2);
      System.out.println(result); // Output: "abcd"
      result = obj.removeDuplicates("deeedbbcccbdaa", 3);
      System.out.println(result); // Output: "aa"
  }
}
