import java.util.HashMap;
import java.util.Map;

public class HashMapClearMethod1 {
    public static void main(String[] args) {

        Map<Integer,String > hash_Map = new HashMap<>();
        hash_Map.put(10,"Geeks");
        hash_Map.put(15,"10");
        hash_Map.put(20,"Geeks");
        hash_Map.put(25,"welcomes");
        hash_Map.put(30,"You");

        System.out.println("HashMap before clear method: "+hash_Map);
        hash_Map.clear();

        System.out.println("HashMap After clear method: "+hash_Map);

        System.out.println("program 2nd where chamging key values data type");

        Map<String,Integer> hash_Map2 = new HashMap<>();
        hash_Map2.put("Geeks",10);
        hash_Map2.put("4",15);
        hash_Map2.put("Geeks",20);
        hash_Map2.put("welcomes",25);
        hash_Map2.put("you",30);


        System.out.println("HashMap2 before clear method: "+hash_Map2);
        hash_Map2.clear();

        System.out.println("HashMap2 After clear method: "+hash_Map2);


    }
}
