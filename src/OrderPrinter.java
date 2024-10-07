import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class OrderPrinter {
    public void printShapes(List<Shape> shapes) {

        shapes.sort(Comparator.comparingDouble(Shape::area)
                .thenComparingInt(Shape::getX)
                .thenComparingInt(Shape::getY));


        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
