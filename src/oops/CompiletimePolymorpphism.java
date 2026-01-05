package oops;

public class CompiletimePolymorpphism {

    void m1(int a, int b){
        System.out.println("M1 is:" +(a + b));
    }

    void m1(int a, int b, int c){
        System.out.println("M1 is :" +(a + b + c));
    }

    // Method with different data types
    void m1(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }
    public static void main(String[] args) {

        CompiletimePolymorpphism compiletimePolymorpphism = new CompiletimePolymorpphism();
        compiletimePolymorpphism.m1(10, 20);
        compiletimePolymorpphism.m1(20, 30, 40);
        compiletimePolymorpphism.m1(10.5, 10.5);

    }
}
