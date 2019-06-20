package com.example.lib1;


import java.util.ArrayList;

public class GetPath {

    static boolean getPath(int r, int c, ArrayList<Point> path, final int[][] grid) {
        path.add(0, new Point(r, c));
        //move from r,c to 0,0


        if(r<0 || c<0){
            return false;
        }


        if (r == 0 && c == 0) {
            return true;
        }

        if(grid[r][c]!=0){
            return false;
        }


        else if (r>0 && grid[r - 1][c] == 0) { //if above is clear
            if(getPath(r - 1, c, path, grid)){ // if above returns true
                return true;
            }
            else if (c>0 && grid[r][c - 1] == 0) { // if left side is clear                                                 //leads to dead end
                return getPath(r, c - 1, path, grid); //move left
            }
        }


        else if (c>0 && grid[r][c - 1] == 0) { //if left side is clear
            if(getPath(r, c - 1, path, grid)){ // if left returns true
                return true;
            }
            else if (r>0 && grid[r - 1][c] == 0) {// if up is clear                                                    //leads to dead end
                return (getPath(r - 1, c, path, grid)); // move up
            }
        }


        else if (grid[r][c - 1] == 1 && grid[r - 1][c] == 1) { //dead end
            path.clear();
            return false;
        }


        return false;
    }
}



class Point {
    int x;
    int y;

    Point (int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

