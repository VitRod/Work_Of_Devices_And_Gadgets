package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DVD_PlayerDiffblueTest {
  @Test
  public void compareTest() {
    // Arrange
    DVD_Player dvd_Player = new DVD_Player("aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"},
        new String[]{"aaaaa", "aaaaa", "aaaaa"}, "aaaaa", "aaaaa");

    // Act and Assert
    assertTrue(dvd_Player.compare(new ElectronicDevice("aaaaa")));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals(
        "DVD_Player [formats=[aaaaa, aaaaa, aaaaa], colorSystems=[aaaaa, aaaaa, aaaaa], tuner=aaaaa, imageFormat=aaaaa, name=aaaaa, power=0, poweredFromDevice=]",
        (new DVD_Player("aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"}, new String[]{"aaaaa", "aaaaa", "aaaaa"},
            "aaaaa", "aaaaa")).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    DVD_Player actualDvd_Player = new DVD_Player("aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"},
        new String[]{"aaaaa", "aaaaa", "aaaaa"}, "aaaaa", "aaaaa");

    // Assert
    assertEquals(3, actualDvd_Player.colorSystems.length);
    assertEquals("aaaaa", actualDvd_Player.tuner);
    assertEquals(3, actualDvd_Player.formats.length);
    assertEquals("aaaaa", actualDvd_Player.imageFormat);
    assertNull(actualDvd_Player.getLine());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    DVD_Player actualDvd_Player = new DVD_Player("aaaaa", 1, new String[]{"aaaaa", "aaaaa", "aaaaa"},
        new String[]{"aaaaa", "aaaaa", "aaaaa"}, "aaaaa", "aaaaa");

    // Assert
    int actualPower = actualDvd_Player.getPower();
    assertEquals(1, actualPower);
    assertEquals(3, actualDvd_Player.colorSystems.length);
    assertEquals("aaaaa", actualDvd_Player.tuner);
    assertEquals(3, actualDvd_Player.formats.length);
    assertEquals("aaaaa", actualDvd_Player.imageFormat);
    assertNull(actualDvd_Player.getLine());
  }
}
