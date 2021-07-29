import java.util.Scanner;

public interface MenuAction {
    void doAction(Scanner sc, ContactsList list, String nameBeginning);
    String getName();
    boolean closeAfter();
}
