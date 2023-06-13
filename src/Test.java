import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> codes = new ArrayList<>();
        codes.add("jsp");
        codes.add("mysql");
        codes.add("java");
        String lastCodes = codes.get(codes.size() - 1);
        for (String code : codes) {
            System.out.println(code);
        }
        codes.set(2, "android");
        codes.add(2, "iphone");
        System.out.println(codes.indexOf("android"));
        System.out.println(codes.get(1));
        System.out.println(codes.isEmpty());
        String code = codes.remove(1);
        codes.remove(codes.get(1));
        for (String code1 : codes) {
            System.out.println(code1);
        }
        String searchCode = "android";
        if (codes.contains(searchCode)) {
            System.out.println("The list contains: '" + searchCode + "'");
        }
    }
}
