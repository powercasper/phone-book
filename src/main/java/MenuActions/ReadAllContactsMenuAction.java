package MenuActions;

import Contacts.Contact;
import Contacts.ContactsList;

import java.util.Scanner;

public class ReadAllContactsMenuAction extends MenuItem implements MenuAction {
    @Override
    public void doAction(Scanner sc, ContactsList list, String nameBeginning) {
        System.out.printf("found %s contacts [\n", list.size());
        for (Contact item : list.getAll()) {
            System.out.printf("%s,\n", item.getName());
        }
        System.out.println("]\n");
    }
    @Override
    public String getName() {
        return "Read All Contacts";
    }
    @Override
    public boolean closeAfter() {
        return true;
    }
}
