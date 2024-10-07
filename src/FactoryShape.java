public class FactoryShape {
    public Shape createShape(String type, int x, int y, double side, double width, double height, double radius) {
        if (type.equalsIgnoreCase("Circle")) {
            return new Circle(x, y, radius);
        } else if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle(x, y, width, height);
        } else if (type.equalsIgnoreCase("Square")) {
            return new Square(x, y, side);
        } else {
            throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}

