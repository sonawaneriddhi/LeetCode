class Solution {
    public int reverse(int x)
    {
        int iReverse = 0;
        int iDigit = 0;

        while (x != 0) {
            iDigit = x % 10;
            x /= 10;

            // Checking overflow of datatype before multiplying and adding up
            if (iReverse > Integer.MAX_VALUE/10 || (iReverse == Integer.MAX_VALUE/10 && iDigit > 7)) {
                return 0;
            }
            if (iReverse < Integer.MIN_VALUE/10 || (iReverse == Integer.MIN_VALUE/10 && iDigit < -8)) {
                return 0;
            }

            iReverse = iReverse * 10 + iDigit;
        }
        return iReverse;
    }
}