import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by volodya on 05.01.15.
 */
public class l8l11h8 {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        //Напишите тут ваш код

        for (int i = 1; i < array.length ; i++) {

            for (int j = 0; j < array.length; j++) {

                int temp;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

    }
}
