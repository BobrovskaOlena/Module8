public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape trapeze = new Trapeze();

        printer.printShapeName(circle);
        printer.printShapeName(quad);
        printer.printShapeName(rectangle);
        printer.printShapeName(triangle);
        printer.printShapeName(trapeze);
    }
}
