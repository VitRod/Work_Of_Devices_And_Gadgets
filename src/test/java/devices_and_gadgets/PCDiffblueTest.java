package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PCDiffblueTest {
  @Test
  public void getRamTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new PC("aaaaa", 1L)).getRam());
  }

  @Test
  public void setRamAndReturnMeTest() {
    // Arrange
    PC pc = new PC("aaaaa", 1L);

    // Act and Assert
    assertSame(pc, pc.setRamAndReturnMe(1));
  }

  @Test
  public void setPowerAndReturnMeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new PC("aaaaa", 1L)).setPowerAndReturnMe(1).getPower());
  }

  @Test
  public void compareTest() {
    // Arrange
    PC pc = new PC("aaaaa", 1L);

    // Act and Assert
    assertTrue(pc.compare(new ElectronicDevice("aaaaa")));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("PC [ram=1, name=aaaaa, power=0, poweredFromDevice=]", (new PC("aaaaa", 1L)).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    PC actualPc = new PC("aaaaa", 1L);

    // Assert
    ElectronicDevice actualLine = actualPc.getLine();
    assertEquals(1L, actualPc.getRam());
    assertNull(actualLine);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    PC actualPc = new PC("aaaaa", 1, 1L);

    // Assert
    int actualPower = actualPc.getPower();
    ElectronicDevice actualLine = actualPc.getLine();
    assertEquals(1, actualPower);
    assertEquals(1L, actualPc.getRam());
    assertNull(actualLine);
  }
}
