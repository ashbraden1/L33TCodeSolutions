public class Richest_Cust {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        int curr = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                curr += accounts[i][j];
            }
            if (curr > richest) {
                richest = curr;
            }
            curr = 0;
        }
        return richest;
    }

    public static void main(String[] args) {
        Richest_Cust rc = new Richest_Cust();

        int[][] sample1 = new int[][] { { 1, 2, 3 }, { 3, 2, 1 } };
        int[][] sample2 = new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        int[][] sample3 = new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } };

        int sol1 = 6;
        int sol2 = 17;
        int sol3 = 10;

        int res1 = rc.maximumWealth(sample1);
        int res2 = rc.maximumWealth(sample2);
        int res3 = rc.maximumWealth(sample3);

        System.out.println("Expected 1: " + sol1 + " Observed 1: " + res1);
        System.out.println("Expected 2: " + sol2 + " Observed 1: " + res2);
        System.out.println("Expected 3: " + sol3 + " Observed 1: " + res3);
    }
}
