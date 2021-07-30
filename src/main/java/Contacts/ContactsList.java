package Contacts;

import java.util.List;

public class ContactsList extends InMemoryContactsService {
    private final List<Contact> contactsList;
    public ContactsList(List<Contact> contacts) {
        super(contacts);
        this.contactsList = contacts;
    }
    public List<Contact> getAll() { return contactsList; }
    public void add(Contact contact) { contactsList.add(contact); }
    public void remove(int index) { contactsList.remove(index); }
    public Contact get(int index) { return contactsList.get(index); }
    public void setContact(int index, Contact contact) { }
    public int size() { return contactsList.size(); }
}
