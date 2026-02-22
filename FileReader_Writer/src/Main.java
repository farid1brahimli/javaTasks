import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("Hello World");
        fileWriter.close();

            Thread.sleep(1000);
            try {
                FileReader filereader = new FileReader("test.txt");
                int read;
                while ((read = filereader.read()) != -1) {
                    System.out.print((char)read);
                }
//                filereader.close();
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }
    }
}