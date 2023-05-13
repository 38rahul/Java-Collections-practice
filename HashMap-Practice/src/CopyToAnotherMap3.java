import java.util.HashMap;

public class CopyToAnotherMap3 {

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("ram",1);
        map1.put("shayam",2);
        map1.put("dhanshayam",3);


        HashMap<String, Integer> map2 = map1;

        System.out.println("Original Map: "+map1);
        System.out.println("Copied  Map: "+map2);


    }
}
