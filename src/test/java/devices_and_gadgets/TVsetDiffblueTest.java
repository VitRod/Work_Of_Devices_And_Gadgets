package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TVsetDiffblueTest {
  @Test
  public void compareTest() {
    // Arrange
    TVset tVset = new TVset("aaaaa", 1);

    // Act and Assert
    assertTrue(tVset.compare(new ElectronicDevice("aaaaa")));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("TVset [diagonal=1, name=aaaaa, power=0, poweredFromDevice=]", (new TVset("aaaaa", 1)).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    TVset actualTVset = new TVset("aaaaa", 1);

    // Assert
    assertEquals(1, actualTVset.diagonal);
    assertNull(actualTVset.getLine());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    TVset actualTVset = new TVset("aaaaa", 1, 1);

    // Assert
    int actualPower = actualTVset.getPower();
    assertEquals(1, actualPower);
    assertEquals(1, actualTVset.diagonal);
    assertNull(actualTVset.getLine());
  }
}
