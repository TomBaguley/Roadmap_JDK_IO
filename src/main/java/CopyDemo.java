
import java.io.*;

public class CopyDemo {

    public void copy() throws IOException {
        FileReader in = null;
        FileReader tempOut = null;
        FileWriter out = null;
        BufferedReader outReader = null;
        BufferedReader inReader = null;
        BufferedWriter outWriter = null;

        try {
            in = new FileReader("src/main/resources/input.txt");
            inReader = new BufferedReader(in);
            tempOut = new FileReader("src/main/resources/output.txt");
            outReader = new BufferedReader(tempOut);

            //If the FileWriter is instantiated with the output.txt file, the existing text is removed. Therefore, I have chosen
            //to do this later to show the initial content.

        } catch (IOException ioe) {
            System.out.println("Error finding specified file: " + ioe);
        }

        String line;
        while((line = outReader.readLine()) != null){

            System.out.println("Original content of output.txt: " + line);
            line = outReader.readLine();

        }

        try{
            out = new FileWriter("src/main/resources/output.txt");
            outWriter = new BufferedWriter(out);
        }catch(IOException ioe){
            System.out.println("Error finding specified file: " + ioe);
        }


        System.out.println("Content of input.txt:");
        while((line = inReader.readLine()) != null){

            System.out.println(line);
            outWriter.write(line);
            outWriter.newLine();
        }
//
//
//        System.out.println("Updated content of output.txt:");
//        while((line = outReader.readLine()) != null){
//            System.out.println(line);
//
//
//
//        }


    }
}
