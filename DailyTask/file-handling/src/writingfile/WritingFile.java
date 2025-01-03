package writingfile;

import java.io.*;

public class WritingFile {
    public static void main(String[] args) {
        //OutputStream output = null; OR
        Writer output=null;

        try {
            //output = new FileOutputStream("data.txt");
            output = new FileWriter("data.txt",true);
            String str = """
                    HELLO UST
                    Writing all files
                    """;
           // output.write(str.getBytes());
            output.write(str);
        } catch (IOException e) {
            System.err.println(e.getMessage());

        }
    }
}
