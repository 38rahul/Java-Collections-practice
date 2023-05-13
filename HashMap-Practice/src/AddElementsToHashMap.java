import java.util.HashMap;
import java.util.Map;

public class AddElementsToHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1,"geeks");
        hm1.put(2,"suny");
        hm1.put(3,"ravi");

        System.out.println(hm1);
        for (Map.Entry<Integer,String> entry: hm1.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
