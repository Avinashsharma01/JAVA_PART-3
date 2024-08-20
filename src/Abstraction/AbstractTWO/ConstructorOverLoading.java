package Abstraction.AbstractTWO;

public class ConstructorOverLoading {
    ConstructorOverLoading(){
        System.out.println("This is the Default constructor");
    }

    ConstructorOverLoading(String a){
//        this();
        System.out.println(a);
    }

    ConstructorOverLoading(int a){
//        this();
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Call each constructor by creating objects
        new ConstructorOverLoading();
        new ConstructorOverLoading("Avinash");
        new ConstructorOverLoading(10);
    }
}
