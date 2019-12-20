package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GasolineGeneratorDiffblueTest {
  @Test
  public void compareTest() {
    // Arrange
    GasolineGenerator gasolineGenerator = new GasolineGenerator("aaaaa", 1);

    // Act and Assert
    assertTrue(gasolineGenerator.compare(new ElectronicDevice("aaaaa")));
  }

  @Test
  public void setPowerTest() {
    // Arrange
    GasolineGenerator gasolineGenerator = new GasolineGenerator("aaaaa", 1);

    // Act
    gasolineGenerator.setPower(1);

    // Assert
    assertEquals(1, gasolineGenerator.getPower());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    GasolineGenerator actualGasolineGenerator = new GasolineGenerator("aaaaa", 1);

    // Assert
    int actualPower = actualGasolineGenerator.getPower();
    assertEquals(1, actualPower);
    assertNull(actualGasolineGenerator.getLine());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("GasolineGenerator [name=aaaaa, power=1]", (new GasolineGenerator("aaaaa", 1)).toString());
  }
}
