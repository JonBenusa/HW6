import java.util.*;
/**
 * CISC 380
 * Algorithms Assignment 6
 *
 * Driver File for the ColoredGraph class.
 *
 *  This driver file contains two example test case to get you started.
 *  You should include more test cases to ensure that your implemenetation works correctly.
 *  You do NOT need to submit this file.
 * @author YOUR NAME HERE
 * Due Date: xx/xx/xx
 */



public class GraphDriver{



    /**
     * Creates a colored graph with a cycle. There are two valid colored paths from start = 0 to t = 7.
     * The shortest path has a distance of 3: (0, 3, 4, 7).
     * The other path has a distance of 6: (0, 3, 5, 6, 8, 9, 7).
     */
    public static ColoredGraph twoValidPaths(){

        int[][] list =
                {
                        {1, 3},
                        {0, 2},
                        {1},
                        {0, 4, 5},
                        {3, 7},
                        {3, 6},
                        {5, 8},
                        {4, 9},
                        {6, 9},
                        {8, 7}

                };
        String[][] colors =
                {
                        {"blue", "red"},
                        {"blue", "yellow"},
                        {"yellow"},
                        {"red", "yellow", "yellow"},
                        {"yellow", "blue"},
                        {"yellow", "blue"},
                        {"blue", "red"},
                        {"blue", "blue"},
                        {"red", "yellow"},
                        {"yellow", "blue"}
                };
        return new ColoredGraph(list, colors);
    }

    /**
     * Creates a colored graph. There is one valid colored path from start = 0 to t = 7.
     * The path has a distance of 3: (0, 3, 4, 7).
     */
    public static ColoredGraph oneValidPath(){
        int[][] list =
                {
                        {1, 3},
                        {0, 2},
                        {1},
                        {0, 4},
                        {3, 7},
                        {},
                        {},
                        {4}
                };
        String[][] colors =
                {
                        {"blue", "red"},
                        {"blue", "yellow"},
                        {"yellow"},
                        {"red", "yellow"},
                        {"yellow", "blue"},
                        {},
                        {},
                        {"blue"}
                };
        return new ColoredGraph(list, colors);
    }


    public static void main(String[] args){

        ColoredGraph oneValidPath = GraphDriver.oneValidPath();
        ColoredGraph twoValidPaths = GraphDriver.twoValidPaths();

        System.out.println("Graph Representation: \n" + oneValidPath.toString());
        System.out.println(oneValidPath.coloredMaze(0, 7));
        System.out.println(Arrays.toString(oneValidPath.getSolution(0, 7)));
        System.out.println("Graph Representation: \n" + twoValidPaths.toString());
        System.out.println(twoValidPaths.coloredMaze(0, 7));
        System.out.println(Arrays.toString(twoValidPaths.getSolution(0, 7)));


    }//main



}//class