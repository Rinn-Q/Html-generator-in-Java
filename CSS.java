import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
// import java.util.Scanner;

public class CSS {
    public void addCSS() {
        System.out.println( "Adding a new CSS file..." );
        
        String cssContent = "";
        cssContent+="a{\n";
        cssContent+="background-color:blue; \n";
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