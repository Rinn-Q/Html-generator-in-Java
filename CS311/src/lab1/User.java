package lab1;

import java.util.Scanner;

public class User {
    Printer printer = new Printer();
    Scanner scan = new Scanner(System.in);
    void using(){
        printer.printMenu();
        int number1 = scan.nextInt();
        switch (number1) {
            case 1:
                
                break;
            case 2: 
                printer.printEdit();
                break;
            default:
                break;
        }
    }
    
    
}
