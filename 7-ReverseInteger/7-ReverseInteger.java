// Last updated: 4/24/2026, 8:15:27 AM
class Solution {
    public int reverse(int x) {
        int revNum = 0;
        boolean negativeFlag = false;
        if (x < 0) {
            negativeFlag = true;
            x = Math.abs(x);
        }
        while (x > 0) {
            int lastDigit = x % 10;
            // if (Math.log(revNum) + 1 == 10 && revNum * 10 < Integer.MAX_VALUE)
            //     return 0;
            
            try {
                int revNumMultiply = Math.multiplyExact(revNum, 10);
                //System.out.println("revNumMultiply: " + revNumMultiply);
                int revNumAdd = Math.addExact(revNumMultiply, lastDigit);
                revNum = revNumAdd;
            } catch (ArithmeticException e) {
                return 0;
            }
            //revNum = revNum * 10 + lastDigit;
            x = x / 10;
        }
        return negativeFlag ? -revNum : revNum;
    }
}