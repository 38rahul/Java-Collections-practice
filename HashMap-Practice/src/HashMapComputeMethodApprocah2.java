import java.util.HashMap;
import java.util.Map;

public class HashMapComputeMethodApprocah2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 12);
        map.put("Key2", 15);
        map.put("key3",null);
        map.put("key4",97);

        System.out.println("Before compute method: "+ map);

        map.compute("Key1", (a,b)-> (b==null)? 1 : b+1);
        map.compute("Key2",(a1,b1)-> (b1==null) ? 1 : b1+5);
        map.compute("Key3",(k,v)->(v==null)? 1: v+97);
        map.compute("Key4",(k,v)->(v==null) ? 5 : v+3);

        System.out.println("After compute method: "+ map);

    }
}
