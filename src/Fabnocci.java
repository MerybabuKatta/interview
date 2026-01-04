public class Fabnocci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int num = 10;
        for (int i = 1; i <= num; i++ ){
            System.out.print(a + " ");
            int c = a + b;
            a=b;
            b=c;
        }
    }
}
