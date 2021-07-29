package MenuActions;

import Contacts.Contact;
import Contacts.ContactsList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindContactMenuAction extends MenuItem implements MenuAction {
    @Override
    public void doAction(Scanner sc, ContactsList list, String nameBeginning) {
        System.out.println("Enter Name Beginning:");
        String nb = sc.nextLine();
        System.out.printf("Search Query: -> %s \n", nb);
        List<String> foundNames = new ArrayList<String>();
        for (Contact contact : list.getAll()) {
            String contactName = contact.getName();
            if(contactName.toLowerCase().contains(nb.toLowerCase())) {
                foundNames.add(contactName);
            }
        }
        if(foundNames.size() < 1) {
            System.out.printf("\nDidnt Find any contacts this Query: -> %s.\n", nb);
            System.out.println("Do you want to try Again? yes/no\n");
            String nbNew = sc.nextLine();
            if ("yes".equals(nbNew)) {
                this.doAction(sc, list, nameBeginning);
            } else { System.out.println("No selected\n. BYE BYE!"); }
        }
        System.out.printf("found %s matches [\n", foundNames.size());
        for (String foundName : foundNames) {
            System.out.printf("%s,\n", foundName);
        }
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
