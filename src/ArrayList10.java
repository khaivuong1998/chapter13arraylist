import java.util.ArrayList;

public class ArrayList10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("u");
        arrayList.add("i");
        arrayList.add("o");
        arrayList.add("p");
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            System.out.println("vị trí " + i + " là phần tử " + str);
        }
    }
}
