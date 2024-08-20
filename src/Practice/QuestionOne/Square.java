package Practice.QuestionOne;

public class Square extends Shape{

    private int Sides;

    public Square(int side){
        this.Sides= side;
    }

    public int getSides() {
        return Sides;
    }

    public void setSides(int sides) {
        Sides = sides;
    }

    @Override
    public double calulateAria() {
        return 4 * Sides;
    }
}
