import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> scenario = new ArrayList<>();
        if (args.length <= 0) {
            System.out.println("usage: [file name]");
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = reader.readLine()) != null) {
                scenario.add(line);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        Simulator simulator = new Simulator(scenario);
        try {
            simulator.Simulation();
        } catch (Exception e) {
            System.out.println("Simulation failed because of: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
