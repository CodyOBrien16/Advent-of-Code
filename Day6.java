import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<String>();

        try {
        File myObj = new File("input2.6.txt");
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

        // dataList.add("....#.....");
        // dataList.add(".........#");
        // dataList.add("..........");
        // dataList.add("..#.......");
        // dataList.add(".......#..");
        // dataList.add("..........");
        // dataList.add(".#..^.....");
        // dataList.add("........#.");
        // dataList.add("#.........");
        // dataList.add("......#...");


        char[][] inputList = new char[dataList.size()][dataList.get(0).length()];
        for (int i = 0; i < dataList.size(); i++) {
            for (int j = 0; j < dataList.get(i).length(); j++) {
                inputList[i][j] = dataList.get(i).charAt(j);
            }
        }
        
        for (char[] item : inputList) {
            System.out.println(Arrays.toString(item));
        }

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

        ArrayList<String> positionsBeen = new ArrayList<>();
        String temp = Integer.toString(currentY) + Integer.toString(currentX);
        positionsBeen.add(temp);

        // Fix logic to not add if its a duplicate

        //check spot above cursor
        while (currentX > 0 && currentX < inputList[0].length-1 && currentY > 0 && currentY < inputList.length-1) {
            if (direction.equals("North")) {
                if (inputList[currentY-1][currentX] != '#') {
                    currentY = currentY - 1;
                    String temp2 = Integer.toString(currentY) + Integer.toString(currentX);
                    if (!positionsBeen.contains(temp2)) {
                        positionsBeen.add(temp2);
                    }
                    
                } else if (inputList[currentY-1][currentX] == '#') {
                    direction = "East";
                }
                
            } else if (direction.equals("East")){
                if (inputList[currentY][currentX+1] != '#') {
                    currentX += 1;
                    String temp3 = Integer.toString(currentY) + Integer.toString(currentX);
                    if (!positionsBeen.contains(temp3)) {
                        positionsBeen.add(temp3);
                    }
                } else if (inputList[currentY][currentX+1] == '#') {
                    direction = "South";
                }

            } else if (direction.equals("South")){
                if (inputList[currentY+1][currentX] != '#') {
                    currentY += 1;
                    String temp4 = Integer.toString(currentY) + Integer.toString(currentX);
                    if (!positionsBeen.contains(temp4)) {
                        positionsBeen.add(temp4);
                    }
                } else if (inputList[currentY+1][currentX] == '#') {
                    direction = "West";
                }

            } else if (direction.equals("West")){
                if (inputList[currentY][currentX-1] != '#') {
                    currentX -= 1;
                    String temp5 = Integer.toString(currentY) + Integer.toString(currentX);
                    if (!positionsBeen.contains(temp5)) {
                        positionsBeen.add(temp5);
                    }
                } else if (inputList[currentY][currentX-1] == '#') {
                    direction = "North";
                }
            } 
        }

        System.out.println(positionsBeen.size());

    }
}
