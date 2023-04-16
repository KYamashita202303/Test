import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<tennisPlayerList> TennisPlayerlist = List.of(new tennisPlayerList("山下選手です", 10, 4),
                new tennisPlayerList("佐藤選手です", 11, 2),
                new tennisPlayerList("高橋選手です", 10, 1));

        System.out.println("第１回テニス大会の");
        System.out.println("順位発表です！");
        for (tennisPlayerList tennisPlayerList : TennisPlayerlist) {
            if (tennisPlayerList.getScore() == 4) {
                System.out.println("第1位は" + tennisPlayerList.getScore() + "ゲーム獲得で" + tennisPlayerList.getAge() + "歳" + tennisPlayerList.getName());
            } else if (tennisPlayerList.getScore() >= 2) {
                System.out.println("第2位は" + tennisPlayerList.getScore() + "ゲーム獲得で" + tennisPlayerList.getAge() + "歳" + tennisPlayerList.getName());
            } else if (tennisPlayerList.getScore() >= 1) {
                System.out.println("第3位は" + tennisPlayerList.getScore() + "ゲーム獲得で" + tennisPlayerList.getAge() + "歳" + tennisPlayerList.getName());
            }
        }
    }
}













