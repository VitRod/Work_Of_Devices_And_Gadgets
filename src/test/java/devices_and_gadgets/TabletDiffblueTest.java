package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TabletDiffblueTest {
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals(
        "Tablet [screenDiagonal=1.0, navigationSystem=aaaaa, hasWifi=aaaaa, hasKeyboard=aaaaa, ram=1, name=aaaaa, power=0, poweredFromDevice=]",
        (new Tablet("aaaaa", 1L, 1.0, "aaaaa", "aaaaa", "aaaaa")).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Tablet actualTablet = new Tablet("aaaaa", 1L, 1.0, "aaaaa", "aaaaa", "aaaaa");

    // Assert
    ElectronicDevice actualLine = actualTablet.getLine();
    assertEquals("aaaaa", actualTablet.hasKeyboard);
    assertEquals(1.0, actualTablet.screenDiagonal, 0.0);
    assertEquals("aaaaa", actualTablet.navigationSystem);
    assertEquals("aaaaa", actualTablet.hasWifi);
    assertEquals(1L, actualTablet.getRam());
    assertNull(actualLine);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Tablet actualTablet = new Tablet("aaaaa", 1, 1L, 1.0, "aaaaa", "aaaaa", "aaaaa");

    // Assert
    int actualPower = actualTablet.getPower();
    ElectronicDevice actualLine = actualTablet.getLine();
    assertEquals(1, actualPower);
    assertEquals("aaaaa", actualTablet.hasKeyboard);
    assertEquals(1.0, actualTablet.screenDiagonal, 0.0);
    assertEquals("aaaaa", actualTablet.navigationSystem);
    assertEquals("aaaaa", actualTablet.hasWifi);
    assertEquals(1L, actualTablet.getRam());
    assertNull(actualLine);
  }
}
