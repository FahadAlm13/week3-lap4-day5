public class Circle extends Shape{
    private double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() + "\n" +
                "radius=" + radius +
                '}';
    }
}
