package com.gradescope.mountainclimbing.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
// import junit.tests.framework.TestListenerTest
import com.gradescope.jh61b.grader.GradedTestListenerJSON;
import com.gradescope.mountainclimbing.MountainClimbing;

import java.util.ArrayList;
import java.util.Objects;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MountainClimbingTest.class,
        MountainClimbingPredicates.class,
})
public class RunTests {
    public static void main(String[] args) {


        JUnitCore runner = new JUnitCore();
        runner.addListener(new GradedTestListenerJSON());
        // runner.addListener(new TestListenerTest());
        Result r = runner.run(RunTests.class);

        ArrayList<Integer> output;
        double duration;

        try {
            long startTime = System.nanoTime();
            output = new MountainClimbing().mountainClimbing();
            long endTime = System.nanoTime();
            duration = (double) (endTime - startTime) / 1_000_000_000;
        } catch (java.io.FileNotFoundException e) {
            output = new ArrayList<Integer>();
            output.add(0);
            duration = 0.0;
        }

        ArrayList<Integer> correct = new ArrayList<Integer> ();
        correct.add(13005);
        correct.add(23520);
        correct.add(11271);
        correct.add(13054);
        correct.add(12164);
        correct.add(9888);
        correct.add(14562);
        correct.add(9103);
        correct.add(9326);
        correct.add(1494);

        double numcorrect = 0;
        for (int i = 0; i < output.size(); i++){
            if (Objects.equals(output.get(i), correct.get(i))){
                numcorrect += 1;
            }
        }
        double accuracy = 100 * numcorrect / 10;

        System.out.println(String.format("\"%s\"", "leaderboard") + ": [{" + String.join(",", new String[] {
                String.format("\"%s\": \"%s\"", "name", "accuracy"),
                String.format("\"%s\": \"%s\"", "value", accuracy),
                String.format("\"%s\": \"%s\"", "order", "desc"),
        }) + "}, {" + String.join(",", new String[] {
                String.format("\"%s\": \"%s\"", "name", "time (seconds)"),
                String.format("\"%s\": \"%s\"", "value", duration),
                String.format("\"%s\": \"%s\"", "order", "asc"),
        })
                + "} ] }");

    }
}
