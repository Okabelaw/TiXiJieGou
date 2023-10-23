package structure3;

/**
 Test_Name:TiXiJieGou2
 Date:2023.10.23
 Number:202131060927
 Name:Tang_Zhizhen
 **/

public class ProgramD {
        public void run(String path1,String path2) {
            //创建主题
            KWICSubject kwicSubject = new KWICSubject();
            //创建观察者
            Input input = new Input(path1);
            Shift shift = new Shift(input.getLineTxt());
            Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
            Output output = new Output(alphabetizer.getKwicList(), path2);

            // 将观察者加入主题
            kwicSubject.addObserver(input);
            kwicSubject.addObserver(shift);
            kwicSubject.addObserver(alphabetizer);
            kwicSubject.addObserver(output);
            // 逐步调用各个观察者
            kwicSubject.startKWIC();
        }
}
