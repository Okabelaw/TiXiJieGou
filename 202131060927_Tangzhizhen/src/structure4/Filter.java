package structure4;

import java.io.IOException;

/**
 Test_Name:TiXiJieGou2
 Date:2023.10.23
 Number:202131060927
 Name:Tang_Zhizhen
 **/

public abstract class Filter {
    protected Pipe input;
    protected Pipe output;

    public Filter(Pipe input, Pipe output) {
        this.input = input;
        this.output = output;
    }
    protected abstract void transform() throws IOException;
}
