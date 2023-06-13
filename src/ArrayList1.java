import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("nhập chuỗi bất kỳ");
        String str = scanner.next();
        list.add(str);
        for (String a : list) {
            System.out.println(a);
        }
    }
}
