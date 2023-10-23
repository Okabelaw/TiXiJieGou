package structure2;

/**
 Test_Name:TiXiJieGou2
 Date:2023.10.23
 Number:202131060927
 Name:Tang_Zhizhen
 **/

public class ProgramC {
        public  void run(String path1,String path2) {
            Input input = new Input();
            input.input(path1);
            Shift shift = new Shift(input.getLineTxt());
            shift.shift();
            Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
            alphabetizer.sort();
            Output output = new Output(alphabetizer.getKwicList());
            output.output(path2);
        }

}
