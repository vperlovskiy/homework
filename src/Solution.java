import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by vvp on 30.12.2014.
 */
public class Solution {


        public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();

            //Напишите тут ваш код

            StringBuilder res = new StringBuilder(s.length());
            String[] elements = s.split("[\\s\\xA0]+");



            for (int i = 0; i < elements.length; i++)
            {
                if (i > 0){
                    res.append(" ");
                    res.append(Character.toUpperCase(elements[i].charAt(0))).append(
                            elements[i].substring(1));
                }
                System.out.println(res);
            }
        }

 }

