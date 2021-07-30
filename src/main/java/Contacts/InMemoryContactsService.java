package Contacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InMemoryContactsService implements ContactsService {
    private final List<Contact> contacts;

    public InMemoryContactsService(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getAll() { return contacts; }
    public void add(Contact contact) {
        contacts.add(contact);
    }
    public void remove(int index) { contacts.remove(index); }
    public Contact get(int index) {
        return contacts.get(index);
    }
    public void setContact(int index, Contact contact) { }
    public void printAll() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.printf("i -> %d, Contact Details: %s \n", i+1, contacts.get(i).getFullName());
        }
    }
    public int size() {
        return contacts.size();
    }
    public void find(Scanner sc, String searchQuery) {
        List<String> foundNames = new ArrayList<String>();
        for (Contact contact : contacts) {
            String contactName = contact.getName();
            if(contactName.toLowerCase().contains(searchQuery.toLowerCase())) {
                foundNames.add(contactName);
            }
        }
        if(foundNames.size() < 1) {
            System.out.printf("\nDidnt Find any contacts this Query: -> %s.\n", searchQuery);
            System.out.println("Do you want to try Again? yes/no\n");
            String searchQueryNew = sc.nextLine();
            if ("yes".equals(searchQueryNew)) {
                this.find(sc, searchQueryNew);
            } else { System.out.println("No selected\n. BYE BYE!"); }
        }
        System.out.printf("found %s matches [\n", foundNames.size());
        for (String foundName : foundNames) {
            System.out.printf("%s,\n", foundName);
        }
    }
}
