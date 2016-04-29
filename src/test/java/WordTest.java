import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true(){
    Word myWord = new Word("Earth");
    assertEquals(true, myWord instanceof Word);
  }
  @Test
  public void word_instantiatesWithDescription_String() {
    Word myWord = new Word("Earth");
    assertEquals("Earth", myWord.getDescription());
  }

  @Test
  public void isCompleted_isFalseAfterInstantiation_false() {
    Word myWord = new Word("Earth");
    assertEquals(false, myWord.isCompleted());
  }


  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word myWord1 = new Word("Earth");
    Word myWord2 = new Word("Rock");
    assertTrue(Word.all().contains(myWord1));
    assertTrue(Word.all().contains(myWord2));
  }

  @Test
  public void newId_wordInstantiateWithAnID_true() {
    Word myWord = new Word("Earth");
    assertEquals(Word.all().size(), myWord.getId());
  }

  @Test
  public void find_returnsWordWithSameId_secondTask() {
    Word myWord1 = new Word("Earth");
    Word myWord2 = new Word("Rock");
    assertEquals(Word.find(myWord2.getId()), myWord2);
  }

  // @Test
  // public void find_returnsNullWhenNoTaskFound_null() {
  //   assertTrue(Task.find(999) == null);
  // }
  //
  // @Test
  // public void clear_emptiesAllTasksFromArrayList_0() {
  //   Task myTask = new Task("Mow the lawn");
  //   Task.clearTasksArray();
  //   assertEquals(Task.all().size(), 0);
  // }
}
