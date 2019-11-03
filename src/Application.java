import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        //System.out.println("Please enter file path to problem1.txt: ");
        File p1 = new File("problem1.txt");

        // if this does not work on your computer i will cry
        File nFile = new File("unique_words.txt");
        duplicateRemover.remove(p1);
        duplicateRemover.write(nFile);
    }
}
