import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class OrderTest {

    @Test
    public void testPrintShapesOrder() {

        Circle circle1 = new Circle(1, 2, 3.0);
        Circle circle2 = new Circle(3, 1, 2.0);
        Rectangle rectangle = new Rectangle(0, 0, 4.0, 5.0);
        Square square = new Square(2, 3, 4.0);


        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle);
        shapes.add(square);


        OrderPrinter orderPrinter = new OrderPrinter();
        orderPrinter.printShapes(shapes);


        List<Shape> expectedOrder = new ArrayList<>();
        expectedOrder.add(circle2);
        expectedOrder.add(square);
        expectedOrder.add(rectangle);
        expectedOrder.add(circle1);


        for (int i = 0; i < expectedOrder.size(); i++) {
            assertEquals(expectedOrder.get(i).getClass(), shapes.get(i).getClass());
        }
    }
}
