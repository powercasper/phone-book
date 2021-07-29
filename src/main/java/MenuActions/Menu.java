package MenuActions;

import Contacts.ContactsList;

import java.util.List;
import java.util.Scanner;

public class Menu {
    List<MenuAction> actions;
    ContactsList contactsLists;

    private final Scanner sc;

    public Menu(Scanner sc, List<MenuAction> items, ContactsList contactsLists) {
        this.actions = items;
        this.sc = sc;
        this.contactsLists = contactsLists;
    }

    private void printItems() {
        for (int i = 0; i < actions.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, actions.get(i).getName());
        }
        System.out.printf("%d - exit\n", actions.size() + 1);
    }

    private int getChoice() {
        System.out.println("Enter you choice");
        int ch = sc.nextInt();
        sc.nextLine();
        switch (ch) {
            case 1:
                AddContactMenuAction addContactMenuAction = new AddContactMenuAction();
                addContactMenuAction.doAction(sc, contactsLists, "");
                break;
            case 2:
                ReadAllContactsMenuAction readAllContactsMenuAction = new ReadAllContactsMenuAction();
                readAllContactsMenuAction.doAction(sc, contactsLists, "");
                break;
            case 3:
                RemoveContactsMenuAction removeContactsMenuAction = new RemoveContactsMenuAction();
                removeContactsMenuAction.doAction(sc, contactsLists, "");
                break;
            case 4:
                FindContactMenuAction findContact = new FindContactMenuAction();
                findContact.doAction(sc, contactsLists, "");
                break;
            case 5:
                break;
            default: System.out.println("Enter valid number");
        }
        return ch - 1;
    }

    public void run() {
        while (true) {
            printItems();
            int ch = getChoice();
            if (ch < 0 || ch > actions.size()) {
                System.out.println("incorrect");
                continue;
            }
            if (ch == actions.size()) break;
        }
    }
}
