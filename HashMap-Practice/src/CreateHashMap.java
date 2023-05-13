import java.sql.SQLOutput;
import java.util.HashMap;

public class CreateHashMap {
    public static void main(String[] args) {

        HashMap<String , Integer> map1 = new HashMap<>();
        map1.put("john",25);
        map1.put("jane",35);
        map1.put("jim",30);

        System.out.println(map1.get("josn"));
        map1.remove("john");
        System.out.println(map1);
        System.out.println(map1.containsKey("john"));
        System.out.println(map1.containsKey("jim"));

        // Get the size

        System.out.println(map1.size());

        map1.put("rahul",40);
        System.out.println(map1);
    }
}
