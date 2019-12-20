package devices_and_gadgets;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MainDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void calcTotalAmountOfRamTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Main.calcTotalAmountOfRam(new ElectronicDevice[]{new ElectronicDevice("----------------------------------"),
        new ElectronicDevice("----------------------------------"), null});
  }
  @Test
  public void calcTotalAmountOfPowerTest() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    Main.calcTotalAmountOfPower(new ElectronicDevice[]{new ElectronicDevice("----------------------------------"),
        new ElectronicDevice("----------------------------------"), null});
  }
}
