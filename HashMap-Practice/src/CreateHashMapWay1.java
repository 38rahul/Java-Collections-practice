import java.util.HashMap;

public class CreateHashMapWay1 {
    public static void main(String[] args) {

        // Ways 1
        HashMap<Integer, String > hm1 = new HashMap<>();
        hm1.put(1,"xyz");
        hm1.put(2,"abc");
        hm1.put(3,"pqr");
        System.out.println(hm1);

        // Ways 2, specify the size
        HashMap<Integer, String > hm2 = new HashMap<>(10);
        hm2.put(1,"Geeks");
        hm2.put(2,"Geeks");
        hm2.put(3,"Geeks");

        hm2.put(2,"For");
        System.out.println(hm2);



    }
}
