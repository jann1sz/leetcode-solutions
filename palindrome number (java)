class Solution {
    public boolean isPalindrome(int x) {
        
        String orNum = Integer.toString(x);
        
        char [] originalNum =  new char [orNum.length()];
        char [] reversedNum = new char [orNum.length()];
        
        int i;
        int j;
        int start = 0;
        
        for (i = 0; i < orNum.length(); ++i) {
            originalNum[i] = orNum.charAt(i);
        }
        for (j = orNum.length()-1; j >=0; --j) {
            reversedNum[j] = orNum.charAt(start);
            ++start;
        }
        
        for(i = 0; i < orNum.length(); ++i) {
            if (reversedNum[i] != originalNum[i]) {
                return false;
            }
            
        }
        return true;
    }
}
