package Class6Testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Challenges {
    public static void main(String[] args) throws Exception {
        //5
        File file = new File("src/Class6Testing/Players.csv");
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());

        //6
        String fileName = "src/Class6Testing/NewFile.csv";
        String messageToWrite = "My long string";
        Files.writeString(Paths.get(fileName), messageToWrite, StandardCharsets.ISO_8859_1);

    }


}
