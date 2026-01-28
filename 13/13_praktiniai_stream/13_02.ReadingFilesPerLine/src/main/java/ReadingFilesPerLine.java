
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        // System.out.println("Input file name:");
        // String file = scanner.nextLine();
        // System.out.println(read(file));
    }

    public static List<String> read(String file) throws IOException {
//        String path = "C:\\Users\\D1JP\\Desktop\\" + file + ".txt";
//        return Files.readAllLines(Paths.get(path));
        return Files.readAllLines(Path.of(file));
    }

}
