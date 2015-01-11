import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by volodya on 11.01.15.
 */
public class l8l11h9 {
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);
        Date curDate = null;
        try
        {
            curDate = simpleDateFormat.parse(date);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        Date newYearDate = new Date(curDate.getYear(),0,0);
        long msTime = curDate.getTime() - newYearDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int days = (int)(msTime/msDay);

        return days % 2 != 0;
    }
}
