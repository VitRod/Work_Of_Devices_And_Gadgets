package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MainframeDiffblueTest {

  @Test
  public void setNumberOfProcessorsTest() {
    // Arrange
    Mainframe mainframe = new Mainframe("aaaaa", 1L, 1);

    // Act
    mainframe.setNumberOfProcessors(1);

    // Assert
    assertEquals(1, mainframe.getNumberOfProcessors());
  }

  @Test
  public void getNumberOfProcessorsTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new Mainframe("aaaaa", 1L, 1)).getNumberOfProcessors());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Mainfraime [numberOfProcessors=1, ram=1, name=aaaaa, power=0, poweredFromDevice=]",
        (new Mainframe("aaaaa", 1L, 1)).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Mainframe actualMainframe = new Mainframe("aaaaa", 1L, 1);

    // Assert
    int actualNumberOfProcessors = actualMainframe.getNumberOfProcessors();
    ElectronicDevice actualLine = actualMainframe.getLine();
    assertEquals(1L, actualMainframe.getRam());
    assertNull(actualLine);
    assertEquals(1, actualNumberOfProcessors);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Mainframe actualMainframe = new Mainframe("aaaaa", 1, 1L, 1);

    // Assert
    int actualPower = actualMainframe.getPower();
    int actualNumberOfProcessors = actualMainframe.getNumberOfProcessors();
    ElectronicDevice actualLine = actualMainframe.getLine();
    assertEquals(1, actualPower);
    assertEquals(1L, actualMainframe.getRam());
    assertNull(actualLine);
    assertEquals(1, actualNumberOfProcessors);
  }
}
