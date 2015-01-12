import jdk.nashorn.internal.runtime.regexp.RegExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
 если количество дней с начала года - нечетное число,
 иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {

    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        line = line.substring(0,1).toUpperCase() + line.substring(1).toLowerCase();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        Date month = null;

        try
        {
            month = simpleDateFormat.parse(line);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        System.out.println("«" + line + " is " + (month.getMonth() + 1) + " month».");
    }

}