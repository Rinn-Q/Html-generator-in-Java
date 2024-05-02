package lab1;

public class Printer implements Print {
    @Override
    public void printMenu() {
        System.out.println("1. Play\n2. Edit Collection\n3. About\n0. Exit");
    }

    @Override
    public void printEdit() {
        System.out.println("1. See Collection\n2. Add Cards\n3. Remove Cards\n4. Edit Cards\n5. Back to Menu");
    }

    
}
