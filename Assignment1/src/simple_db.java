import java.io.*;
import java.util.HashMap;

public class simple_db
{
    private static final String fileName = "simple_db.txt";

    public void saveFile(HashMap<String, String> Database) throws IOException
    {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            os.writeObject(Database);
        }
    }

    public HashMap<String, String> readFile() throws ClassNotFoundException, IOException
    {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName)))
        {
            return (HashMap<String, String>) is.readObject();
        }
    }

    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> dataBase = new HashMap<String, String>();
        dataBase.put("London", "4");
        dataBase.put("San Francisco", "10");
        dataBase.put("Beijing", "3020");
        dataBase.put("Tokyo", "42");
        dataBase.put("Seoul", "1030");
        dataBase.put("Copenhagen", "42");

        simple_db simpleDb = new simple_db();
        simpleDb.saveFile(dataBase);

        HashMap<String, String> readFromFile = simpleDb.readFile();
        System.out.println(readFromFile);
    }
}
