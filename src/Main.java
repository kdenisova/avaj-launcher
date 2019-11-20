import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> scenario = new ArrayList<String>();
        if (args.length <= 0) {
            System.out.println("usage: [file name]");
            return ;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = reader.readLine()) != null) {
                scenario.add(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Simulator simulator = new Simulator(scenario);
        simulator.Simulation();

//        for (String item: scenario) {
//            System.out.println(item);
//        }


    }
}
