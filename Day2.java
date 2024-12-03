import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<String>();

        try {
        File myObj = new File("input2.2.txt");
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

        // dataList.add("7 6 4 2 1");
        // dataList.add("1 2 7 8 9");
        // dataList.add("9 7 6 2 1");
        // dataList.add("1 3 2 4 5");
        // dataList.add("8 6 4 4 1");
        // dataList.add("1 3 6 7 9");



        int totalSafe = 0;
        for (String items : dataList) {
            String[] itemList = items.split(" ");
            boolean safe = isSafe(itemList);
            
            if (safe) {
                //System.out.println(items);
                totalSafe++;
            } else {
                // add to this so that we can see the unsafe items become safe if you remove an item.
                if (isSafe2(itemList)) {
                    totalSafe++;
                }
            }


        }
        System.out.println("Total Safe: " + totalSafe);

    }

    public static boolean isSafe(String[] itemList){
        boolean safe = false;
        boolean positive = false;
        boolean negative= false;
        for (int i = 1; i < itemList.length; i++) {
            if (Integer.parseInt(itemList[i]) - Integer.parseInt(itemList[i-1]) == 1 || Integer.parseInt(itemList[i]) - Integer.parseInt(itemList[i-1]) == 2 || Integer.parseInt(itemList[i]) - Integer.parseInt(itemList[i-1]) == 3) {
                if (negative == false) {
                    safe = true;
                    positive = true;
                } else {
                    safe = false;
                    break;
                }
            } else if (Integer.parseInt(itemList[i]) - Integer.parseInt(itemList[i-1]) == -1 || Integer.parseInt(itemList[i]) - Integer.parseInt(itemList[i-1]) == -2 || Integer.parseInt(itemList[i]) - Integer.parseInt(itemList[i-1]) == -3) {
                if (positive == false) {
                    safe = true;
                    negative = true;
                } else {
                    safe = false;
                    break;
                }
                
            } else {
                safe = false;
                break;
            }
            
        }
        return safe;
    }

    public static boolean isSafe2(String[] itemList){
        boolean safe = false;
        for (int i = 0; i < itemList.length; i++) {

            //figure out if it is safe if we remove any 1 item out of the list
            // possible brute force where you remove one item at a time and check if it is safe for each list
            // create a temp String[] that has all the same items in itemList besides itemList[i] so if i = 0 then temp list will have all the items besides the first item
            // then check if the temp list is safe
            String[] temp = new String[itemList.length - 1];
            int index = 0;
            for (int j = 0; j < itemList.length; j++) {
                if (j != i) {
                    temp[index] = itemList[j];
                    index++;
                }
            }
            safe = isSafe(temp);
            if (safe) {
                return safe;
            }




            
        }
        return safe;
    }
}
