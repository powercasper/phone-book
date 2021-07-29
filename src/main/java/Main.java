import Contacts.Contact;
import Contacts.ContactsList;
import MenuActions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactsList contactsLists = new ContactsList(new ArrayList<Contact>());
        List<MenuAction> items = new ArrayList<MenuAction>();

        items.add(new AddContactMenuAction(sc, contactsLists));
        items.add(new ReadAllContactsMenuAction(sc, contactsLists));
        items.add(new RemoveContactsMenuAction(sc, contactsLists));
        items.add(new FindContactMenuAction(sc, contactsLists));

        Menu menu = new Menu(sc, items, contactsLists);
        menu.run();
    }
}
