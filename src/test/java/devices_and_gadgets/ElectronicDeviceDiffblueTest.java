package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ElectronicDeviceDiffblueTest {
  @Test
  public void getLineTest() {
    // Arrange, Act and Assert
    assertNull((new ElectronicDevice("aaaaa")).getLine());
  }

  @Test
  public void connectToPowerTest() {
    // Arrange
    ElectronicDevice electronicDevice = new ElectronicDevice("aaaaa");

    // Act and Assert
    assertTrue(electronicDevice.connectToPower(electronicDevice));
    assertSame(electronicDevice, electronicDevice.poweredFromDevice);
  }

  @Test
  public void setPowerAndReturnMeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new ElectronicDevice("aaaaa")).setPowerAndReturnMe(1).getPower());
  }

  @Test
  public void compareTest() {
    // Arrange, Act and Assert
    assertTrue((new ElectronicDevice("aaaaa")).compare(new ElectronicDevice("aaaaa")));
  }

  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ElectronicDevice("aaaaa")).getId());
  }

  @Test
  public void setPowerTest() {
    // Arrange
    ElectronicDevice electronicDevice = new ElectronicDevice("aaaaa");

    // Act
    electronicDevice.setPower(1);

    // Assert
    assertEquals(1, electronicDevice.getPower());
  }

  @Test
  public void getPowerTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ElectronicDevice("aaaaa")).getPower());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new ElectronicDevice("aaaaa")).name);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ElectronicDevice actualElectronicDevice = new ElectronicDevice("aaaaa", 1);

    // Assert
    assertEquals(1, actualElectronicDevice.getPower());
    assertEquals("aaaaa", actualElectronicDevice.name);
  }
}
