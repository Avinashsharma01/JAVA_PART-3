package Practice.QuestionOne;

public class Circle extends Shape{

    private Double Radius;

    public Circle(Double radius) {
        Radius = radius;
    }

    public Double getRadius() {
        return Radius;
    }

    public void setRadius(Double radius) {
        Radius = radius;
    }

    @Override
    public double calulateAria() {
        return Math.PI * Math.pow(Radius, 2) ;
    }
}
