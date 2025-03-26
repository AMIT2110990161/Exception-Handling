import java.io.*;

public class ReadFirstLine {
    public static void main(String[] args) {
        File file = new File("info.txt");


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String firstLine = br.readLine(); // Read first line
            if (firstLine != null) {
                System.out.println(firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
