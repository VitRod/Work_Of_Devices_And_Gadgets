package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TubeTelevisionDiffblueTest {
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("TubeTelevision [frequency=1, diagonal=1, name=aaaaa, power=0, poweredFromDevice=]",
        (new TubeTelevision("aaaaa", 1, 1)).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    TubeTelevision actualTubeTelevision = new TubeTelevision("aaaaa", 1, 1);

    // Assert
    String actualToStringResult = actualTubeTelevision.toString();
    assertEquals(1, actualTubeTelevision.frequency);
    assertNull(actualTubeTelevision.getLine());
    assertEquals("TubeTelevision [frequency=1, diagonal=1, name=aaaaa, power=0, poweredFromDevice=]",
        actualToStringResult);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    TubeTelevision actualTubeTelevision = new TubeTelevision("aaaaa", 1, 1, 1);

    // Assert
    int actualPower = actualTubeTelevision.getPower();
    String actualToStringResult = actualTubeTelevision.toString();
    assertEquals(1, actualPower);
    assertEquals(1, actualTubeTelevision.frequency);
    assertNull(actualTubeTelevision.getLine());
    assertEquals("TubeTelevision [frequency=1, diagonal=1, name=aaaaa, power=1, poweredFromDevice=]",
        actualToStringResult);
  }
}
