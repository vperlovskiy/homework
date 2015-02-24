import java.io.*;

/**
 * Created by volodya on 25.02.15.
 */
public class l09l11b01 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        int count = -1;
        int i;

        do {
            i = fileInputStream.read();
            if (i != -1)
                fileOutputStream.write(i);
                count++;

        } while (i != -1) ;

        System.out.println("Скопировано байт " + count);
        fileInputStream.close();
        fileOutputStream.close();
    }
}
