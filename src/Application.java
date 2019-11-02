import java.io.*;
import java.lang.*;
public class Application {
    public static void main(String[] args) throws IOException
    {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        File p1 = new File("C:\\Users\\melan\\IdeaProjects\\Ramadan_PA4\\src\\problem1.txt");
        File nFile = new File("C:\\Users\\melan\\IdeaProjects\\Ramadan_PA4\\src\\unique_words.txt");
        duplicateRemover.remove(p1);
        duplicateRemover.write(nFile);
    }
}
