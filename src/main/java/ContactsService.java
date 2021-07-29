import java.util.List;

interface ContactsService {
    List<Contact> getAll();
    void remove(int index);
    void add(Contact contact);
    Contact get(int index);
    void setContact(int index, Contact contact);
    int size();
}
