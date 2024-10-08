package CollectionFrameWork.Map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("one",1);// adds elements into the map
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);
        numbers.put("five",5);
        numbers.put("six",6);
        numbers.put("seven",7);
        numbers.putIfAbsent("six",7);
        numbers.putIfAbsent("eight",10);// usually if one adds the same key with different value then it updates the existing value. To avoid that this function is used so if the key already exists it ignores
        numbers.remove("eight");// this removes the key value pair with key as given
        System.out.println(numbers);

        System.out.println(numbers.containsKey("six"));// checks whether the key is present in the map
        System.out.println(numbers.containsValue(10));// checks whether the value contains in the map

        for(Map.Entry<String,Integer> e : numbers.entrySet()){
            System.out.println(e);
        }

        for( String key: numbers.keySet()){
            System.out.println(key);
        }

        for(Integer value:numbers.values()){
            System.out.println(value);
        }
    }

}
