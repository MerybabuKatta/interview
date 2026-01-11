
import java.util.*;


public class AnagramCheck {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = str1.length() == str2.length() &&
                Arrays.equals(
                str1.chars().sorted().toArray(),
                str2.chars().sorted().toArray()
        );

        System.out.println(result);


//        if (isAngaram(str1, str2)) {
//            System.out.println("Is a Anagram");
//        }else {
//            System.out.println(" Is Not A Angram");
//        }
//    }
//
//    public static boolean isAngaram(String s1, String s2) {
//        if (s1.length() != s2.length()) {
//
//            return false;
//        }
//
//        char[] a1 = s1.toCharArray();
//        char[] a2 = s2.toCharArray();
//
//        Arrays.sort(a1);
//        Arrays.sort(a2);
//
//        return Arrays.equals(a1, a2);

    }
}
