package MenuActions;

import Contacts.Contact;
import Contacts.ContactsList;

import java.util.Scanner;

public class ReadAllContactsMenuAction implements MenuAction {
    public Scanner sc;
    private ContactsList list;
    public ReadAllContactsMenuAction(Scanner sc, ContactsList list) {
        this.sc = sc;
        this.list = list;
    }
    @Override
    public void doAction() {
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
