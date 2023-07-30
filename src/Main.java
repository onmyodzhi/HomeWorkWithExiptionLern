// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        FileCreator fileCreator = new FileCreator();
        fileCreator.createFile(person);
        PersonListCreator listCreator = new PersonListCreator();
        listCreator.createDbList(person);
        Writer writer = new Writer();
        writer.writeInFile(fileCreator, listCreator);
    }
}