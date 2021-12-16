import unittest
from gradescope_utils.autograder_utils.decorators import weight, number
from mountain_climbing import *
import time

class TestComplex(unittest.TestCase):
    def setUp(self):
        self.mountain_climbing_output = mountain_climbing()  # Call function.


    @weight(2)
    @number("Test for Correct Output Length")
    def test_output_length(self):
        self.assertEqual(len(self.mountain_climbing_output), 10, "You are not outputting the correct number of cases.")

    @weight(2)
    @number("Test for Time < 1 Second")
    def test_time(self):
        start_time = time.time()
        mountain_climbing()
        val = (time.time() - start_time)
        self.assertLess(val, 1, "Your program took too long, are you using recursion?")

    @weight(2)
    @number("Test Output 1")
    def test_case_1(self):
        val = int(self.mountain_climbing_output[0])
        self.assertEqual(val, 13005, "One of your output values is incorrect.")

    @weight(2)
    @number("Test Output 2")
    def test_case_2(self):
        val = int(self.mountain_climbing_output[1])
        self.assertEqual(val, 23520, "One of your output values is incorrect.")

    @weight(2)
    @number("Test Output 3")
    def test_case_3(self):
        val = int(self.mountain_climbing_output[2])
        self.assertEqual(val, 11271, "One of your output values is incorrect.")

    @weight(2)
    @number("Test Output 4")
    def test_case_4(self):
        val = int(self.mountain_climbing_output[3])
        self.assertEqual(val, 13054, "One of your output values is incorrect.")

    @weight(2)
    @number("Test Output 5")
    def test_case_5(self):
        val = int(self.mountain_climbing_output[4])
        self.assertEqual(val, 12164, "One of your output values is incorrect.")

    @weight(2)
    @number("Test Output 6")
    def test_case_6(self):
        val = int(self.mountain_climbing_output[5])
        self.assertEqual(val, 9888, "One of your output values is incorrect.")

    @weight(2)
    @number("Test Output 7")
    def test_case_7(self):
        val = int(self.mountain_climbing_output[6])
        self.assertEqual(val, 14562, "One of your output values is incorrect.")

    @weight(2)
    @number("Test Output 8")
    def test_case_8(self):
        val = int(self.mountain_climbing_output[7])
        self.assertEqual(val, 9103, "One of your output values is incorrect.")

    @weight(2)
    @number("Test Output 9")
    def test_case_9(self):
        val = int(self.mountain_climbing_output[8])
        self.assertEqual(val, 9326, "One of your output values is incorrect.")

    @weight(2)
    @number("Test Output 10")
    def test_case_10(self):
        val = int(self.mountain_climbing_output[9])
        self.assertEqual(val, 1494, "One of your output values is incorrect.")
