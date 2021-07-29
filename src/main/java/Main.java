import Contacts.Contact;
import Contacts.ContactsList;
import MenuActions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MenuAction> items = new ArrayList<MenuAction>();
        ContactsList contactsLists = new ContactsList(new ArrayList<Contact>());

        items.add(new AddContactMenuAction());
        items.add(new ReadAllContactsMenuAction());
        items.add(new RemoveContactsMenuAction());
        items.add(new FindContactMenuAction());

        Menu menu = new Menu(sc, items, contactsLists);
        menu.run();
    }
}
