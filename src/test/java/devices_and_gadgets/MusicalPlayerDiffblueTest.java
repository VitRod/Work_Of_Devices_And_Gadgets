package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MusicalPlayerDiffblueTest {
  @Test
  public void compareTest() {
    // Arrange
    MusicalPlayer musicalPlayer = new MusicalPlayer("aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"});

    // Act and Assert
    assertTrue(musicalPlayer.compare(new ElectronicDevice("aaaaa")));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("MusicalPlayer [formats=[aaaaa, aaaaa, aaaaa], name=aaaaa, power=0, poweredFromDevice=]",
        (new MusicalPlayer("aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"})).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    MusicalPlayer actualMusicalPlayer = new MusicalPlayer("aaaaa", 1, new String[]{"aaaaa", "aaaaa", "aaaaa"});

    // Assert
    int actualPower = actualMusicalPlayer.getPower();
    assertEquals(1, actualPower);
    assertEquals(3, actualMusicalPlayer.formats.length);
    assertNull(actualMusicalPlayer.getLine());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    MusicalPlayer actualMusicalPlayer = new MusicalPlayer("aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"});

    // Assert
    assertEquals(3, actualMusicalPlayer.formats.length);
    assertNull(actualMusicalPlayer.getLine());
  }
}
