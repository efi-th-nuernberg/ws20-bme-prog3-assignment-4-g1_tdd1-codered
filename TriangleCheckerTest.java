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

    assertEquals(TriangleChecker.TriangleType.NORMAL, type);
  }

  @Test
  public void testEquilateralTriangle() {

    assertEquals(TriangleChecker.TriangleType.EQUILATERAL, TriangleChecker.checkTriangle(3, 3, 3));
  }

  @Test
  public void testIfNoTriangle() {

    assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(-3, 3, 3));
    assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(3, -3, 3));
    assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(3, 3, -3));
    assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(40, 3, 3));
    assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(3, 40, 3));
    assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(3, 3, 40));
  }

  @Test
  public void testIsocelesTriangle() {

    assertEquals(TriangleChecker.TriangleType.ISOSCELES, TriangleChecker.checkTriangle(3, 3, 5));

  }
}
