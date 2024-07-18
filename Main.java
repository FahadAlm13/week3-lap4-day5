//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Circle circle = new Circle(30);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());

        System.out.println();

        Rectangle rectangle = new Rectangle(7, 3);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Circumference: " + rectangle.calculateCircumference());

        System.out.println();

        Triangle triangle = new Triangle(4, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Circumference: " + triangle.calculateCircumference());
    }
}