import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  @After
  public void tearDown() {
    Word.clear();
  }

  @Test
  public void word_instantiatesCorrectly_true(){
    Word myWord = new Word("Earth");
    assertEquals(true, myWord instanceof Word);
  }


  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word myWord1 = new Word("Earth");
    Word myWord2 = new Word("Rock");
    assertTrue(Word.all().contains(myWord1));
    assertTrue(Word.all().contains(myWord2));
  }

  @Test
  public void clear_emptiesAllWordsFromArrayList_0() {
    Word myWord1 = new Word("Earth");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

  @Test
  public void getId_tasksInstantiateWithAnID_1() {
    Word testWord = new Word("Earth");
    assertEquals(1, testWord.getId());
  }


  @Test
  public void find_returnsWordWithSameId_secondTask() {
    Word myWord1 = new Word("Earth");
    Word myWord2 = new Word("Rock");
    assertEquals(Word.find(myWord2.getId()), myWord2);
  }

  @Test
  public void find_returnsNullWhenNoWordFound_null() {
    assertTrue(Word.find(999) == null);
  }


  @Test
  public void getDefinitions_initiallyReturnsEmptyList_ArrayList() {
    Word testWord = new Word("Earth");
    assertEquals(0, testWord.getDefinitions().size());
  }

  @Test
  public void addDefinition_addsDefinitionToListOfWords_true() {
    Word testWord = new Word("Earth");
    Definition testDefinition = new Definition("Home is");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }
}
