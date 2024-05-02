import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
// import java.util.Scanner;
import java.util.Scanner;

public class CSS {
    public void addCSS() {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Adding a new CSS file..." );
        
        String cssContent = "";
        cssContent += "body{";
        System.out.println("-----------------Body-------------------------");
        System.out.print("backgroundColor : ");
        String bodybColor = sc.nextLine();
        cssContent += "background-color: " + bodybColor + ";\n}\n";

        System.out.println("--------------Header---------------------------");
        cssContent+=".header{\n";
        System.out.print("text Color : ");
        String color = sc.nextLine();
        cssContent+="color:" + color + ";\n";
        System.out.print("text align : ");
        String textAlign = sc.nextLine();
        cssContent += "text-align:" + textAlign + ";\n";
        System.out.print("background-color: ");
        String bColor = sc.nextLine();
        cssContent += "background-color: " + bColor + ";\n";
        cssContent+="}\n";

        System.out.println("---------------------Paragraph---------------------");
        cssContent+= ".paragraph{\n";
        System.out.print("text Color : ");
        String pColor = sc.nextLine();
        cssContent+="color:" + pColor + ";\n";
        System.out.print("text align : ");
        String pTextAlign = sc.nextLine();
        cssContent += "text-align:" + pTextAlign + ";\n";
        System.out.print("background-color: ");
        String pbColor = sc.nextLine();
        cssContent += "background-color: " + pbColor + ";\n";
        cssContent+="}\n";

        System.out.println("---------------List---------------------------------");
        cssContent += ".list{\n";
        System.out.print("text Color : ");
        String lColor = sc.nextLine();
        cssContent+="color:" + lColor + ";\n";
        System.out.print("text align : ");
        String lTextAlign = sc.nextLine();
        cssContent += "text-align:" + lTextAlign + ";\n";
        System.out.print("background-color: ");
        String lbColor = sc.nextLine();
        cssContent += "background-color: " + lbColor + ";\n";
        cssContent+="}\n";

        System.out.println("---------------Link-------------------");
        cssContent += ".link{\n";
        System.out.print("text Color : ");
        String aColor = sc.nextLine();
        cssContent+="color:" + aColor + ";\n";
        System.out.print("text align : ");
        String aTextAlign = sc.nextLine();
        cssContent += "text-align:" + aTextAlign + ";\n";
        System.out.print("background-color: ");
        String abColor = sc.nextLine();
        cssContent += "background-color: " + abColor + ";\n";
        System.out.print("textdecoration : ");
        String tDecoration = sc.nextLine();
        cssContent += "text-decoration: " + tDecoration + ";\n";
        cssContent+="}\n";

        String fileName = "globals.css";
        String filePath = Paths.get("").toAbsolutePath().toString() + "/" + fileName;
        saveToFile(filePath, cssContent);
    }

    private static void saveToFile(String filePath, String content) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();
            System.out.println("CSS code " + filePath + "-d hadgalagdsaan");
        } catch (IOException e) {
            System.err.println("Hadgalhad asuudal garlaa: " + e.getMessage());
        }
    }
}