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
    Definition testDefinition = new Definition("Home is");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void getDescription_descriptionInstantiatesWithDefinition_Home() {
    Definition testDefinition = new Definition("Home is");
    assertEquals("Home is", testDefinition.getDescription());
  }

  @Test
  public void all_returnsAllInstancesOfDescription_true() {
    Definition firstDefinition = new Definition("Home is");
    Definition secondDefinition = new Definition("Work is");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
  public void clear_emptiesALlDefinitions_0(){
    Definition testDefinition = new Definition("Home is");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }


}
