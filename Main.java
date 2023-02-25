public class Main {
    public static void main(String[] args) {
        PrinterOfShapeName print = new PrinterOfShapeName();
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape trapeze = new Trapeze();
        print.printShapeName(circle.printName());
        print.printShapeName(quad.printName());
        print.printShapeName(rectangle.printName());
        print.printShapeName(triangle.printName());
        print.printShapeName(trapeze.printName());
    }
}
