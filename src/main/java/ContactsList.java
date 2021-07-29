import java.util.List;

public class ContactsList extends InMemoryContactsService {
    public ContactsList(List<Contact> contacts) {
        super(contacts);
    }
}
