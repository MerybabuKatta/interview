package oops;

class Marks{
    private int marks; // cannot access directly

    public void setMarks(int m){
        if(m >= 0){
            marks = m;
        }
    }

    public int getMarks(){
        return marks;
    }
}

public class Ecaptulation {
    public static void main(String[] args) {
        Marks m = new Marks();
        m.setMarks(85);
        System.out.println("Marks is:" +m.getMarks());
    }


}
