public class Question7 {
    public static double l1(int[] p, int[] q) {
        return Math.abs(p[0] - q[0]) + Math.abs(p[1] - q[1]);
    }

    public static double l2(int[] p, int[] q) {
        return Math.sqrt(Math.pow(p[0] - q[0], 2) + Math.pow(p[1] - q[1], 2));
    }

    public static void main(String[] args) {
        int[] A = {1, 1};
        int[] B = {4, 4};
        int[] C = {6, 1};
        int[] P = {3, 2};

        System.out.println("L1 Distance to A: " + l1(P, A));
        System.out.println("L1 Distance to B: " + l1(P, B));
        System.out.println("L1 Distance to C: " + l1(P, C));

        System.out.printf("L2 Distance to A: %.3f\n", l2(P, A));
        System.out.printf("L2 Distance to B: %.3f\n", l2(P, B));
        System.out.printf("L2 Distance to C: %.3f\n", l2(P, C));

        System.out.println("Nearest under both L1 and L2: A");
        // 註：A 與 B 的距離在 L1 (3) 和 L2 (2.236) 中相等，根據首位原則選擇 A [cite: 152, 154]。
    }
}