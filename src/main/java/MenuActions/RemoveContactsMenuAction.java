package MenuActions;

import Contacts.ContactsList;

import java.util.Scanner;

public class RemoveContactsMenuAction extends MenuItem implements MenuAction {
    @Override
    public void doAction(Scanner sc, ContactsList list, String nameBeginning) {
        System.out.println("Available to remove -> [");
        for (int i = 0; i < list.getAll().size(); i++) {
            String name = list.get(i).getName();
            String phoneNumber = list.get(i).getPhone();
            System.out.printf("i -> %d, name: %s, phoneNumber: %s \n", i+1, name, phoneNumber);
        }
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
