import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<TennisPlayer> tennisPlayerList = List.of(new TennisPlayer(10, 4, "山下選手"),
                new TennisPlayer(11, 2, "高橋選手"),
                new TennisPlayer(10, 1, "佐藤選手"));

        System.out.println("第１回テニス大会の");
        System.out.println("順位発表です！");

        for (TennisPlayer TennisPlayer : tennisPlayerList)
            if (TennisPlayer.getScore() == 4) {
                System.out.println("第1位は" + TennisPlayer.getScore() + "ゲーム獲得で" + TennisPlayer.getAge() + "歳" + TennisPlayer.getName() + "です");
            } else if (TennisPlayer.getScore() >= 2)
                System.out.println("第2位は" + TennisPlayer.getScore() + "ゲーム獲得で" + TennisPlayer.getAge() + "歳" + TennisPlayer.getName() + "です");
              else if (TennisPlayer.getScore() >= 1)
                System.out.println("第3位は" + TennisPlayer.getScore() + "ゲーム獲得で" + TennisPlayer.getAge() + "歳" + TennisPlayer.getName() + "です");
    }
}














