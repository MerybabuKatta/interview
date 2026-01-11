package java8;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        // count occruence of each charecter in string
        //String str = "MerybabuKatta";
       // Map<Character, Long> result = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       // result.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.print(entry.getKey() + " = " + entry.getValue()));


        // find duplicate characters in string

//        String str2 = "programming";
//        str2.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);

        //count occurence of each element in an array
       // int[] arr = {1,2,2,3,1,4,5,6,4,7,4};

       // Map<Integer, Long> res = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       // res.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.print(entry.getKey() + " = " + entry.getValue()));



        //Remove duplicates from list
//        List<Integer> list = Arrays.asList(1,2,3,1,3,4,3,2,5,4);
//        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);


        // reverse string without reverse()
//        String str3 = "banana";
//        String rev = "";
//        for (int i = str3.length() - 1; i >= 0; i--){
//            rev += str3.charAt(i);
//        }
//        System.out.println(rev);

        // find even and odd numbers
//        List<Integer> list = Arrays.asList(1,2,3,4,10,7,8);
//        Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
//
//        System.out.println(result);

        //Find Largest & Smallest Number

//        List<Integer> list = Arrays.asList(11,17,26,20,30);
//
//        int largest = list.stream().max(Integer::compare).get();
//        int smallest = list.stream().min(Integer::compare).get();
//
//        System.out.println("Smallest Number is :" +smallest);
//        System.out.println("Largest Number is :" +largest);

//        //Check Palindrome String
//            String str4 = "madam";
//            String palindrome = new StringBuilder(str4).reverse().toString();
//
//        System.out.println(palindrome.equals(str4));

        //First Non-Repeated Character
//        String str5 = "swiss";
//        Character result = str5.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
//        System.out.println(result);

//        //Sort List Using Java 8
//        List<Integer> list = Arrays.asList(4,2,3,7,4,2,8,1,3,9);
//        list.stream().distinct().sorted().forEach(System.out::println);


        //Sum Using reduce()
//        List<Integer> list = Arrays.asList(1,2,3,4);
//        int sum = list.stream().reduce(0, Integer::sum);
//        System.out.println(sum);

        //Second Highest Number
//        List<Integer> list = Arrays.asList(10,20,30,40);
//        int result = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(result);

        //Numbers Greater Than Given Value
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
//        list.stream().filter(n -> n > 2).forEach(System.out::println);

        //Count Frequency of Elements

//        List<Integer> list = Arrays.asList(1,2,2,3,3,3);
//
//        Map<Integer, Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(result);


//        // Convert strig to uppercase
//        List<String> list = Arrays.asList("java","spring");
//        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

