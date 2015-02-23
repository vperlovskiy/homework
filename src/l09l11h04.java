import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by volodya on 23.02.15.
 */
public class l09l11h04 {

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //add your code here
        ArrayList<Integer> listOfNums = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {

                int num = scanner.nextInt();
                listOfNums.add(num);
            }
        } catch (Exception e) {
            for (Integer n : listOfNums)
                System.out.println(n);

        }
    }
}
