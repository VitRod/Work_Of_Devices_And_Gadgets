package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PlasmaTelevisionDiffblueTest {
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("PlasmaTelevision [xDimension=1, yDiomension=1, diagonal=1, name=aaaaa, power=0, poweredFromDevice=]",
        (new PlasmaTelevision("aaaaa", 1, 1, 1)).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    PlasmaTelevision actualPlasmaTelevision = new PlasmaTelevision("aaaaa", 1, 1, 1);

    // Assert
    String actualToStringResult = actualPlasmaTelevision.toString();
    assertEquals(1, actualPlasmaTelevision.yDiomension);
    assertEquals(1, actualPlasmaTelevision.xDimension);
    assertNull(actualPlasmaTelevision.getLine());
    assertEquals("PlasmaTelevision [xDimension=1, yDiomension=1, diagonal=1, name=aaaaa, power=0, poweredFromDevice=]",
        actualToStringResult);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    PlasmaTelevision actualPlasmaTelevision = new PlasmaTelevision("aaaaa", 1, 1, 1, 1);

    // Assert
    int actualPower = actualPlasmaTelevision.getPower();
    String actualToStringResult = actualPlasmaTelevision.toString();
    assertEquals(1, actualPower);
    assertEquals(1, actualPlasmaTelevision.yDiomension);
    assertEquals(1, actualPlasmaTelevision.xDimension);
    assertNull(actualPlasmaTelevision.getLine());
    assertEquals("PlasmaTelevision [xDimension=1, yDiomension=1, diagonal=1, name=aaaaa, power=1, poweredFromDevice=]",
        actualToStringResult);
  }
}
