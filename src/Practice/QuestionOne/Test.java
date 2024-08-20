package Practice.QuestionOne;

public class Test {
    public static void main(String[] args) {
        // this is the aria of circle
        Circle c1 = new Circle(5.5);
        double aria= c1.calulateAria();
        System.out.println(aria);

        // this is the aria of square
        Square s1 =new Square(5);
        double squre = s1.calulateAria();
        System.out.println(squre);
    }
}
