import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Opgave_3_File_reader {
    public static void main(String[] args) {
        try {
            File fileReader = new File("ressources/lorem_ipsum.txt");
            Scanner scanner = new Scanner(new FileInputStream(fileReader));
            int count = 0;
            // hasNext fungere som en boolean
            // den tjekker om der er et ord at printe, hvis der ikke er det så stopper den.
            while (scanner.hasNext()) {
                //next scanner det næste ord
            String word = scanner.next();
                System.out.println(word);
            count++;
            }
            System.out.println("number of words: "+count);
        }
        catch (FileNotFoundException e) {
            System.out.println("the file could not be found!");
        }
    }
}
