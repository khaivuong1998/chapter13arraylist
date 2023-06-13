import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("k");
        list.add("h");
        list.add("t");
        list.add("gh");
        list.add("o");
        System.out.println(list.get(3));
    }
}
