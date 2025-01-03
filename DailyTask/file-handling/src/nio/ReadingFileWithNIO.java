package nio;
//NIO-non blocking input and output

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFileWithNIO {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("data.txt"))
                .forEach(System.out::println);

//        Path dir=Paths.get("src");
//        Files.walk(dir).forEach(System.out::println);
    }
}