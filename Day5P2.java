import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day5P2 {
    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<String>();

        // try {
        // File myObj = new File("input2.5.txt");
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

        dataList.add("47|53");
        dataList.add("97|13");
        dataList.add("97|61");
        dataList.add("97|47");
        dataList.add("75|29");
        dataList.add("61|13");
        dataList.add("75|53");
        dataList.add("29|13");
        dataList.add("97|29");
        dataList.add("53|29");
        dataList.add("61|53");
        dataList.add("97|53");
        dataList.add("61|29");
        dataList.add("47|13");
        dataList.add("75|47");
        dataList.add("97|75");
        dataList.add("47|61");
        dataList.add("75|61");
        dataList.add("47|29");
        dataList.add("75|13");
        dataList.add("53|13");
        dataList.add("");
        dataList.add("75,47,61,53,29");
        dataList.add("97,61,53,29,13");
        dataList.add("75,29,13");
        dataList.add("75,97,47,61,53");
        dataList.add("61,13,29");
        dataList.add("97,13,75,29,47");


        ArrayList<String> patternList = new ArrayList<>();
        ArrayList<String> updateList = new ArrayList<>();
        boolean part2 = false;

        for (String item : dataList) {
            if (item.length() == 0) {
                part2 = true;
            }
            else if (part2 == false) {
                patternList.add(item);
            } else if (part2 == true) {
                updateList.add(item);
            }
        }

        // for (String item : patternList) {
        //     System.out.println(item);
        // }

        //create int[][] of patternList
        int[][] newPatternList = new int[patternList.size()][2];
        for (int i = 0; i < patternList.size(); i++) {
            String[] temp = patternList.get(i).replace("|",",").split(",");
            for (int j = 0; j < temp.length; j++) {
                newPatternList[i][j] = Integer.parseInt(temp[j]);
            }
        }


        // for (int[] item : newPatternList) {
        //     System.out.println(Arrays.toString(item));
        // }

        for (String item : updateList) {
            if (checkCorrect(newPatternList, item)) {
                System.out.println(item);
            }
            
        }



    }

    public static boolean checkCorrect(int[][] patternList, String currentUpdate) {
        String[] update = currentUpdate.split(",");
        for (int i = 0; i < patternList.length; i++) {
            
        }
        return false;
    }

}