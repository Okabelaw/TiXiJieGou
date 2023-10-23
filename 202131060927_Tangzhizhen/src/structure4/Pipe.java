package structure4;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 Test_Name:TiXiJieGou2
 Date:2023.10.23
 Number:202131060927
 Name:Tang_Zhizhen
 **/

public class Pipe {
    private Scanner pipeReader;
    private PrintWriter pipeWriter;
    Pipe(){
        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader();
        try {
            pipedWriter.connect(pipedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        pipeReader = new Scanner(pipedReader);
        pipeWriter = new PrintWriter(pipedWriter);
    }
    public String readerLine(){
        return pipeReader.nextLine();
    }
    public boolean hashNextLine(){
        return pipeReader.hasNext();
    }
    public void writerLine(String strLine){
        pipeWriter.println(strLine);
    }
    public void closeReader(){
        pipeReader.close();
    }
    public void closeWriter(){
        pipeWriter.close();
    }
}
