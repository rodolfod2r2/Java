import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProcuderOutPut {

    public static void main(String[] args) {

        Path path = Paths.get("C://confluent/txt.txt");
        Charset utf8 = StandardCharsets.UTF_8;

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, utf8)) {
            for (int i = 1; i <= 100; i++){
                bufferedWriter.write("testando " + i);
                bufferedWriter.write(" ");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder loadText = new StringBuilder();
        loadText.append("header");
        loadText.append("full");
        System.out.print(loadText);
    }
}
