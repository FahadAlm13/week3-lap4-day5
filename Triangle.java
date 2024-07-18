public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(int x, int y, double base, double height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculateCircumference() {  // هذا القانون بعد اجتهاد
        double hypotenuse = Math.sqrt((base * base) + (height * height));
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return "Triangle{" + super.toString() + "\n" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
