import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayList7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(43);
        arrayList.add(54);
        arrayList.add(6);
        arrayList.add(19);
        arrayList.add(223);
        arrayList.add(90);
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
