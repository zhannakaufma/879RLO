# -*- coding: utf-8 -*-

import unittest
from gradescope_utils.autograder_utils.decorators import leaderboard
from mountain_climbing import *
import time


class TestLeaderboard(unittest.TestCase):
    def setUp(self):
        start_time = time.time()
        outputarray = mountain_climbing()
        self.total_time = (time.time() - start_time)
        correctarray = [13005, 23520, 11271, 13054, 12164, 9888, 14562, 9103, 9326, 1494]
        try:
            if len(outputarray) < 10:
                outputarray = outputarray + [0 for i in range(10 - len(outputarray))]
            elif len(outputarray) < 10:
                outputarray = outputarray[0:10]

            self.accuracy = 100 * len([i for i, j in zip(outputarray, correctarray) if i == j]) / 10
        except:
            self.accuracy = 0


    @leaderboard("% Accuracy")
    def test_accuracy(self, set_leaderboard_value=None):
        set_leaderboard_value(self.accuracy)

    @leaderboard("Time", "asc")
    def test_timing(self, set_leaderboard_value=None):
        """Sets a leaderboard value that's sorted ascending (lower is better)"""
        set_leaderboard_value(self.total_time)
