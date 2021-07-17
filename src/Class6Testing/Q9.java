package Class6Testing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Q9 {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("src/Class6Testing/the-file-name.txt", StandardCharsets.UTF_8);
        writer.println("www.google.com");
        writer.println("www.facebook.com");
        writer.close();
    }


}
