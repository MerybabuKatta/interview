import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        // revmove duplicates from array
        //int[] arr = {1,2,3,4,3,2,1};
       // Arrays.stream(arr).distinct().forEach(System.out::println);

        //Revmove duplicates from List
        //Arrays.asList(1,3,4,2,4,1).stream().sorted().distinct().forEach(System.out::println);

        // Remove duplicates from String

//        String s = "banana";
//        String result = s.chars().distinct().mapToObj(c -> String.valueOf((char) c).col(Collectors.joining()));


        // count corrence

//        String str = "Programming";
//        Set<String> unique1 = new HashSet<>();

         //Map<Character, Long> chars = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        str.chars().mapToObj(c -> (char) c).filter(n -> unique1.add(n)).forEach();
//        //System.out.println(chars);
//
//        int[] arr = {1,2,3,3,4,1,4,2,5,6};
//        Set<Integer> unique = new HashSet<>();
//
//        Arrays.stream(arr).filter(n -> !unique.add(n)).forEach(System.out::println);


        int[] arr = {1,2,3,3,4,1,4,2,5,6};
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        System.out.print(set);


        String str = "programming";
        Set<Character> set1 = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++){
          set1.add(str.charAt(i));
        }
        System.out.print(set1);


        int[] arr2 = {1,2,3,3,4,1,4,2,5,6};
        Map<Integer, Integer  > map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        System.out.print(map.keySet());

        String str1 = "programming";
        Map<String, Integer> mapa = new HashMap<>();
        for (int i = 0; i < str1.length(); i++){
            mapa.put(str1, mapa.getOrDefault(str1, 0) + 1);
        }
        System.out.print(mapa.keySet());
    }
}
