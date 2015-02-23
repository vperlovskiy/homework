import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by volodya on 23.02.15.
 */
public class l09l11h03 {

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //add your code here
        ArrayList<Integer> list = new ArrayList<Integer>();

        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true){
                int y = br.read();
                list.add(y);
            }
        }
        catch (IOException e)
        {
            for (int i = 0; i < list.size(); i++)
            {
                System.out.println(list.get(i));
            }
            e.printStackTrace();
        }
    }
}
