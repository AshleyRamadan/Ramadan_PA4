package Problem2;

import java.io.*;
import java.util.*;

public class DuplicateCounter
{
    private HashMap <String, Integer> wordCount = new HashMap<String, Integer>();

    public void count(File dataFile) throws IOException
    {
        BufferedReader streamFile = new BufferedReader(new FileReader(dataFile));

        String line = null;
        while((line = streamFile.readLine()) != null)
        {
            if (!wordCount.containsKey(line))
                wordCount.put(line, 1);
            else
            {
                //wordCounter += wordCount.get(line);
                //int count = wordCount.get(line);
                wordCount.put(line, wordCount.get(line) + 1);
            }
        }
        streamFile.close();
    }

    public void write(File outputFile) throws IOException
    {
        if(outputFile.createNewFile()) {
            Writer newFile = new FileWriter(outputFile, false);
            int length = wordCount.size();
            //ArrayList<String> setToList = new ArrayList<String>(wordCount);
            //int i = 0;
            for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                newFile.write(key + " = " + value);
            }
            newFile.close();
        }
        else
        {
            Writer newFile = new FileWriter(outputFile, false);
            int length = wordCount.size();
            //ArrayList<String> setToList = new ArrayList<String>(wordCount);
            //int i = 0;
            for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                newFile.write(key + " = " + value);
            }
            newFile.close();
        }
    }
}
