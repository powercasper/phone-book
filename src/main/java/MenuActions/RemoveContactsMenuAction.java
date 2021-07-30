package MenuActions;

import Contacts.ContactsList;

import java.util.Scanner;

public class RemoveContactsMenuAction implements MenuAction {
    public Scanner sc;
    public ContactsList list;
    public RemoveContactsMenuAction(Scanner sc, ContactsList list) {
        this.sc = sc;
        this.list = list;
    }
    @Override
    public void doAction() {
        System.out.println("Available to remove -> [");
        list.printAll();
        System.out.println("]\n");
        System.out.println("Provide number i: ->");
        int select = sc.nextInt();
        sc.nextLine();
        list.remove(select-1);
    }
    @Override
    public String getName() {
        return "Remove Contact";
    }
    @Override
    public boolean closeAfter() {
        return true;
    }
}
