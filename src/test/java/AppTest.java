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
    assertThat(pageSource()).contains("House");
  }

  @Test
  public void wordShowPageDisplaysDescription() {
    goTo("http://localhost:4567/words/new");
    fill("#name").with("House");
    submit(".btn");
    click("a", withText("View Words list."));
    click("a", withText("House"));
    assertThat(pageSource()).contains("House");
  }

  @Test
  public void wordDefinitionPageDisplaysDescription() {
    goTo("http://localhost:4567/words/new");
    fill("#name").with("Cat");
    submit(".btn");
    click("a", withText("View Words list."));
    click("a", withText("Cat"));
    assertThat(pageSource()).contains("Add a word to Cat");
  }

}
