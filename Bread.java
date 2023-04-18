import java.util.ArrayList;
import java.util.List;

public class Bread {

    public static void main(String[] args) {
        List<String> bread = new ArrayList<>();

        bread.add("メロンパン");
        bread.add("食パン");
        bread.add("カレーパン");
        bread.add("クロワッサン");

        System.out.println("人気のパン４種類です。");
        System.out.println(bread.get(0));
        System.out.println(bread.get(1));
        System.out.println(bread.get(2));
        System.out.println(bread.get(3));

        System.out.println("人気のパン４種類です。");
        for (int i = 0, breadSize = bread.size(); i < breadSize; i++) {
            String s = bread.get(i);
            System.out.println(s);
        }

        System.out.println("人気のパン４種類です。");
        for (String str : bread) {
            System.out.println(str);
        }
    }
}


