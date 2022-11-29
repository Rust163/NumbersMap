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

        Service mapIntegers = new Service();

        mapIntegers.addNumbers("map1", 1);
        mapIntegers.addNumbers("map2", 2);
        mapIntegers.addNumbers("map3", 3);
        mapIntegers.addNumbers("map4", 4);
        mapIntegers.addNumbers("map5", 5);
        mapIntegers.addNumbers("map6", 6);
        mapIntegers.addNumbers("map7", 7);
        mapIntegers.addNumbers("map8", 8);
        mapIntegers.addNumbers("map9", 9);
//        mapIntegers.addNumbers("map9", 9);

        mapIntegers.printNumbers();


    }
}