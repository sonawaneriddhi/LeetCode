class Solution {
    public double myPow(double x, int n) {
        long lPower = n;  

        if (lPower < 0)
        {
            x = 1 / x;
            lPower = -lPower;
        }

        double iResult = 1.0;

        while (lPower > 0)
        {
            if ((lPower & 1) == 1)
            {   // if power is odd
                iResult *= x;
            }
            x = x *x;       // Squaring the base
            lPower >>= 1;  // divide power by 2 (using bit manupulation)
        }

        return iResult;
    }
}