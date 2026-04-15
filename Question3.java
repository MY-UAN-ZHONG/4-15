import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static List<Integer> minCoins(int amount) {
        int[] coins = {25, 10, 5, 1};
        List<Integer> used = new ArrayList<>();
        
        for (int coin : coins) {
            while (amount >= coin) {
                amount -= coin;
                used.add(coin);
            }
        }
        return used;
    }

    public static void main(String[] args) {
        List<Integer> used = minCoins(63);
        System.out.println(used.size() + " coins; " + used);
        // 預期輸出: 6 coins; [25, 25, 10, 1, 1, 1]
    }
}