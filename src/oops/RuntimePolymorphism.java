package oops;

class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        Animal obj = new Dog();
        obj.sound();
    }

}
