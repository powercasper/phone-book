package MenuActions;

import Contacts.ContactsList;
import java.util.Scanner;

public class FindContactMenuAction implements MenuAction {
    public Scanner sc;
    public ContactsList list;
    public FindContactMenuAction(Scanner sc, ContactsList list) {
        this.sc = sc;
        this.list = list;
    }
    @Override
    public void doAction() {
        System.out.println("Enter Name Beginning:");
        String nb = sc.nextLine();
        System.out.printf("Search Query: -> %s \n", nb);
        list.find(sc, nb);
        System.out.println("]\n");
    }
    @Override
    public String getName() {
        return "Find Contact";
    }
    @Override
    public boolean closeAfter() {
        return true;
    }
}
