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

}
