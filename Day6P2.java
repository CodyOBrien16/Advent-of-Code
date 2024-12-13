import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


// create a function that has a parameter of the map and goes through until it reaches the edges of the map. If it moves over 10k times return true otherwise retrun false
// have a for loop that iterates through every spot on the map and replaces it with a # then calls the method with that new list as input.
// If the function returns true (it creates infinite loop) add that spot to a list then replace the # back to a "."


public class Day6P2 {
    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<String>();

        // try {
        // File myObj = new File("input2.6.txt");
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

        dataList.add("....#.....");
        dataList.add(".........#");
        dataList.add("..........");
        dataList.add("..#.......");
        dataList.add(".......#..");
        dataList.add("..........");
        dataList.add(".#..^.....");
        dataList.add("........#.");
        dataList.add("#.........");
        dataList.add("......#...");


        char[][] inputList = new char[dataList.size()][dataList.get(0).length()];
        for (int i = 0; i < dataList.size(); i++) {
            for (int j = 0; j < dataList.get(i).length(); j++) {
                inputList[i][j] = dataList.get(i).charAt(j);
            }
        }

        int count = 0;
        for (int i = 0; i < inputList.length; i++) {
            for (int j = 0; j < inputList[i].length; j++) {
                if (inputList[i][j] == '.') {
                    inputList[i][j] = '#';
                    if (completeMaze(inputList)) {
                        count += 1;
                    }
                    inputList[i][j] ='.';
                }
            }
        }
        System.out.println(count);
    }

    public static boolean completeMaze(char[][] inputList) {
        int currentX = 0;
        int currentY = 0;
        String direction = "North";
        //find cursor
        for (int i = 0; i < inputList.length; i++) {
            for (int j = 0; j < inputList[i].length; j++) {
                if (inputList[i][j] == '^') {
                    currentY = i;
                    currentX = j;
                }
            }
        }


        int moved = 0;
        while (currentX > 0 && currentX < inputList[0].length-1 && currentY > 0 && currentY < inputList.length-1) {
            if (direction.equals("North")) {
                if (inputList[currentY-1][currentX] != '#') {
                    currentY = currentY - 1;
                    moved += 1;
                    
                } else if (inputList[currentY-1][currentX] == '#') {
                    direction = "East";
                }
                
            } else if (direction.equals("East")){
                if (inputList[currentY][currentX+1] != '#') {
                    currentX += 1;
                    moved += 1;

                } else if (inputList[currentY][currentX+1] == '#') {
                    direction = "South";
                }

            } else if (direction.equals("South")){
                if (inputList[currentY+1][currentX] != '#') {
                    currentY += 1;
                    moved += 1;
                    
                } else if (inputList[currentY+1][currentX] == '#') {
                    direction = "West";
                }

            } else if (direction.equals("West")){
                if (inputList[currentY][currentX-1] != '#') {
                    currentX -= 1;
                    moved += 1;

                } else if (inputList[currentY][currentX-1] == '#') {
                    direction = "North";
                }
            } 
            if (moved > 10000) {
                return false; 
            }
        }
        return true;


        }

}
