package structure4;

import java.io.File;
import java.io.IOException;

/**
 Test_Name:TiXiJieGou2
 Date:2023.10.23
 Number:202131060927
 Name:Tang_Zhizhen
 **/

public class ProgramA {
    public void run(String path1,String path2) throws IOException {
        File inFile = new File(path1);
        File outFile = new File(path2);
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();

    }
}
