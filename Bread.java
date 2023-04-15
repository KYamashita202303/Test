import java.util.ArrayList;
import java.util.List;

public class Bread {

    public static void main (String[] args) {
        List<String> bread =new ArrayList<>();

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
        for (int i = 0; i < bread.size(); i ++) {
            System.out.println((bread.get(i)));
        }

        System.out.println("人気のパン４種類です。");
        for (String str : bread) {
            System.out.println(str);
        }
    }
}


