package org.java.Avaj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AvajLauncher {
    public static void main(String[] args) throws AvajLauncherException {
        AvajLauncher m = new AvajLauncher();

        //m.changeStream();

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


        try {
            Simulator simulator = new Simulator(scenario);
            simulator.Simulation();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AvajLauncherException("Simulation failed because of: " + e.getMessage());
           // System.out.println("Simulation failed because of: " + e.getMessage());
            //e.printStackTrace();
        }
    }

    private void changeStream() {
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new File("simulation.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.setErr(System.out);
        System.setOut(printStream);
    }
}
