import java.util.HashMap;
import java.util.Map;

public class CoptoAnotherHashMapUsingputAll {

    public static void main(String[] args) {

        Map<String , Integer> original_Map = new HashMap<>();
        original_Map.put("Rahul" ,1);
        original_Map.put("Rohit",2);
        original_Map.put("chhotu",3);

        System.out.println("Original map : => "+ original_Map);

        Map<String , Integer> Duplicate_Map = copyHashMap(original_Map);
        System.out.println("second map : => "+ Duplicate_Map);


    }
    public  static  Map<String,Integer> copyHashMap(Map<String,Integer> original_Map){

        Map<String , Integer> second_Map = new HashMap<>();
        second_Map.putAll(original_Map);
        return  second_Map;

    }

}
