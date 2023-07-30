import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void writeInFile(FileCreator fileCreator,PersonListCreator listCreator){
        try(FileWriter writer = new FileWriter(fileCreator.getDb(), true)){
            writer.write(listCreator.getDbList().toString());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
