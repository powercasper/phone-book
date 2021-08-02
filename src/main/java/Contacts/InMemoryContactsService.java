package Contacts;

import java.util.ArrayList;
import java.util.List;

public abstract class InMemoryContactsService implements ContactsService {
    private final List<Contact> contacts;

    public InMemoryContactsService(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void printAll() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.printf("i -> %d, Contact Details: %s \n", i+1, contacts.get(i).getFullName());
        }
    }

    public void find(String searchQuery) {
        List<String> foundNames = new ArrayList<String>();
        for (Contact contact : contacts) {
            String contactName = contact.getName();
            if(contactName.toLowerCase().contains(searchQuery.toLowerCase())) {
                foundNames.add(contactName);
            }
        }
        System.out.printf("found %s matches [\n", foundNames.size());
        for (String foundName : foundNames) {
            System.out.printf("%s,\n", foundName);
        }
        System.out.println("]\n");
    }
}
