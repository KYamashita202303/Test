import java.util.ArrayList;
import java.util.List;

public class bread {

    public static void main (String[] args) {
        List<String> bread =new ArrayList<>();

        bread.add("メロンパン150円");
        bread.add("クリームパン200円");
        bread.add("カレーパン250円");
        bread.add("クロワッサン180円");

        System.out.println(bread.get(0));
        System.out.println(bread.get(1));
        System.out.println(bread.get(2));
        System.out.println(bread.get(3));
    }
}


