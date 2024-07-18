public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(){}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() + "\n" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
