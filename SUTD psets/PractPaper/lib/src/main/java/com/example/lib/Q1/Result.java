package com.example.lib.Q1;

import java.util.ArrayList;
import java.util.List;


class Result {

    /*
     * Complete the 'roverMove' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER matrixSize
     *  2. STRING_ARRAY cmds
     */

    public static int roverMove(int matrixSize, List<String> cmds) {
        // Write your code here


        int[][] map = new int[matrixSize][matrixSize];
        int a = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                map[i][j] = a;
                a++;
            }
        }


        int currentPos = 0;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < matrixSize; i++) {
            ls.add(i);
        }

        for (String cmd: cmds) {
            if (cmd == "DOWN") {
                if ((currentPos + matrixSize) < (Math.pow(matrixSize,2) - 1)) {//does not leave the map
                    currentPos += matrixSize;
                }
            } else if (cmd == "LEFT") {
                if (currentPos % 4 != 0) { //is not at the left edge
                    currentPos -= 1;
                }
            } else if (cmd == "RIGHT") {
                if ((currentPos+1) % 4 != 0) {
                    currentPos += 1;
                }
            } else { // move up
                if (!ls.contains(currentPos)) {
                    currentPos -= matrixSize;
                }
            }
        }
        return currentPos;
    }
}


