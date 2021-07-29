import java.util.List;

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
    public int size() {
        return contacts.size();
    }
}
