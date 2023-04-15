import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<TennisplayerList> TennisPlayerlist = List.of(new TennisplayerList("山下選手です", 10, 4),
                new TennisplayerList("佐藤選手です", 11, 2),
                new TennisplayerList("高橋選手です", 10, 1));

        System.out.println("第１回テニス大会の");
        System.out.println("順位発表です！");
        for (TennisplayerList tennisplayer : TennisPlayerlist) {
            if (tennisplayer.getScore() == 4) {
                System.out.println("第1位は" + tennisplayer.getScore() + "ゲーム獲得で" + tennisplayer.getAge() + "歳" + tennisplayer.getName());
            } else if (tennisplayer.getScore() >= 2) {
                System.out.println("第2位は" + tennisplayer.getScore() + "ゲーム獲得で" + tennisplayer.getAge() + "歳" + tennisplayer.getName());
            } else if (tennisplayer.getScore() >= 1) {
                System.out.println("第3位は" + tennisplayer.getScore() + "ゲーム獲得で" + tennisplayer.getAge() + "歳" + tennisplayer.getName());
            }
        }
    }
}













