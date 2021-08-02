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
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice - 1;
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
            actions.get(ch).doAction();
        }
    }
}
