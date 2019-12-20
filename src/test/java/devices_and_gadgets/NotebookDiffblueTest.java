package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NotebookDiffblueTest {
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Notebook [weight=1.0, ram=1, name=aaaaa, power=0, poweredFromDevice=]",
        (new Notebook("aaaaa", 1L, 1.0)).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Notebook actualNotebook = new Notebook("aaaaa", 1L, 1.0);

    // Assert
    ElectronicDevice actualLine = actualNotebook.getLine();
    assertEquals(1.0, actualNotebook.weight, 0.0);
    assertEquals(1L, actualNotebook.getRam());
    assertNull(actualLine);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Notebook actualNotebook = new Notebook("aaaaa", 1, 1L, 1.0);

    // Assert
    int actualPower = actualNotebook.getPower();
    ElectronicDevice actualLine = actualNotebook.getLine();
    assertEquals(1, actualPower);
    assertEquals(1.0, actualNotebook.weight, 0.0);
    assertEquals(1L, actualNotebook.getRam());
    assertNull(actualLine);
  }
}
