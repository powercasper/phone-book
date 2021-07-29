package MenuActions;

import Contacts.Contact;
import Contacts.ContactsList;

import java.util.Scanner;

public class AddContactMenuAction implements MenuAction {
    public Scanner sc;
    public ContactsList list;
    public AddContactMenuAction(Scanner sc, ContactsList list) {
        this.sc = sc;
        this.list = list;
    }

    @Override
    public void doAction() {
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Phone Number");
        String phoneNumber = sc.nextLine();
        Contact one = new Contact(name, phoneNumber);
        System.out.println("Added Contact: " + one.getFullName());
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
