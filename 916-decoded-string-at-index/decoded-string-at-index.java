class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;

        // Step 1: Calculate decoded string length
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                size *= ch - '0';
            } else {
                size++;
            }
        }

        // Step 2: Find the kth character backward
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            k %= size;

            if (Character.isDigit(ch)) {
                size /= ch - '0';
            } else {
                if (k == 0) {
                    return String.valueOf(ch);
                }

                size--;
            }
        }

        return "";
    }
}