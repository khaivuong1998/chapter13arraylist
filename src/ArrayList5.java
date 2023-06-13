import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("g");
        arrayList.add("d");
        arrayList.add("y");
        arrayList.add("u");
        arrayList.add("i");
        arrayList.remove(2);
//        for (String list : arrayList) {
//            System.out.println(list);
//        }
        System.out.println(arrayList);
    }
}
