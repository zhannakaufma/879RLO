package com.gradescope.mountainclimbing.tests;
//
import org.junit.Test;
import static org.junit.Assert.*;
import com.gradescope.jh61b.grader.GradedTest;
import java.util.ArrayList;
import java.lang.Integer;

import com.gradescope.mountainclimbing.MountainClimbing;



public class MountainClimbingTest {
    ArrayList<Integer> output;
    
    public MountainClimbingTest() {
        try {
            this.output = new MountainClimbing().mountainClimbing();
        } catch (java.io.FileNotFoundException e) {
            this.output = new ArrayList<Integer>();
        }
    }

    
    @Test
    @GradedTest(name="Test Output 1", max_score=2)
    public void test_case_1() {
        assertEquals(this.output.get(0), Integer.valueOf(13005));
    }

    @Test
    @GradedTest(name="Test Output 2", max_score=2)
    public void test_case_2() {
        assertEquals(this.output.get(1), Integer.valueOf(23520));
    }

    @Test
    @GradedTest(name="Test Output 3", max_score=2)
    public void test_case_3() {
        assertEquals(this.output.get(2), Integer.valueOf(11271));
    }

    @Test
    @GradedTest(name="Test Output 4", max_score=2)
    public void test_case_4() {
        assertEquals(this.output.get(3), Integer.valueOf(13054));
    }

    @Test
    @GradedTest(name="Test Output 5", max_score=2)
    public void test_case_5() {
        assertEquals(this.output.get(4), Integer.valueOf(12164));
    }

    @Test
    @GradedTest(name="Test Output 6", max_score=2)
    public void test_case_6() {
        assertEquals(this.output.get(5), Integer.valueOf(9888));
    }

    @Test
    @GradedTest(name="Test Output 7", max_score=2)
    public void test_case_7() {
        assertEquals(this.output.get(6), Integer.valueOf(14562));
    }

    @Test
    @GradedTest(name="Test Output 8", max_score=2)
    public void test_case_8() {
        assertEquals(this.output.get(7), Integer.valueOf(9103));
    }

    @Test
    @GradedTest(name="Test Output 9", max_score=2)
    public void test_case_9() {
        assertEquals(this.output.get(8), Integer.valueOf(9326));
    }

    @Test
    @GradedTest(name="Test Output 10", max_score=2)
    public void test_case_10() {
        assertEquals(this.output.get(9), Integer.valueOf(1494));
    }
}
