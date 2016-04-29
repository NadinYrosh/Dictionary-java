import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true(){
    Word myWord = new Word("Earth");
    assertEquals(true, myWord instanceof Word);
  }
  // @Test
  // public void task_instantiatesCorrectly_true() {
  //   Task myTask = new Task("Mow the lawn");
  //   assertEquals(true, myTask instanceof Task);
  // }
  //
  // @Test
  // public void task_instantiatesWithDescription_String() {
  //   Task myTask = new Task("Mow the lawn");
  //   assertEquals("Mow the lawn", myTask.getDescription());
  // }
  //
  // @Test
  // public void isCompleted_isFalseAfterInstantiation_false() {
  //   Task myTask = new Task("Mow the lawn");
  //   assertEquals(false, myTask.isCompleted());
  // }
  //
  // @Test
  // public void getCreatedAt_instantiatesWithCurrentTime_today() {
  //   Task myTask = new Task("Mow the lawn");
  //   assertEquals(LocalDateTime.now().getDayOfWeek(), myTask.getCreatedAt().getDayOfWeek());
  // }
  //
  // @Test
  // public void all_returnsAllInstancesOfTask_true() {
  //   Task firstTask = new Task("Mow the lawn");
  //   Task secondTask = new Task("Buy groceries");
  //   assertTrue(Task.all().contains(firstTask));
  //   assertTrue(Task.all().contains(secondTask));
  // }
  //
  // @Test
  // public void newId_tasksInstantiateWithAnID_true() {
  //   Task myTask = new Task("Mow the lawn");
  //   assertEquals(Task.all().size(), myTask.getId());
  // }
  //
  // @Test
  // public void find_returnsTaskWithSameId_secondTask() {
  //   Task firstTask = new Task("Mow the lawn");
  //   Task secondTask = new Task("Buy groceries");
  //   assertEquals(Task.find(secondTask.getId()), secondTask);
  // }
  //
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
