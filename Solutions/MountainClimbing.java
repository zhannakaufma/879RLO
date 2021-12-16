package com.gradescope.mountainclimbing;

import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
import java.lang.String;
import java.lang.Math;

public class MountainClimbing{

    /**
     * Function implementing recursion - choose your own variables
     */
    public int climbRecursion(int[][]matrix, int[][]secondmatrix, int i, int j) {
        if (!(secondmatrix[i][j] == 0)){
            return secondmatrix[i][j];}
        if ((i == 0) & (j == 0)){
            secondmatrix[i][j] = matrix[i][j];
            return matrix[i][j];}
        else {
            int out = 0;
            if (i == 0) {
                out = matrix[i][j] + climbRecursion(matrix, secondmatrix, i, j - 1);
            } else if (j == 0) {
                out = matrix[i][j] + climbRecursion(matrix, secondmatrix, i - 1, j);
            } else {
                out = matrix[i][j] + Math.max(climbRecursion(matrix, secondmatrix, i, j - 1), climbRecursion(matrix, secondmatrix, i - 1, j));
            }

            secondmatrix[i][j] = out;
            return out;
        }
    }

    /**
     * Reads the file, runs the recursion, outputs a ArrayList of values
     */
    public ArrayList<Integer> mountainClimbing() throws java.io.FileNotFoundException{
        Scanner myReader;



        File f = new File("input");
        myReader = new Scanner(f);

        String casenum = myReader.nextLine();


        ArrayList<Integer> outputArrayList = new ArrayList<Integer>();
        int N = 1;
        int M = 1;

        for (int i = 0; i < Integer.parseInt(casenum); i++) {
            String[] nmline = myReader.nextLine().split("\\s");
            N = Integer.parseInt(nmline[0]);
            M = Integer.parseInt(nmline[1]);


            int[][] matM = new int[N][M];


            for (int j = 0; j < N; j++) {
                String[] columns = myReader.nextLine().split("\\s");
                for (int k = 0; k < M; k++) {
                    matM[j][k] = Integer.parseInt(columns[k]);
                }
            }

            int[][] copymatM = new int[N][M];
            climbRecursion(matM, copymatM, (N - 1), (M - 1));
            outputArrayList.add(copymatM[N - 1][M - 1]);
        }


        return outputArrayList;
    }
}