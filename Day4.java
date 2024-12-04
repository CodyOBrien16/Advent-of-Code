import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day4 {

    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<String>();

        // try {
        // File myObj = new File("input2.3.txt");
        // Scanner myReader = new Scanner(myObj);
        // while (myReader.hasNextLine()) {
        //     String data = myReader.nextLine();
        //     dataList.add(data);
        // }
        // myReader.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }

        dataList.add("MMMSXXMASM");
        dataList.add("MSAMXMSMSA");
        dataList.add("AMXSXMAAMM");
        dataList.add("MSAMASMSMX");
        dataList.add("XMASAMXAMM");
        dataList.add("XXAMMXXAMA");
        dataList.add("SMSMSASXSS");
        dataList.add("SAXAMASAAA");
        dataList.add("MAMMMXMMMM");
        dataList.add("MXMXAXMASX");

        char[][] inputList = new char[dataList.size()][dataList.get(0).length()];
        for (int i = 0; i < dataList.size(); i++) {
            for (int j = 0; j < dataList.get(i).length(); j++) {
                inputList[i][j] = dataList.get(i).charAt(j);
            }
        }
        
        for (char[] item : inputList) {
            System.out.println(Arrays.toString(item));
        }

        int length = inputList.length;
        int width = inputList[0].length;
        for (int i = 0; i < inputList.length; i++){
            for (int j = 0; j < inputList[i].length; j++) {
                if (inputList[i][j] == 'X') {
                    //check if can look right
                    if (j < width-4 && j > 0) {
                        //add logic
                    }

                    // check if can look left
                    if (j > 3 && j < width-1) {

                    }

                    // check if can look up
                    if (i > 3 && i < length-1) {

                    }

                    // check if can look down
                    if (i < length-4 && i > 0) {

                    }

                    // check if can look diagonal up/right
                    if (j < width-4 && j > 0 && i > 3 && i < length-1) {

                    }


                    // check if can look diagonal down/right
                    if (i < length-4 && i > 0 && j < width-4 && j > 0) {

                    }

                    // check if can look diagonal down/left
                    if (i < length-4 && i > 0 && j > 3 && j < width-1) {

                    }

                    // check if can look diagonal up/left
                    if (i > 3 && i < length-1 && j > 3 && j < width-1) {

                    }

                }
            }
        }

        
    }
}