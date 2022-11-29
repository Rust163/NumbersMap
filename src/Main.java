import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String ,Integer> map = new LinkedHashMap<>();

        map.put("str1" ,1);
        map.put("str2" ,2);
        map.put("str3" ,3);
        map.put("str4" ,4);
        map.put("str5" ,5);
        map.put("str6" ,6);
        map.put("str7" ,7);
        map.put("str8" ,8);
        map.put("str9" ,9);
        map.put("str10" ,10);

        for (Map.Entry<String ,Integer>entry :  map.entrySet()) {
            System.out.printf("%d : %s%n", entry.getValue(), entry.getKey());
        }
    }
}