package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class KaraokeStereoSystemDiffblueTest {
  @Test
  public void compareTest() {
    // Arrange
    KaraokeStereoSystem karaokeStereoSystem = new KaraokeStereoSystem("aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"},
        "aaaaa", "aaaaa");

    // Act and Assert
    assertTrue(karaokeStereoSystem.compare(new ElectronicDevice("aaaaa")));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals(
        "KaraokeStereoSystem [formats=[aaaaa, aaaaa, aaaaa], micrphoneInput=aaaaa, frequencyRange=aaaaa, name=aaaaa, power=0, poweredFromDevice=]",
        (new KaraokeStereoSystem("aaaaa", new String[]{"aaaaa", "aaaaa", "aaaaa"}, "aaaaa", "aaaaa")).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    KaraokeStereoSystem actualKaraokeStereoSystem = new KaraokeStereoSystem("aaaaa",
        new String[]{"aaaaa", "aaaaa", "aaaaa"}, "aaaaa", "aaaaa");

    // Assert
    assertEquals(3, actualKaraokeStereoSystem.formats.length);
    assertEquals("aaaaa", actualKaraokeStereoSystem.micrphoneInput);
    assertEquals("aaaaa", actualKaraokeStereoSystem.frequencyRange);
    assertNull(actualKaraokeStereoSystem.getLine());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    KaraokeStereoSystem actualKaraokeStereoSystem = new KaraokeStereoSystem("aaaaa", 1,
        new String[]{"aaaaa", "aaaaa", "aaaaa"}, "aaaaa", "aaaaa");

    // Assert
    int actualPower = actualKaraokeStereoSystem.getPower();
    assertEquals(1, actualPower);
    assertEquals(3, actualKaraokeStereoSystem.formats.length);
    assertEquals("aaaaa", actualKaraokeStereoSystem.micrphoneInput);
    assertEquals("aaaaa", actualKaraokeStereoSystem.frequencyRange);
    assertNull(actualKaraokeStereoSystem.getLine());
  }
}
