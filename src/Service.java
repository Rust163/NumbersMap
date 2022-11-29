import java.util.*;
public class Service {
    private Map<String, Integer> hashMap = new LinkedHashMap<>();
    public void addNumbers(String string, Integer integer) {
        if (hashMap.containsKey(string)) {
            if (integer.equals(hashMap.get(string))) {
                throw new RuntimeException("ошибка добавления существующего объекта");
            }
        } else {
            hashMap.put(string, integer);
        }
    }
    public void printNumbers() {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("%s : %d%n", entry.getKey(), entry.getValue());
        }
    }
}
