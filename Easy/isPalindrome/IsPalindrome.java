public class IsPalindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String num = Integer.toString(x);

        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome palindrome = new IsPalindrome();

        int test1 = 121;
        int test2 = 1221;
        int test3 = -121;
        int test4 = 1234;

        boolean result1 = palindrome.isPalindrome(test1);
        boolean result2 = palindrome.isPalindrome(test2);
        boolean result3 = palindrome.isPalindrome(test3);
        boolean result4 = palindrome.isPalindrome(test4);

        System.out.println("Test 1 passed: " + result1 + " Expected true.");
        System.out.println("Test 2 passed: " + result2 + " Expected true.");
        System.out.println("Test 3 passed: " + result3 + " Expected false.");
        System.out.println("Test 4 passed: " + result4 + " Expected false.");
    }
}