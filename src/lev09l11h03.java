import java.util.ArrayList;
import java.util.Scanner;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все
введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода
*/

public class lev09l11h03 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //add your code here
        ArrayList<Integer> listOfNums = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        try{
            while (true){

                int num = scanner.nextInt();
                listOfNums.add(num);
            }
        }catch (Exception e){
            for (Integer n : listOfNums)
                System.out.println(n);

        }
    }
}
