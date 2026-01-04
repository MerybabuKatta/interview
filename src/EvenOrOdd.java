import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int number = sc.nextInt();
        int number = 10;
        if(number % 2 == 0){
            System.out.println(number + " is a Even number");
        }else {
            System.out.println(number + " Is Odd number");
        }
    }
}
