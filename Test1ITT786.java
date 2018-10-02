
package test1itt786;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class Test1ITT786 {

public static void main(String [] args) {

// The name of the file to open.

String fileName = "A.csv";

// This will reference one line at a time

String line = null;

try {

// FileReader reads text files in the default encoding.

FileReader fileReader = new FileReader(fileName);

// Always wrap FileReader in BufferedReader.

BufferedReader bufferedReader = new BufferedReader(fileReader);

while((line = bufferedReader.readLine()) != null) {

System.out.println(line);

}

// Always close files.

bufferedReader.close();

}

catch(FileNotFoundException ex) {

System.out.println(

"Unable to open file '" +

fileName + "'");

}

catch(IOException ex) {

System.out.println(

"Error reading file '"

+ fileName + "'");

// Or we could just do this:

// ex.printStackTrace();

}

try {
    File file = new File ("A.csv");
   // PrintWriter output = new PrintWriter(file);
    Scanner input = new Scanner(file);
    String baris1 = input.nextLine();
    String baris2 = input.nextLine();
    String baris3 = input.nextLine(); 
   
    System.out.println(" ");
    
    System.out.printf(baris3 ); System.out.println(" ");
    System.out.printf(baris2); System.out.println(" ");
    System.out.printf(baris1); System.out.println(" ");
}catch (FileNotFoundException ex){
    System.out.printf("Error: %s\n", ex);
}

}





}