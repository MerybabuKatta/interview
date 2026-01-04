import java.util.Scanner;

public class PrinmeNumber {
    public static void main(String[] args) {
        int num = 10;
        boolean isPrime = true;
        for(int i = 2; i<= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;

            }
        }
            if(isPrime && num > 1){
                System.out.println(num + " is prime number");
            }else{
                System.out.println(num + " not prime number");
            }
        }
    }

