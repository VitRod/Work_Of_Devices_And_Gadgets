package devices_and_gadgets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DancingStageArcadeMachineDiffblueTest {
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals(
        "DancingStageArcadeMachine [numberOfPlayers=1, songsNumber=1, genre=aaaaa, isCoinOperated=true, weightOfDancePlatform_KG=1, producerCountry=aaaaa, cabinetDescription=aaaaa, name=aaaaa, power=0, poweredFromDevice=]",
        (new DancingStageArcadeMachine("aaaaa", 1, 1, "aaaaa", true, 1, "aaaaa", "aaaaa")).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    DancingStageArcadeMachine actualDancingStageArcadeMachine = new DancingStageArcadeMachine("aaaaa", 1, 1, "aaaaa",
        true, 1, "aaaaa", "aaaaa");

    // Assert
    assertEquals(1, actualDancingStageArcadeMachine.weightOfDancePlatform);
    assertEquals(1, actualDancingStageArcadeMachine.numberOfPlayers);
    assertEquals("aaaaa", actualDancingStageArcadeMachine.genre);
    assertEquals(1, actualDancingStageArcadeMachine.songsNumber);
    assertEquals("aaaaa", actualDancingStageArcadeMachine.producerCountry);
    assertTrue(actualDancingStageArcadeMachine.isCoinOperated);
    assertEquals("aaaaa", actualDancingStageArcadeMachine.cabinetDescription);
    assertNull(actualDancingStageArcadeMachine.getLine());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    DancingStageArcadeMachine actualDancingStageArcadeMachine = new DancingStageArcadeMachine("aaaaa", 1, 1, 1, "aaaaa",
        true, 1, "aaaaa", "aaaaa");

    // Assert
    int actualPower = actualDancingStageArcadeMachine.getPower();
    assertEquals(1, actualPower);
    assertEquals(1, actualDancingStageArcadeMachine.weightOfDancePlatform);
    assertEquals(1, actualDancingStageArcadeMachine.numberOfPlayers);
    assertEquals("aaaaa", actualDancingStageArcadeMachine.genre);
    assertEquals(1, actualDancingStageArcadeMachine.songsNumber);
    assertEquals("aaaaa", actualDancingStageArcadeMachine.producerCountry);
    assertTrue(actualDancingStageArcadeMachine.isCoinOperated);
    assertEquals("aaaaa", actualDancingStageArcadeMachine.cabinetDescription);
    assertNull(actualDancingStageArcadeMachine.getLine());
  }
}
