package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class LCDTelevisionDiffblueTest {
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals(
        "LCDTelevision [xDimension=1, yDiomension=1, WiFi=null, audioSystem=aaaaa, diagonal=1, name=aaaaa, power=0, poweredFromDevice=]",
        (new LCDTelevision("aaaaa", 1, 1, 1, true, "aaaaa")).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    LCDTelevision actualLcdTelevision = new LCDTelevision("aaaaa", 1, 1, 1, true, "aaaaa");

    // Assert
    String actualToStringResult = actualLcdTelevision.toString();
    assertNull(actualLcdTelevision.wiFi);
    assertEquals("aaaaa", actualLcdTelevision.audioSystem);
    assertEquals(1, actualLcdTelevision.xDimension);
    assertEquals(1, actualLcdTelevision.yDiomension);
    assertNull(actualLcdTelevision.getLine());
    assertEquals(
        "LCDTelevision [xDimension=1, yDiomension=1, WiFi=null, audioSystem=aaaaa, diagonal=1, name=aaaaa, power=0, poweredFromDevice=]",
        actualToStringResult);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    LCDTelevision actualLcdTelevision = new LCDTelevision("aaaaa", 1, 1, 1, 1, "aaaaa", "aaaaa");

    // Assert
    int actualPower = actualLcdTelevision.getPower();
    String actualToStringResult = actualLcdTelevision.toString();
    assertEquals(1, actualPower);
    assertEquals("aaaaa", actualLcdTelevision.wiFi);
    assertEquals("aaaaa", actualLcdTelevision.audioSystem);
    assertEquals(1, actualLcdTelevision.xDimension);
    assertEquals(1, actualLcdTelevision.yDiomension);
    assertNull(actualLcdTelevision.getLine());
    assertEquals(
        "LCDTelevision [xDimension=1, yDiomension=1, WiFi=aaaaa, audioSystem=aaaaa, diagonal=1, name=aaaaa, power=1, poweredFromDevice=]",
        actualToStringResult);
  }
}
