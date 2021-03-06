# 879RLO

This is the code for the 879 Project for the group consisting of Zhanna Kaufman, Sylee Dandekar and Hasnain Heickal

## CONTENT DESCRIPTION:

### _Mountain Climbing Assignment_ directory
This directory contains 2 subdirectories - **_Java_** and **_Python_**. <br />
These contain the files which the students were given through moodle for the Java and Python gradescope assignments, respectively. <br />
Each subdirectory contains a Problem Description file, an example input file (the autograders use a far larger one) and a template file. <br />
The template files initialize required imports, function names and output types. <br />
This is important as it allows students to focus on the problem rather than making sure the autograder can run their fuctions or parse their output correctly.

### _Solutions_ directory
This directory contains 2 files - **_mountain_climbing.py_** and **_MountainClimbing.java_**. <br />
These are the expected solutions to the problem, which pass all test cases in the autograder

### _python_autograder_ directory
This is the python autograder, which was zipped and uploaded to gradescope for the python version of the assignment. <br />
For the python autograder to work locally, make sure to add the mountain_climbing.py solution file into the **_python_autograder_** directory.  <br />
When uploading to gradescope, make sure to zip so that the zip file is called autograder and all files and directories in **_python_autograder_** are at its root.  <br />
The Python Autograder was built off of https://github.com/gradescope/autograder_samples/tree/master/python/src  <br />

### _python_autograder_ directory
This is the java autograder, which was zipped and uploaded to gradescope for the python version of the assignment. <br />
For the java autograder to work locally, make sure to add the MountainClimbing.java solution file into the **_java_autograder/src/main/java/mountainclimbing_** directory.  <br />
Also, in the **_java_autograder/run_autograder_** file, comment out lines 3, 8 and 14, and uncomment line 15.
The Java Autograder was built off of https://github.com/gradescope/autograder_samples/tree/master/java
