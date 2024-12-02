import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class Day1 {
    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<String>();

        File file = new File("input2.1.txt");

        try {

            Scanner sc = new Scanner(file);
    
            while (sc.hasNextLine()) {
                dataList.add(sc.nextLine());
            }
            sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // dataList.add("3   4");
        // dataList.add("4   3");
        // dataList.add("2   5");
        // dataList.add("1   3");
        // dataList.add("3   9");
        // dataList.add("3   3");

        ArrayList<String> leftList = new ArrayList<>();
        ArrayList<String> rightList = new ArrayList<>();
        
        for (String item : dataList) {
            String[] items = item.split("   ");
            leftList.add(items[0]);
            rightList.add(items[1]);
        }

        // leftList.sort(null);
        // rightList.sort(null);

        // int temp;
        // int[] sumList = new int[leftList.size()];
        // for (int i = 0; i < leftList.size(); i++) {
        //     //System.out.println(Integer.parseInt(leftList.get(i)) - Integer.parseInt(rightList.get(i)));
        //     if (Integer.parseInt(leftList.get(i)) - Integer.parseInt(rightList.get(i)) > 0) {
        //         sumList[i] = Integer.parseInt(leftList.get(i)) - Integer.parseInt(rightList.get(i));
        //     } else {
        //         temp = (Integer.parseInt(leftList.get(i)) - Integer.parseInt(rightList.get(i)));
        //         sumList[i] = (temp * -1);
        //     }
        // }

        // int total = 0;
        // for (int num : sumList) {
        //     total = total + num;
        // }
        // System.out.println(total);

        int[] sumList = new int[leftList.size()];
        int tempTotal = 0;
        String tempLeftNum;
        for (int i = 0; i < leftList.size(); i++) {
            tempTotal = 0;
            tempLeftNum = leftList.get(i);
            for (int j = 0; j < rightList.size(); j++) {
                if (tempLeftNum.equals(rightList.get(j))) {
                    tempTotal += 1;
                }
            }
            sumList[i] = Integer.parseInt(tempLeftNum) * tempTotal;
        }

        int total = 0;
        for (int num : sumList) {
            System.out.println(num);
            total = total + num;
        }
        System.out.println(total);

    }
}