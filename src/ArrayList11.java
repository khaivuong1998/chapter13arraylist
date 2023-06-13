import java.util.ArrayList;

public class ArrayList11 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("u");
        arrayList.add("v");
        arrayList.add("r");
        arrayList.add("h");
        arrayList.add("t");
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("q");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        System.out.println(arrayList2);
    }
}
