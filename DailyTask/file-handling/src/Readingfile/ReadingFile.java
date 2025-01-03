package Readingfile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        // or we can use FileReader.
        try {
            InputStream input = new FileInputStream("data.txt");
            // to read by character
            //int ch;
            //while(ch=input.read()!=-1){
            //sout((char)ch);
        //}
            // to read by line.
            Scanner scanner=new Scanner(input);
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                System.out.println(line);
            }
            //OR
//            BufferedReader reader=new BufferedReader(input);
//            reader.lines().forEach(System.out::println);
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
