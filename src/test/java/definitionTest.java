import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class DefinitionTest {
  @After
  public void tearDown() {
    Definition.clear();
    Word.clear();
  }
  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("Home is");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void getDefinition_definitionInstantiatesWithDefinition_Home() {
    Definition testDefinition = new Definition("Home is");
    assertEquals("Home is", testDefinition.getDefinition());
  }

  @Test
  public void isCompleted_isFalseAfterInstantiation_false() {
    Definition testDefinition = new Definition("Home is");
    assertEquals(false, testDefinition.isCompleted());
  }


  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
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

  @Test
  public void getId_definitionInstantiateWithAnId_1(){
    Definition testDefinition = new Definition("Home is");
    assertEquals(1, testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_secondDefinition() {
    Definition firstDefinition = new Definition("Home is");
    Definition secondDefinition = new Definition("Work is");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }

  @Test
  public void find_returnsNullWhenNoDefinitionFound_null() {
    assertTrue(Definition.find(999) == null);
  }
}
