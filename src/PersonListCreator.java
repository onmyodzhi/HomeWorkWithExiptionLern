import java.util.ArrayList;
import java.util.List;

public class PersonListCreator {
    private List<String> dbList;

    public List<String> getDbList() {
        return dbList;
    }
    public List<String> createDbList(Person person){
        dbList = new ArrayList<>();
        dbList.add(person.getName());
        dbList.add(person.getSurname());
        dbList.add(person.getFatherName());
        dbList.add(person.getBirthday());
        dbList.add(person.getPhoneNumber());
        return dbList;
    }
}
