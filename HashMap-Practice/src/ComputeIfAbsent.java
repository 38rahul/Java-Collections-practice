import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsent {
    public static void main(String[] args) {

        Map<String , Integer> map = new HashMap<>();
        map.put("key1",10000);
        map.put("key2",20000);
        map.put("key3",30000);
        map.put("key4",40000);

        System.out.println(map);
        System.out.println("printing with ToString()=> "+map.toString());

        map.computeIfAbsent("key5", k->50000);

        System.out.println("After ComputeIfAbsent=> "+map.toString());
        map.computeIfAbsent("key6",k->60000);
        System.out.println(map.toString());

        map.put("key7",null);
        System.out.println(map.toString());
        map.computeIfAbsent("key7",k->80000);

        System.out.println(map.toString());

        map.computeIfAbsent("key7",k->88000);

        System.out.println(map.toString());


        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(10, "Aman");
        map2.put(20, "Suraj");
        map2.put(30, "Harsh");

        System.out.println("HashMap: "+map2.toString());
        map2.computeIfAbsent(10,k -> "rahul");
        map2.computeIfAbsent(40,k->"rohit Raj");

        System.out.println("After computeIfPresent: "+map2.toString());

        map2.put( 90,null);
        map2.computeIfAbsent(null,k->"maheep");

        System.out.println(map2.toString());
    }
}
