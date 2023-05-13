import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoptoAnotherHashMap1 {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A",1);
        hashMap.put("B",2);
        hashMap.put("c",3);

        System.out.println("Original Map: ->"+ hashMap);

        Map<String, Integer> Second_Map = copMap(hashMap);
        System.out.println("Second Map: ->"+ Second_Map);


    }
    public  static Map<String, Integer>  copMap(Map<String, Integer> Original_Map){

        Map<String, Integer> second_Map = new HashMap<>();

        for (Map.Entry<String,Integer> entry: Original_Map.entrySet()){
            second_Map.put(entry.getKey(), entry.getValue());
        }
        return  second_Map;

    }
}
