import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    public void testCreateCircle() {
        FactoryShape factory = new FactoryShape();
        Shape circle = factory.createShape("Circle", 0, 0, 0, 0, 0, 3.0); // radius is 3.0
        assertTrue(circle instanceof Circle);

    }

    @Test
    public void testCreateRectangle() {
        FactoryShape factory = new FactoryShape();
        Shape rectangle = factory.createShape("Rectangle", 0, 0, 0, 4.0, 5.0, 0); // width 4.0, height 5.0
        assertTrue(rectangle instanceof Rectangle);

    }

    @Test
    public void testCreateSquare() {
        FactoryShape factory = new FactoryShape();
        Shape square = factory.createShape("Square", 0, 0, 4.0, 0, 0, 0); // side length is 4.0
        assertTrue(square instanceof Square);

    }


}
