import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (isAnagram(s1, s2)) {
            System.out.println("Angram");
        } else {
            System.out.println("Not a Anagram");
        }
    }

      public static boolean isAnagram(String s1, String s2){
          if (s1.length() != s2.length()){
              return false;
          }
           char[] a1 = s1.toCharArray();
           char[] a2 = s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            return Arrays.equals(a1, a2);
        }
    }

