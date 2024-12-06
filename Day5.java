import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<String>();

        try {
        File myObj = new File("input2.5.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            dataList.add(data);
        }
        myReader.close();
        } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }

        // dataList.add("47|53");
        // dataList.add("97|13");
        // dataList.add("97|61");
        // dataList.add("97|47");
        // dataList.add("75|29");
        // dataList.add("61|13");
        // dataList.add("75|53");
        // dataList.add("29|13");
        // dataList.add("97|29");
        // dataList.add("53|29");
        // dataList.add("61|53");
        // dataList.add("97|53");
        // dataList.add("61|29");
        // dataList.add("47|13");
        // dataList.add("75|47");
        // dataList.add("97|75");
        // dataList.add("47|61");
        // dataList.add("75|61");
        // dataList.add("47|29");
        // dataList.add("75|13");
        // dataList.add("53|13");
        // dataList.add(" ");
        // dataList.add("75,47,61,53,29");
        // dataList.add("97,61,53,29,13");
        // dataList.add("75,29,13");
        // dataList.add("75,97,47,61,53");
        // dataList.add("61,13,29");
        // dataList.add("97,13,75,29,47");


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

            //System.out.println(patternList.get(i));
            String temp = patternList.get(i);
            temp = temp.replace('|', ',');
            String[] temp2 = temp.split(",");
            //System.out.println(temp);
            //System.out.println(Arrays.toString(temp2));
            patternList2[i][0] = temp2[0];
            patternList2[i][1] = temp2[1];
        }

        // for (String[] item : patternList2) {
        //     System.out.println(Arrays.toString(item));
        // }

        //get updateList into a list of numbers

        ArrayList<String> finalList = new ArrayList<>();
        //go through each update list
        for (int i = 0; i < updateList.size(); i++) {
            String currentList = updateList.get(i);
            boolean correctOrder = false;
            //System.out.println(Arrays.toString(currentList));

            //sort through patterns to find matches
            for (int j = 0; j < patternList2.length; j++) {
                if (currentList.contains(patternList2[j][0]) && currentList.contains(patternList2[j][1])) {
                    //add logic to check here
                    int leftIndex = currentList.indexOf(patternList2[j][0]);
                    int rightIndex = currentList.indexOf(patternList2[j][1]);
                    if (leftIndex < rightIndex) {
                        correctOrder = true;
                    } else {
                        correctOrder = false;
                        break;
                    }
                }
            }
            if (correctOrder) {
                finalList.add(currentList);
            }
        }
        int[] finalTotalList = new int[finalList.size()];
        // for (String item : finalList) {
        for (int i = 0; i < finalList.size(); i++) {
            String[] temp = finalList.get(i).split(",");
            if (temp.length % 2 == 0) { //even
                finalTotalList[i] = Integer.parseInt(temp[((temp.length) / 2)-1]);
            } else if (temp.length % 2 == 1) {
                int temp3 = Math.round((temp.length) / 2);
                finalTotalList[i] = Integer.parseInt(temp[temp3]);
            }
        }
        int theFinalTotal = 0;
        for (int item : finalTotalList) {
            theFinalTotal += item;
        }
        System.out.println(theFinalTotal);

    }
}
