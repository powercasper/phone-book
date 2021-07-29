import java.util.Scanner;

public class AddContactMenuAction extends MenuItem implements MenuAction {
    @Override
    public void doAction(Scanner sc, ContactsList list, String nameBeginning) {
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Phone Number");
        String phoneNumber = sc.nextLine();
        Contact one = new Contact(name, phoneNumber);
        list.add(one);
    }
    @Override
    public String getName() {
        return "Add Contact";
    }
    @Override
    public boolean closeAfter() {
        return true;
    }

}
