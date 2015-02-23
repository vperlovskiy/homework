import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by volodya on 23.02.15.
 */
public class lev09l11h04 {

    public static void main(String[] args) throws Exception {

        SimpleDateFormat oldFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        SimpleDateFormat newFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Date date = null;
        try {
            date = oldFormat.parse(br.readLine());
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newFormat.format(date).toUpperCase());

    }
}
