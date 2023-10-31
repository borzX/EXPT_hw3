import java.io.FileWriter;
import java.io.IOException;

public class ContactSave {
    public static void save(String filename, Contact contact) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(filename+".txt", true);
            fileWriter.write(contact.toString());
            fileWriter.flush();

        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("Ошибка файла");
        }



    }
}
