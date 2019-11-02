package Problem2;

import java.io.File;
import java.io.IOException;

public class Application
{
    public static void main(String[] args) throws IOException
    {
        DuplicateCounter example = new DuplicateCounter();
        File problem2 = new File("C:\\Users\\melan\\IdeaProjects\\Ramadan_PA4\\Problem2\\problem2.txt");
        File nFile = new File("C:\\Users\\melan\\IdeaProjects\\Ramadan_PA4\\Problem2\\unique_words.txt");
        example.count(problem2);
        example.write(nFile);
    }
}
