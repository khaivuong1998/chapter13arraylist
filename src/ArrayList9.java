import java.util.ArrayList;
import java.util.Collections;

public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("h");
        arrayList.add("t");
        arrayList.add("d");
        arrayList.add("f");
        Collections.swap(arrayList, 0, 3);
        System.out.println(arrayList);
    }
}
