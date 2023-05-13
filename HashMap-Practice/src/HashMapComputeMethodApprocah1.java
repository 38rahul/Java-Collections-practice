import java.util.HashMap;
import java.util.Map;

public class HashMapComputeMethodApprocah1 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Name", "Rahul");
        map.put("Address", "Aurangabad");

        System.out.println("Map: "+ map);

        // re-map the value using compute() method

        map.compute("Name",(k,v) -> v.concat(" Rajput"));
        map.compute("Address",(k1,v1)->v1.concat(", Bihar"));

        System.out.println("After Updating the values using compute() method: "+ map);
    }
}
