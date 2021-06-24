public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String condensed = "";
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            int index = (int) s.charAt(i);
            if ((index >= 48 && index <= 57) || (index >= 97 && index <= 122)) {
                condensed += s.charAt(i);
            }
        }

        for (int i = 0; i < condensed.length() / 2; i++) {
            int end = condensed.length() - 1 - i;
            if (condensed.charAt(i) != condensed.charAt(end)) {
                return false;
            }
        }
        return true;
    }
}
