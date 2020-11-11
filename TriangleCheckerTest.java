import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Test: Normal
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);

        // Test: Gleichseitig
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, TriangleChecker.checkTriangle(3, 3, 3));

        // Test: Kein Dreieck (wenn eine Seite zu lang ist oder bei negativen Werten)
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(-3, 3, 3));
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(3, -3, 3));
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(3, 3, -3));
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(40, 3, 3));
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(3, 40, 3));
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(3, 3, 40));

        //Test: Gleichschenklig
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, TriangleChecker.checkTriangle(3, 3, 6));

    }
}
