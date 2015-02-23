import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class l08l10h1 {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            //list of addresses
            Map<String, String> location = new HashMap<String, String>();
            while (true) {
                String city = reader.readLine();
                if (city.isEmpty()) break;
                else {
                    String family = reader.readLine();
                    location.put(city, family);
                }
            }
            //read home number
            String town = reader.readLine();

            for (Map.Entry<String, String> entry : location.entrySet()) {
                if (entry.getKey().equals(town)) System.out.println(entry.getValue());
            }
        }
}