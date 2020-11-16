import java.util.Scanner;

public class TriangleChecker {
  
  public enum TriangleType {
    NONE, 
    NORMAL,
    ISOSCELES,  // Gleichschenklig
    EQUILATERAL // Gleichseitig
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Geben Sie die Seitenlängen ein.");
    float a = enterFloat(s, "a: ");
    float b = enterFloat(s, "b: ");
    float c = enterFloat(s, "c: ");
    s.close();
    printAnalysis(a, b, c);
  }

  // Eingabe einer Seitenlänge
  private static float enterFloat(Scanner s, String prompt) {
    System.out.print(prompt);
    return s.nextFloat();
  }

  // Ausgabe der ermittelten Dreiecksart
  private static void printAnalysis(float a, float b, float c) {
    TriangleType type = checkTriangle(a, b, c);
    switch (type) {
      case NONE:
        System.out.println("Kein Dreieck");
        break;        
      case NORMAL:
        System.out.println("Dreieck");
        break;        
      case ISOSCELES:
        System.out.println("Gleichschenkliges Dreieck");
        break;        
      case EQUILATERAL:
        System.out.println("Gleichseitiges Dreieck");
        break;        
    }
  }

  public static boolean checkIfPositive (float a, float b, float c) {

    return (a > 0 && b > 0 && c > 0);
  }

  public static boolean checkIfAccurateLength (float a, float b, float c) {

    return ((a + b > c) && (b + c > a) && (a + c > b));
  }

  // Analyse der Dreiecksart
  public static TriangleType checkTriangle(float a, float b, float c) {
    if (checkIfAccurateLength(a,b,c) && checkIfPositive(a,b,c)) {
     
    if (a == b || b == c || a == c) {
    
    if (a == b && b == c) {
    return TriangleType.EQUILATERAL;
    }
    else {
    return TriangleType.ISOSCELES;
    }
    }
    return TriangleType.NORMAL;
    }
    return TriangleType.NONE;
  }
}