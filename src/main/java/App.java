import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";


    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/patients", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String name = request.queryParams("name");
      DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      String birthdate = request.queryParams("birthdate");
      LocalDateTime newDate = LocalDateTime.parse(birthdate, f);

      Patient newPatient = new Patient(name, newDate);
      request.session().attribute("patient", newPatient);
      //request.session().attribute("birthdate", newPatient);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());



  }
}
