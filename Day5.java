import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day5 {
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
        dataList.add(" ");
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
            if (item == " ") {
                part2 = true;
            }
            else if (part2 == false) {
                patternList.add(item);
            } else if (part2 == true) {
                updateList.add(item);
            }
        }

        // for (String item : updateList) {
        //     System.out.println(item);
        // }

        String[][] patternList2 = new String[patternList.size()][2];

        for (int i = 0; i < patternList.size(); i++) {
            // get all the inputs into a list of lists

            System.out.println(patternList.get(i));
            //String temp = patternList.get(i).split("|");
            System.out.println(patternList.get(i).split("|"));
            // patternList2[i][0] = temp[0];
            // patternList2[i][1] = temp[1];
        }

        // for (String[] item : patternList2) {
        //     System.out.println(Arrays.toString(item));
        // }

        //get updateList into a list of numbers


        //go through each update list
        for (int i = 0; i < updateList.size(); i++) {
            currentList = updateList.get(i).split(",");

            //sort through patterns to find matches
            for (int j = 0; j < patternList2.length; j++) {
                if (currentList.contains(patternList2[i][0]) && currentList.contains(patternList2[i][1])) {
                    //logic to check if the order is correct
                }
            }
        }



    }
}
