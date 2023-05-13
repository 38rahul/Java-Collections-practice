import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("vishal",1);
        map.put("Sachin",2);
        map.put("Rahul",3);
        System.out.println("size of HashMap: "+map .size());

        System.out.println(map);
        if (map.containsKey("vishal")){
            Integer a = map.get("vishal");
            System.out.println("value of key"+"\"vishal\" is: -> "+a);
        }


    }
}
