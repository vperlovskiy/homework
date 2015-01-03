import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/
public class l8l8 {

    public class Solution
    {
        public void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            String[] arr = s.split("");

            //Напишите тут ваш код
            if(arr[0].matches("\\p{L}")) {
                arr[0] = arr[0].toUpperCase();
            }
            for (int i = 1; i < arr.length; i++) {

                if (arr[i -1].matches("[\\s]"))
                    arr[i] = arr[i].toUpperCase();

            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }


    }


}
