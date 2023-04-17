import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<TennisPlayer> tennisPlayerList = List.of(new TennisPlayer(10, 4),
                new TennisPlayer(11 , 2),
                new TennisPlayer(10, 1));

        System.out.println("第１回テニス大会の");
        System.out.println("順位発表です！");

        for (TennisPlayer TennisPlayer : tennisPlayerList) {
            if (TennisPlayer.getScore() == 4) {
                System.out.println("第1位は" + TennisPlayer.getScore() + "ゲーム獲得で" + TennisPlayer.getAge() + "歳" + "山下選手です");
            } else if (TennisPlayer.getScore() >= 2) {
                System.out.println("第2位は" + TennisPlayer.getScore() + "ゲーム獲得で" + TennisPlayer.getAge() + "歳" + "高橋選手です");
            } else if (TennisPlayer.getScore() >= 1) {
                System.out.println("第3位は" + TennisPlayer.getScore() + "ゲーム獲得で" + TennisPlayer.getAge() + "歳" + "佐藤選手です");
            }
        }
    }
}













