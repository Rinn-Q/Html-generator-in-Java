import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Html {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String htmlContent = "";

        CSS css = new CSS();

        // HTML start
        htmlContent += "<!DOCTYPE html>\n";
        htmlContent += "<html>\n";
        htmlContent += "<head>\n";
        htmlContent += "<title>Console Interface</title>\n";
        htmlContent += "<link rel=\"stylesheet\" href=\"globals.css\">";
        htmlContent += "</head>\n";
        htmlContent += "<body>\n";

        // Printss
        System.out.println("Welcome to Console Interface HTML Generator!");
        System.out.println("Enter 'exit' to finish.\n");
        System.out.println("Available elements:");
        System.out.println("1. Heading (h1-h6)");
        System.out.println("2. Paragraph (p)");
        System.out.println("3. Unordered List (ul)");
        System.out.println("4. Ordered List (ol)");
        System.out.println("5. Link (a)\n");

        String input;
        do {
            System.out.print("Choose element type or 'exit': ");
            input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "h1":
                case "h2":
                case "h3":
                case "h4":
                case "h5":
                case "h6":
                    System.out.print("Enter heading text: ");
                    String headingText = scanner.nextLine();
                    htmlContent += "<" + input + " class='header'>" + headingText + "</" + input + ">\n";
                    break;
                case "p":
                    System.out.print("Enter paragraph text: ");
                    String paragraphText = scanner.nextLine();
                    htmlContent += "<p class='paragraph'>" + paragraphText + "</p>\n";
                    break;
                case "ul":
                case "ol":
                    System.out.print("Enter number of list items: ");
                    int numItems = Integer.parseInt(scanner.nextLine());
                    htmlContent += "<" + input + " class='ul'>\n";
                    for (int i = 0; i < numItems; i++) {
                        System.out.print("Enter item " + (i + 1) + ": ");
                        String listItem = scanner.nextLine();
                        htmlContent += "<li>" + listItem + "</li>\n";
                    }
                    htmlContent += "</" + input + ">\n";
                    break;
                case "a":
                    System.out.print("Enter link text: ");
                    String linkText = scanner.nextLine();
                    System.out.print("Enter URL: ");
                    String url = scanner.nextLine();
                    htmlContent += "<a class='link' href=\"" + url + "\">" + linkText + "</a>\n";
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Odoogoor hugjuulegdjinaa.");
            }
        } while (!input.equals("exit"));

        // HTML tagaa duusgayaa
        htmlContent += "</body>\n";
        htmlContent += "</html>";

        // Print and see html code
        System.out.println("\nGenerated HTML code:\n");
        System.out.println(htmlContent);

        // Save file
        String fileName = "generated.html";
        String filePath = Paths.get("").toAbsolutePath().toString() + "/" + fileName;
        saveToFile(filePath, htmlContent);

        css.addCSS();

        scanner.close();
    }

    private static void saveToFile(String filePath, String content) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();
            System.out.println("HTML code " + filePath + "-d hadgalagdsaan");
        } catch (IOException e) {
            System.err.println("Hadgalhad asuudal garlaa: " + e.getMessage());
        }
    }
}
