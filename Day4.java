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
        
        // for (int i = 0; i < inputList.length; i++){
        //     System.out.println(Arrays.toString(inputList[i]));
        // }

        
    }
}