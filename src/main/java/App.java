import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words/new", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/words-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/words", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String description = request.queryParams("name");
      Word newWord = new Word(description);
      model.put("template","templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("words", Word.all());
      model.put("template", "templates/words.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Word word = Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", word);
      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

    get("words/:id/descriptions/new", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Word word = Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", word);
      model.put("template", "templates/word-description-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    // post("/tasks", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //
    //   Category category = Category.find(Integer.parseInt(request.queryParams("categoryId")));
    //
    //   String description = request.queryParams("description");
    //   Task newTask = new Task(description);
    //
    //   category.addTask(newTask);
    //
    //   model.put("category", category);
    //   model.put("template", "templates/category-tasks-success.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());

  }
}













  //   get("tasks/new", (request, response) -> {
  //     HashMap<String, Object> model = new HashMap<String, Object>();
  //     model.put("template", "templates/task-form.vtl");
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  //
  //   get("/tasks", (request, response) -> {
  //     HashMap<String, Object> model = new HashMap<String, Object>();
  //     model.put("tasks", Task.all());
  //     model.put("template", "templates/tasks.vtl");
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  //
  //
  //   post("/tasks", (request, response) -> {
  //     HashMap<String, Object> model = new HashMap<String, Object>();
  //     String description = request.queryParams("description");
  //     Task newTask = new Task(description);
  //     model.put("template", "templates/success.vtl");
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  //
  //   get("/tasks/:id", (request, response) -> {
  //     HashMap<String, Object> model = new HashMap<String, Object>();
  //     Task task = Task.find(Integer.parseInt(request.params(":id")));
  //     model.put("task", task);
  //     model.put("template", "templates/task.vtl");
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
