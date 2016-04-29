import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class DefinitionTest {
  @After
  public void tearDown() {
    // Definition.clear();
    // Word.clear();
  }
  @Test
    public void definition_instantiatesCorrectly_true() {
      Definition testDefinition = new Definition("Home");
      assertEquals(true, testDefinition instanceof Definition);
    }


}
