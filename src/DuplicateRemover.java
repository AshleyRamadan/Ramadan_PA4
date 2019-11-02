import java.io.*;
import java.util.*;

public class DuplicateRemover
{
    private HashSet<String> uniqueWords = new HashSet<String>();

    public void remove(File dataFile) throws IOException
    {
        //File oldFile = new File("dataFile");
        BufferedReader streamFile = new BufferedReader(new FileReader(dataFile));
        String line = null;

        while((line = streamFile.readLine()) != null)
        {
            if((uniqueWords.contains(line)) == false)
                uniqueWords.add(line);
        }
        streamFile.close();
    }

    public void write(File outputWords) throws IOException
    {
        Writer newFile = new FileWriter(outputWords, false);
        int length = uniqueWords.size();
        ArrayList<String> setToList = new ArrayList<String>(uniqueWords);

        for(int i = 0; i < length; i++)
        {
            newFile.write(setToList.get(i));
        }
        newFile.close();
    }
}
