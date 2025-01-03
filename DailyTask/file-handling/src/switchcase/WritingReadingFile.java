package switchcase;

import java.io.*;
import java.util.Scanner;

public class WritingReadingFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Enter text to written");
            System.out.println("2.Read contents of file");
            System.out.println("Enter your choice: ");
        choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    FileWriter output=null;
                    try {
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Enter the Content: ");
                        String str = scanner1.nextLine();
                        //output = new FileOutputStream("data.txt");
                        output = new FileWriter("new.txt");
                        output.write(str);
                    } catch (IOException e) {
                        System.err.println(e.getMessage());

                    }
                    finally {
                        try{
                            output.close();
                            System.out.println("Above line successfully added to file");
                        }
                        catch(IOException e){
                            System.err.println(e.getMessage());
                        }
                    }
                    break;
                }
                case 2: {
                    try {
                        FileReader input = new FileReader("new.txt");
                        Scanner scanner = new Scanner(input);
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                }
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
       while(choice!=0);
    }
}
