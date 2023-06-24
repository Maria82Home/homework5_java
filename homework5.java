import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class homework5 {
    public static void main(String[] args) {
        HashMap<String, String> mp = new HashMap<>();
        mp.merge("David", "123", (o, n) -> o == null ? n : o + " " + n);
        mp.merge("Denis", "123", (o, n) -> o == null ? n : o + " " + n);
        mp.merge("Vadim", "123", (o, n) -> o == null ? n : o + " " + n);
        mp.merge("David", "234", (o, n) -> o == null ? n : o + " " + n);
        mp.merge("Denis", "345", (o, n) -> o == null ? n : o + " " + n);
        mp.merge("David", "345", (o, n) -> o == null ? n : o + " " + n);
        System.out.println(mp);
        ArrayList<String> list = new ArrayList<>();
        for (String i : mp.keySet()) {
            list.add(i);
        }

        Collections.sort(list, (o1, o2) -> mp.get(o2).length() - mp.get(o1).length());

        for (String i : list) {
            System.out.println(i + " " + mp.get(i));
        }
    }


}