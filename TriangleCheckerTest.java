import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 4;
        float b = 2;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);

    }

    @Test
    public void testIsoscelesTriangle() {

      // Arrange
        float a = 4;
        float b = 4;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testEquilateralTriangle() {

      // Arrange
        float a = 4;
        float b = 4;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);
    }
    
    @Test
    public void testNotValidTriangle() {

      // Arrange
        float a = -4;
        float b = 3;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNotValidTriangle2() {

      // Arrange
        float a = 4;
        float b = -3;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNotValidTriangle3() {

      // Arrange
        float a = 4;
        float b = 3;
        float c = -2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNotValidTriangle4() {

      // Arrange
        float a = 4;
        float b = 3;
        float c = 50;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }
  
    @Test
    public void testNotValidTriangle5() {

      // Arrange
        float a = 4;
        float b = 50;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNotValidTriangle6() {

      // Arrange
        float a = 50;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

}
