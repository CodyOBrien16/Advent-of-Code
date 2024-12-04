import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day4 {

    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<String>();

        // try {
        // File myObj = new File("input2.4.txt");
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

        // dataList.add("MMMSXXMASM");
        // dataList.add("MSAMXMSMSA");
        // dataList.add("AMXSXMAAMM");
        // dataList.add("MSAMASMSMX");
        // dataList.add("XMASAMXAMM");
        // dataList.add("XXAMMXXAMA");
        // dataList.add("SMSMSASXSS");
        // dataList.add("SAXAMASAAA");
        // dataList.add("MAMMMXMMMM");
        // dataList.add("MXMXAXMASX");


        char[][] inputList = new char[dataList.size()][dataList.get(0).length()];
        for (int i = 0; i < dataList.size(); i++) {
            for (int j = 0; j < dataList.get(i).length(); j++) {
                inputList[i][j] = dataList.get(i).charAt(j);
            }
        }
        
        for (char[] item : inputList) {
            System.out.println(Arrays.toString(item));
        }
        

        // int total = 0;
        // int length = inputList.length;
        // int width = inputList[0].length;
        // for (int i = 0; i < inputList.length; i++){
        //     for (int j = 0; j < inputList[i].length; j++) {
        //         if (inputList[i][j] == 'X') {
        //             //check if can look right
        //             if (j <= width-4 && j >= 0) {
        //                 //System.out.println("right");
        //                 if(inputList[i][j+1] == 'M' && inputList[i][j+2] == 'A' && inputList[i][j+3] == 'S') {
        //                     System.out.println("Found right");
        //                     total += 1;
        //                 }
        //             }

        //             // check if can look left
        //             if (j >= 3 && j <= width-1) {
        //                 //System.out.println("left");
        //                 if(inputList[i][j-1] == 'M' && inputList[i][j-2] == 'A' && inputList[i][j-3] == 'S') {
        //                     System.out.println("Found left");
        //                     total += 1;
        //                 }
        //             }

        //             // check if can look up
        //             if (i >= 3 && i <= length-1) {
        //                 //System.out.println("up");
        //                 if(inputList[i-1][j] == 'M' && inputList[i-2][j] == 'A' && inputList[i-3][j] == 'S') {
        //                     System.out.println("Found up");
        //                     total += 1;
        //                 }
        //             }

        //             // check if can look down
        //             if (i <= length-4 && i >= 0) {
        //                 //System.out.println("down");
        //                 if(inputList[i+1][j] == 'M' && inputList[i+2][j] == 'A' && inputList[i+3][j] == 'S') {
        //                     System.out.println("Found down");
        //                     total += 1;
        //                 }
        //             }

        //             // check if can look diagonal up/right
        //             if (j <= width-4 && j >= 0 && i >= 3 && i <= length-1) {
        //                 if(inputList[i-1][j+1] == 'M' && inputList[i-2][j+2] == 'A' && inputList[i-3][j+3] == 'S') {
        //                     System.out.println("Found up/right");
        //                     total += 1;
        //                 }
        //             }


        //             // check if can look diagonal down/right
        //             if (i <= length-4 && i >= 0 && j <= width-4 && j >= 0) {
        //                 if(inputList[i+1][j+1] == 'M' && inputList[i+2][j+2] == 'A' && inputList[i+3][j+3] == 'S') {
        //                     total += 1;
        //                     System.out.println("Found down/right");
        //                 }
        //             }

        //             // check if can look diagonal down/left
        //             if (i <= length-4 && i >= 0 && j >= 3 && j <= width-1) {
        //                 if(inputList[i+1][j-1] == 'M' && inputList[i+2][j-2] == 'A' && inputList[i+3][j-3] == 'S') {
        //                     total += 1;
        //                     System.out.println("Found down/left");
        //                 }
        //             }

        //             // check if can look diagonal up/left
        //             if (i >= 3 && i <= length-1 && j >= 3 && j <= width-1) {
        //                 if(inputList[i-1][j-1] == 'M' && inputList[i-2][j-2] == 'A' && inputList[i-3][j-3] == 'S') {
        //                     total += 1;
        //                     System.out.println("Found up/left");
        //                 }
        //             }

        //         }
        //     }
        // }
        // System.out.println(total);

        
        int total = 0;
        int length = inputList.length;
        int width = inputList[0].length;
        for (int i = 0; i < inputList.length; i++){
            for (int j = 0; j < inputList[i].length; j++) {
                if (inputList[i][j] == 'A') {
                    if (i != 0 && i != inputList.length-1 && j != 0 && j != inputList[i].length-1) {
                        
                    }
            }
        }
        System.out.println(total);


    }
}