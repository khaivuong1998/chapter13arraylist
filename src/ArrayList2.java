import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("nhập chuỗi bất kỳ");
        String str = scanner.next();
        list.add(str);
        System.out.println("nhập ký tự muốn chèn");
        String str1 = scanner.next();
        list.add(0, str1);
        for (String a : list) {
            System.out.print(a);
        }
    }
}
