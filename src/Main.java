import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "str1");
        map.put(2, "str2");
        map.put(3, "str3");
        map.put(4, "str4");
        map.put(5, "str5");
        map.put(6, "str6");
        map.put(7, "str7");
        map.put(8, "str8");
        map.put(9, "str9");
        map.put(10, "str10");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("%d : %s%n", entry.getKey(), entry.getValue());
        }




    }
}