import java.util.ArrayList;

import org.fluentlenium.adapter.FluentTest;
import org.junit.Rule;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Dictionary!");
    assertThat(pageSource()).contains("Add a New Word");
    assertThat(pageSource()).contains("View Words List");
  }

  @Test
  public void wordIsCreatedTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a New Word"));
    fill("#name").with("House");
    submit(".btn");
    assertThat(pageSource()).contains("Your Word has been saved.");
  }

  @Test
  public void wordsIsDisplayedTest() {
    goTo("http://localhost:4567/words/new");
    fill("#name").with("House");
    submit(".btn");
    click("a", withText("View Words list."));
    assertThat(pageSource()).contains("Household chores");
  }
// <-- test for othet page-->
  // @Test
  // public void wordIsCreated() {
  //   goTo("http://localhost:4567/");
  //   fill("#description").with("Earth");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Your word has been saved.");
  // }



}
//
//   @Rule
//   public ClearRule clearRule = new ClearRule();
//
//
//   @Test
//   public void taskIsCreatedTest() {
//     goTo("http://localhost:4567/");
//     click("a", withText("Add a new task"));
//     fill("#description").with("Mow the lawn");
//     submit(".btn");
//     assertThat(pageSource()).contains("Your task has been saved.");
//   }
//
//   @Test
//   public void taskIsDisplayedTest() {
//    goTo("http://localhost:4567/tasks/new");
//    fill("#description").with("Mow the lawn");
//    submit(".btn");
//    click("a", withText("View tasks"));
//    assertThat(pageSource()).contains("Mow the lawn");
//   }
//
//   @Test
//   public void multipleTasksAreDisplayedTest() {
//     goTo("http://localhost:4567/tasks/new");
//     fill("#description").with("Mow the lawn");
//     submit(".btn");
//     goTo("http://localhost:4567/tasks/new");
//     fill("#description").with("Buy groceries");
//     submit(".btn");
//     click("a", withText("View tasks"));
//     assertThat(pageSource()).contains("Mow the lawn");
//     assertThat(pageSource()).contains("Buy groceries");
//   }
//
//   @Test
//   public void taskShowPageDisplayDescription() {
//     goTo("http://localhost:4567/tasks/new");
//     fill("#description").with("Do the dishes");
//     submit(".btn");
//     click("a", withText("View tasks"));
//     click("a", withText("Do the dishes"));
//     assertThat(pageSource()).contains("Do the dishes");
//    }
//   @Test
//   public void taskNotFoundMessageShown() {
//     goTo("http://localhost:4567/tasks/999");
//     assertThat(pageSource()).contains("Task not found");
//   }
// }
