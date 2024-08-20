package Abstraction.AbstractTWO;

public class MethodOverLoading {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
    public String add(String a, String b){
        return a+b;
    }


    public static void main(String[] args) {
        MethodOverLoading over = new MethodOverLoading();
        System.out.println( "Method-1:- "+ over.add(3,4));
        System.out.println( "Method-2:- "+over.add("a", "b"));
        System.out.println( "Method-3:- "+over.add(1,2,3));
    }
}
