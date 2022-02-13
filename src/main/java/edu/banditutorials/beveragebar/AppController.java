package edu.banditutorials.beveragebar;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller that handles the default request ("/").
 *
 * Use the new Java 15 text blocks to provide our menu. Thymeleaf:
 * https://spring.io/guides/gs/serving-web-content/
 *
 * @author Ajay Bandi
 */
@Controller
public class AppController {

    private static final String GREETING_MESSAGE = "Welcome to Dr. Bandi's Beverage Bar!";

    private static final int NUMBER_CUSTOM_TYPES = 3; // <--- KEEP THIS UPDATED
    /**
     * The @GetMapping annotation ensures that HTTP GET requests to / are mapped
     * to the index() method.Example:
     * https://spring.io/guides/gs/serving-web-content/
     *
     * @param idParam - the id provided in the URL
     * @param model - the model that holds information from controller to view
     * @return
     */
    @GetMapping(path = "/")
    public String index(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("greeting", GREETING_MESSAGE);
        model.addAttribute("dataMap", UtilityBuildSwitch.getAllCustomClassMap());
        model.addAttribute("customClass", getCustomClass(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "index";
    }

    /**
     * Map GET request to "/about" to about() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }

    private String getCustomClass(String id) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);

        var intID = Integer.parseInt(id);

        switch (intID) {

            // RUN UtilityBuildSwitch.java and
            // PASTE AUTOGENERATED SWITCH HERE
            case 1 -> {
                var b = new Coffee("Coffee");
                var n = b.getName();
                var d = b.getDescription();
                System.out.println("I'm " + n + ", a " + d + ".");
            }
            case 2 -> {
                var b = new Milk("Milk");
                var n = b.getName();
                var d = b.getDescription();
                System.out.println("I'm " + n + ", a " + d + ".");
            }
            case 3 -> {
                var b = new Tea("Tea");
                var n = b.getName();
                var d = b.getDescription();
                System.out.println("I'm " + n + ", a " + d + ".");
            }
            // END AUTOGENERATED PASTE (and right-click / Format)
            default -> {
            }
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return stringOutput;
    }
}
