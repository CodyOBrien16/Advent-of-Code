import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.regex.*;;

public class Day3 {
    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<String>();

        try {
        File myObj = new File("input2.3.txt");
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


        //String input = dataList.get(0);
        String input = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";

        String regex = "mul\\(\\d{1,3},\\d{1,3}\\)";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        ArrayList<String> matches = new ArrayList<>();

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        for (String item: matches) {
            System.out.println(item);
        }


    }
}
