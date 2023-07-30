import java.io.File;
import java.io.IOException;

public class FileCreator {
    protected File db;

    public File getDb() {
        return db;
    }

    protected void createFile(Person person){
        this.db = new File(person.getSurname().toUpperCase() + ".txt");
    }
}
