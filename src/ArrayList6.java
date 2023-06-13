import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("g");
        arrayList.add("e");
        arrayList.add("tr");
        arrayList.add("ng");
        arrayList.add("L");
        System.out.println("nhập phần tử muốn tìm");
        String str = scanner.next();
        if (arrayList.contains(str)) {
            System.out.println("phần tử " + str + " có trong mảng");
        } else {
            System.out.println("phần tử " + str + " không có trong mảng");
        }
    }
}
