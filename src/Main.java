import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);
        try {
            // Set templates directory
            cfg.setDirectoryForTemplateLoading(new File("templates"));
            // Load template
            Template template = cfg.getTemplate("example.ftl");

            // Create data model
            Map<String, Object> data = new HashMap<>();
            data.put("title", "Freemarker simple example");
            data.put("name", "World");

            List<String> fruits = Arrays.asList("Apple", "Pear", "Strawberry", "Pineaple", "Watermelon");
            data.put("fruits", fruits);

            List<User> users = Arrays.asList(
                new User("John Doe", "john@example.com", "1234 Elm St", "123-456-7890", true),
                new User("Jane Smith", "jane@example.com", "5678 Oak St", "098-765-4321", false),
                new User("Alice Johnson", "alice@example.com", "91011 Maple St", "555-555-5555", true)
            );
            data.put("users", users);

            // Save output
            FileWriter writer = new FileWriter(new File("output.html"));
            template.process(data, writer);
            writer.close();

            System.out.println("Output generated: output.html");
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }
}