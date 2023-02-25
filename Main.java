public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        new Circle().printer();
        circle.printName();
        Shape quad = new Quad();
        new Quad().printer();
        quad.printName();
        Shape rectangle = new Rectangle();
        new Rectangle().printer();
        rectangle.printName();
        Shape triangle = new Triangle();
        new Triangle().printer();
        triangle.printName();
        Shape trapeze = new Trapeze();
        new Trapeze().printer();
        trapeze.printName();
    }
}
