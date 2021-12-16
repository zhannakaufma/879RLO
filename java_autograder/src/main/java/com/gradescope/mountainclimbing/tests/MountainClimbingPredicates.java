package com.gradescope.mountainclimbing.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import com.gradescope.jh61b.grader.GradedTest;
import java.util.ArrayList;
import java.lang.Integer;
import com.gradescope.mountainclimbing.MountainClimbing;

public class MountainClimbingPredicates {

    ArrayList<Integer> output;
    double duration;

    public MountainClimbingPredicates() {
        try {
            long startTime = System.nanoTime();
            this.output = new MountainClimbing().mountainClimbing();
            long endTime = System.nanoTime();
            this.duration = (double) (endTime - startTime) / 1_000_000_000;
        } catch (java.io.FileNotFoundException e) {
            this.output = new ArrayList<Integer>();
            this.duration = 1000000000000L;
        }
    }

    @Test
    @GradedTest(name="Test for the right length of output", max_score=2)
    public void test_output_length() {

        assertEquals(output.size(), 10);
    }

    @Test
    @GradedTest(name="Test for runtime less than 1 second", max_score=2)
    public void test_timing() {
        assertTrue(duration < 1);

    }

}