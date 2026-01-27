public class ReverseNumber {
    public static void main(String[] args){
        //int num = 123789;
//        int rev = 0;
//        while (num != 0){
//            rev = rev * 10 + num % 10;
//            num /= 10;
//
//        }
//        System.out.println(rev);


//            String str = "madam";
//            String rev = "";
//            for (int i = str.length() - 1; i >= 0; i--){
//                System.out.println(str.charAt(i));
//
//            }

        //reverse array

//        int[] arr = {1,2,3,4,5};
//        for (int i = arr.length - 1; i >= 0; i--){
//            System.out.println(arr[i] + " ");
//        }

        // reverse array using loop

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

