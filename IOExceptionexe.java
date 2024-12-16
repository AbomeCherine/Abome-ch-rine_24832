import java.io.*;

public class IOExceptionexe {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("Manioc_file.txt");
            BufferedReader fileInput = new BufferedReader(file);


            System.out.println(fileInput.readLine());

            fileInput.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
