public class ReverseString {
    public static void main(String[] args) {
        String str = "Lucky Katta";
//        String rev = "";
//        for (int i = str.length() - 1; i >= 0; i--){
//            rev+= str.charAt(i);
//
//        }
//        System.out.println(rev);

//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        sb.reverse();
//        System.out.println(sb.toString());

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
