class Solution {
    public boolean isPalindrome(int x) {
        
        int iOriginal = x;

        if(x < 0)
        {
            x = -x;
        }

        int iDigit = 0;
        int iReverse = 0;

        while(x != 0)
        {
            iDigit = x % 10;
            x = x / 10;

            iReverse = iReverse * 10 + iDigit ;
        }

        if(iOriginal == iReverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}