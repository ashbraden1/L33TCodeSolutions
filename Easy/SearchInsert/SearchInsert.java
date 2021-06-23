public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int mid = (first + last) / 2;

        while (first <= last) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;

        }
        return first;
    }

    public static void main(String[] args) {
        int[] input1 = { 1, 3, 5, 6 };
        int[] input2 = { 1, 3 };
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;

        int expected1 = 2;
        int expected2 = 1;
        int expected3 = 4;
        int expected4 = 0;
        int expected5 = 0;

        SearchInsert si = new SearchInsert();

        int result1 = si.searchInsert(input1, target1);
        int result2 = si.searchInsert(input1, target2);
        int result3 = si.searchInsert(input1, target3);
        int result4 = si.searchInsert(input1, target4);
        int result5 = si.searchInsert(input2, target4);

        System.out.println("Expected " + expected1 + " Observed " + result1);
        System.out.println("Expected " + expected2 + " Observed " + result2);
        System.out.println("Expected " + expected3 + " Observed " + result3);
        System.out.println("Expected " + expected4 + " Observed " + result4);
        System.out.println("Expected " + expected5 + " Observed " + result5);
    }
}
