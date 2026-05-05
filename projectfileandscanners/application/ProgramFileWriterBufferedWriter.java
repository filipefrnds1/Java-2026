package projectfileandscanners.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class ProgramFileWriterBufferedWriter {
    //FileWriter and BufferedWriter
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String[] lines = new String[] {"Good morning", "Good Afternoon", "Good night"};

        String path = "c:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
