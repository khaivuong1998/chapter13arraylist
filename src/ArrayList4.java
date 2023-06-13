import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("r");
        list.add("a");
        list.add("b");
        list.add("c");
        list.set(2, "tam");
        for (String listArray : list) {
            System.out.println(listArray);
        }
    }
}
