import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShapeAreaTest {



    @Test
    public void testCircleAreaZeroRadius() {
        Circle circleZero = new Circle(0, 0, 0.0);
        double circleZeroArea = circleZero.area();
        assertEquals(0.0, circleZeroArea);
    }



    @Test
    public void testRectangleZeroWidth() {
        Rectangle rectangleZeroWidth = new Rectangle(0, 0, 0.0, 5.0);
        double rectangleZeroWidthArea = rectangleZeroWidth.area();
        assertEquals(0.0, rectangleZeroWidthArea);
    }



    @Test
    public void testSquareArea() {
        Square square = new Square(0, 0, 4.0);
        double squareArea = square.area();
        assertEquals(16.0, squareArea);
    }

    @Test
    public void testSquareZeroSideLength() {
        Square squareZero = new Square(0, 0, 0.0);
        double squareZeroArea = squareZero.area();
        assertEquals(0.0, squareZeroArea);
    }

    @Test
    public void testCircleNegativeRadius() {
        Circle negativeRadiusCircle = new Circle(0, 0, -3.0);
        double negativeCircleArea = negativeRadiusCircle.area();
        assertEquals(28.27, negativeCircleArea, 0.01);
    }



}
